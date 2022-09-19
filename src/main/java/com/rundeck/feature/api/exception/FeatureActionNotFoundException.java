package com.rundeck.feature.api.exception;

public class FeatureActionNotFoundException extends RuntimeException {

    private String feature;
    private String action;
    public FeatureActionNotFoundException(String feature, String action) {
        super(String.format("Action: %s not found in Feature: %s", action, feature));
        this.feature = feature;
        this.action = action;
    }

    public String getFeature() {
        return feature;
    }

    public String getAction() {
        return action;
    }
}
