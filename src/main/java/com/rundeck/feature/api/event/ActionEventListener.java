package com.rundeck.feature.api.event;

import com.rundeck.feature.api.output.ActionOutputEvent;

public interface ActionEventListener {
    void onStart(ActionStartEvent evt);
    void onOutput(ActionOutputEvent evt);
    void onComplete(ActionCompleteEvent evt);
    void onExecute(ExecuteFeatureActionEvent evt);
}
