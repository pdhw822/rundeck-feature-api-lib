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
 * Features have a full lifecycle, and can be started and stopped as
 * appropriate. This lifecycle is intended to be separate from the enabled/disabled state of the feature
 * within the system. This means that just because a feature is installed and enabled, does not mean
 * it is always in the "running" state. A feature may be enabled, but not running if the user
 * decides that is appropriate.
 *
 * @param <C> The Config class type that will be used to configure the feature
 */
public interface Feature<C> {
    String getName();
    boolean isEnabled();
    boolean isRunning();
    void enable();
    void disable();
    void start();
    void stop();
    Collection<FeatureAction<?>> getActions();
    Optional<FeatureAction<?>> getActionByName(String name);
    void configure(C configData);
    Class<C> getConfigClass();
}
