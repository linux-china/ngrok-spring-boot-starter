package org.mvnsearch.spring.boot.ngrok;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.UUID;

/**
 * ngrok tunnel
 *
 * @author linux_china
 */
public class NgrokTunnel {
    private TunnelDetail detail;
    private String name;
    private final String ngrokAddr;
    private RestTemplate restTemplate;
    private int localPort;

    public NgrokTunnel(String url, int port) throws IOException {
        restTemplate = new RestTemplateBuilder().rootUri(url).build();
        this.name = UUID.randomUUID().toString();
        this.ngrokAddr = url;
        this.localPort = port;

    }

    public NgrokTunnel(int port) throws IOException {
        this("http://127.0.0.1:4040", port);
    }

    public void start() throws IOException {
        String payload = String.format("{\"addr\":\"%d\", \"name\":\"%s\", \"proto\":\"http\", \"bind_tls\":\"false\"}", localPort, name);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(payload, headers);
        detail = restTemplate.postForEntity("/api/tunnels", entity, TunnelDetail.class).getBody();
    }

    public String getPublicUrl() {
        return detail.getPublic_url();
    }

    public String getName() {
        return name;
    }

    public TunnelDetail getDetail() {
        return detail;
    }

    public void close() {
        restTemplate.delete(ngrokAddr.concat("/api/tunnels/" + name));
    }


}
