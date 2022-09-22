package com.rundeck.feature.api;

import com.rundeck.feature.api.action.FeatureAction;

import java.util.Collection;
import java.util.Optional;

/**
 * An implementation of this class defines a discrete package of assets
 * that deliver value in a process automation installation.
 *
 * A feature can optionally deliver FeatureActions that provide a single executable operation
 * and contributes the output of the action back to the process automation installation via
 * action events.
 *
 * @param <C> The Config class type that will be used to configure the feature
 */
public interface Feature<C> {
    String getName();
    String getDescription();
    boolean isEnabled();
    void enable();
    void disable();
    void cleanup();
    Collection<FeatureAction<?>> getActions();
    Optional<FeatureAction<?>> getActionByName(String name);
    void configure(C configData);
    C getConfiguration();
    Class<C> getConfigClass();
}
