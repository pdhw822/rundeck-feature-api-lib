package com.rundeck.feature.api.event;

public interface ExecuteFeatureActionEvent extends ActionEvent {
    String getFeature();
    String getAction();
    String getActionDataJson();
}
