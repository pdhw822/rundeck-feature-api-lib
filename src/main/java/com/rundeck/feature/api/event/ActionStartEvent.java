package com.rundeck.feature.api.event;

public interface ActionStartEvent extends ActionEvent {
    String getInitiator();
    String getFeature();
    String getAction();
}
