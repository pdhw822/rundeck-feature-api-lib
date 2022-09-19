package com.rundeck.feature.api.event;

public interface ActionCompleteEvent extends ActionEvent {

    CompletionStatus getStatus();

    enum CompletionStatus {
        SUCCESS,
        ABORTED,
        ERROR
    }
}
