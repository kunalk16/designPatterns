package com.kk.dp.behavioral.memento.command;

import com.kk.dp.behavioral.memento.WorkflowDesigner;

public class RemoveStepCommand extends AbstractWorkflowCommand {
    private final String step;

    public RemoveStepCommand(WorkflowDesigner receiver, String step) {
        super(receiver);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = this.receiver.getMemento();

        this.receiver.removeStep(step);
    }
}
