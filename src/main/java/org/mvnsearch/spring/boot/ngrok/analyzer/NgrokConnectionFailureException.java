package org.mvnsearch.spring.boot.ngrok.analyzer;

/**
 * ngrok connection failure Exception
 *
 * @author linux_china
 */
public class NgrokConnectionFailureException extends RuntimeException {

    public NgrokConnectionFailureException(Exception e) {
        super(e);
    }
}
