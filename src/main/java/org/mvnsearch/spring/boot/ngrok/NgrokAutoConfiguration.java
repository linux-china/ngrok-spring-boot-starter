package org.mvnsearch.spring.boot.ngrok;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PreDestroy;

/**
 * ngrok auto configuration
 *
 * @author linux_china
 */
@Configuration
public class NgrokAutoConfiguration {
    private Logger log = LoggerFactory.getLogger(NgrokAutoConfiguration.class);

    @Value("${server.port:8080}")
    private Integer serverPort;

    @Bean
    NgrokTunnel ngrokTunnel() throws Exception {
        NgrokTunnel ngrokTunnel = new NgrokTunnel(serverPort);
        ngrokTunnel.start();
        log.info("ngrok public url:" + ngrokTunnel.getPublicUrl());
        return ngrokTunnel;
    }

    @PreDestroy
    public void destroy() throws Exception {
        ngrokTunnel().close();
    }

    @Bean
    public NgrokEndpoint ngrokEndpoint() {
        return new NgrokEndpoint();
    }
}
