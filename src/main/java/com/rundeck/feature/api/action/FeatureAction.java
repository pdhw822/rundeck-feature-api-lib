package com.rundeck.feature.api.action;

import com.rundeck.feature.api.context.FeatureActionContext;

/**
 * A FeatureAction contains code that provides a discrete business value
 * to a user who executes the action.
 *
 * FeatureActions are intended to be initiated by web requests or by events
 * send to a subscriber that handles feature action requests. The initiator will be
 * given an action id that can be used to check on the execution progress of the action
 * and look up any output that the action might have produces.
 *
 * Actions are always intended to be executed asynchronously
 *
 * @param <T>
 */
public interface FeatureAction<T> {
    String getName();

    String getDescription();
    void execute(FeatureActionContext context);
    Class<T> getFeatureActionDataClass();

    T getSampleActionData();
}
