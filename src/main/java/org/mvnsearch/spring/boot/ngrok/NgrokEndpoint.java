package org.mvnsearch.spring.boot.ngrok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ngrok endpoint
 *
 * @author linux_china
 */
public class NgrokEndpoint extends AbstractEndpoint<TunnelDetail> {
    @Autowired
    private NgrokTunnel tunnel;

    public NgrokEndpoint() {
        super("ngrok");
    }

    public TunnelDetail invoke() {
        return tunnel.getDetail();
    }
}
