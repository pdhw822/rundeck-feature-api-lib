package com.rundeck.feature.api.registry;

import com.rundeck.feature.api.Feature;
import com.rundeck.feature.api.action.FeatureAction;

import java.util.Collection;

/**
 * A FeatureRegistry loads and configures ProcessAutomationFeatures.
 * It toggles the enabled and running states for features and provides
 * a shortcut for accessing FeatureActions
 */
public interface FeatureRegistry {
    Collection<Feature<?>> listFeatures();
    Feature<?> getFeature(String feature);
    FeatureAction<?> getFeatureAction(String feature, String action);
    void toggleFeature(String feature, boolean enable);
    void toggleRunning(String feature, boolean running);
}
