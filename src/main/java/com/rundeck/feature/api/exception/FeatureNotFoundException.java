package com.rundeck.feature.api.exception;

public class FeatureNotFoundException extends RuntimeException {

    public FeatureNotFoundException(String featureName) {
        super(String.format("Feature: %s not found", featureName));
    }
}
