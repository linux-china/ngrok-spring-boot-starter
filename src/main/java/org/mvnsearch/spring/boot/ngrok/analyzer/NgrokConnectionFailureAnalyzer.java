package org.mvnsearch.spring.boot.ngrok.analyzer;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * ngrok connection failure analyzer
 *
 * @author linux_china
 */
public class NgrokConnectionFailureAnalyzer extends AbstractFailureAnalyzer<NgrokConnectionFailureException> {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, NgrokConnectionFailureException cause) {
        return new FailureAnalysis("No ngrok client agency started", "ngrok start --none", cause);

    }
}
