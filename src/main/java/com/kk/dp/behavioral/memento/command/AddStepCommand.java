package com.kk.dp.behavioral.memento.command;

import com.kk.dp.behavioral.memento.WorkflowDesigner;

public class AddStepCommand extends AbstractWorkflowCommand {
    private final String step;

    public AddStepCommand(WorkflowDesigner receiver, String step) {
        super(receiver);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = this.receiver.getMemento();

        this.receiver.addStep(this.step);
    }
}
