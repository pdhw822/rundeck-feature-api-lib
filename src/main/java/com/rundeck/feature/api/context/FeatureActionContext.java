package com.rundeck.feature.api.context;

import com.rundeck.feature.api.event.ActionEventPublisher;

/**
 * An instance of this class is created for every action that is executed
 * withing the system. If the action will receive data, this class will
 * contain that data in the key 'action-data'. Any other supporting classes
 * that will be needed by the action will be put into the context by the class
 * that is responsible for invoking the FeatureAction's execute() method.
 *
 * An event publisher must be passed to the context so that the action can communicate
 * with the containing system.
 *
 */
public interface FeatureActionContext {
    String getActionId();
    String getUser();
    String getProducer();
    <T> T get(String key, Class<T> objectType);
    ActionEventPublisher getEventPublisher();
}
