package com.rundeck.feature.api.event;

import java.util.Map;

public interface ExecuteFeatureActionEvent extends ActionEvent {
    String getFeature();
    String getAction();
    Map<String,Object> getActionData();
}
