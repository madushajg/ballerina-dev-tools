package io.ballerina.sequencemodelgenerator.core.model;


public class EndpointActionStatement extends Interaction{
    private String actionName;
    private String actionPath;
    private String methodName;

    private Constants.ActionType actionType;

    // TODO: add the query params

    public EndpointActionStatement(String sourceId, String targetId, String actionName, String methodName, String actionPath, boolean isHiddenInSequenceDiagram, Constants.ActionType actionType) {
        super(sourceId, targetId, "EndpointInteraction", isHiddenInSequenceDiagram);
        this.actionName = actionName;
        this.methodName = methodName;
        this.actionPath = actionPath;
        this.actionType = actionType;
    }
}
