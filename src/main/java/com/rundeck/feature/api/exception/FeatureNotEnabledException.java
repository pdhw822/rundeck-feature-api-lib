package com.rundeck.feature.api.exception;

public class FeatureNotEnabledException extends RuntimeException {

    public FeatureNotEnabledException(String featureName) {
        super(String.format("Feature: %s not enabled", featureName));
    }
}
