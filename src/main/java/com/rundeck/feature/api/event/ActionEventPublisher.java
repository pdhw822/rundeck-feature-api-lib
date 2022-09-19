package com.rundeck.feature.api.event;

import com.rundeck.feature.api.output.ActionOutputEvent;

/**
 * Implementations of this class publish the event data on an event bus
 * with the event name.
 *
 * In some cases like the Spring ApplicationEventPublisher the event name will
 * be ignore and only the event type will be useful for filtering the events
 *
 * All event publishing is assumed to by asynchronous
 */
public interface ActionEventPublisher {
    /**
     * Reserved name for the action output channel.
     * This channel should only be used for output type events.
     */
    public static final String OUTPUT_EVENT_CHANNEL = "action-output";
    /**
     * Reserved name for the action completion channel.
     * This channel should only be used for output type events.
     */
    public static final String COMPLETION_EVENT_CHANNEL = "action-completion";

    /**
     * General purpose publish method that can be used for events that should
     * cause behavior by subscribers. This method is not intended to be used for
     * sending output events or completion events.
     *
     * @param event Any event channel
     * @param eventData The event object
     */
    void publish(String event, ActionEvent eventData);

    /**
     * Specialized channel for publishing output events
     *
     * @param eventData The output data
     */
    void publishOutput(ActionOutputEvent eventData);

    /**
     * Specialized channel for completion events
     * @param eventData Completion status data
     */
    void publishCompletion(ActionCompleteEvent eventData);
}
