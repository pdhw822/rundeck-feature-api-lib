package com.rundeck.feature.api.event;

public interface ActionStartEvent extends ActionEvent {
    String getFeature();
    String getAction();
}
