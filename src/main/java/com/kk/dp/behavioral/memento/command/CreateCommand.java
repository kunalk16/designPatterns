package com.kk.dp.behavioral.memento.command;

import com.kk.dp.behavioral.memento.WorkflowDesigner;

public class CreateCommand extends AbstractWorkflowCommand {
    private final String name;

    public CreateCommand(WorkflowDesigner receiver, String name) {
        super(receiver);
        this.name = name;
    }

    @Override
    public void execute() {
        this.memento = this.receiver.getMemento();

        this.receiver.createWorkflow(name);
    }
}
