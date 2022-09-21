package com.rundeck.feature.api.event;

import com.rundeck.feature.api.model.CompletionStatus;

public interface ActionCompleteEvent extends ActionEvent {

    CompletionStatus getStatus();

}
