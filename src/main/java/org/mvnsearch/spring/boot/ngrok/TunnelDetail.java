package org.mvnsearch.spring.boot.ngrok;

import java.util.HashMap;
import java.util.Map;

/**
 * tunnel detail
 *
 * @author linux_china
 */
public class TunnelDetail {
    private String name;
    private String uri;
    private String public_url;
    private String proto;
    private Map<String, Object> config = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getPublic_url() {
        return public_url;
    }

    public void setPublic_url(String public_url) {
        this.public_url = public_url;
    }

    public String getProto() {
        return proto;
    }

    public void setProto(String proto) {
        this.proto = proto;
    }

    public Map<String, Object> getConfig() {
        return config;
    }

    public void setConfig(Map<String, Object> config) {
        this.config = config;
    }
}
