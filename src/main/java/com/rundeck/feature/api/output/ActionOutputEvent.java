package com.rundeck.feature.api.output;

import com.rundeck.feature.api.event.ActionEvent;

public interface ActionOutputEvent extends ActionEvent {
    OutputLevel getLevel();
    String getMessage();
}
