package com.kk.dp.behavioral.memento.command;

import com.kk.dp.behavioral.memento.WorkflowDesigner;

public abstract class AbstractWorkflowCommand implements WorkflowCommand {
    protected WorkflowDesigner.Memento memento;

    protected final WorkflowDesigner receiver;

    protected AbstractWorkflowCommand(WorkflowDesigner receiver) {
        this.receiver = receiver;
    }

    @Override
    public void undo() {
        this.receiver.setMemento(memento);
    }
}
