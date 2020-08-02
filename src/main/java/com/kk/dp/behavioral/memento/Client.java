package com.kk.dp.behavioral.memento;

import com.kk.dp.behavioral.memento.command.AddStepCommand;
import com.kk.dp.behavioral.memento.command.CreateCommand;
import com.kk.dp.behavioral.memento.command.WorkflowCommand;

import java.util.LinkedList;

public class Client {
    public static void main(String[] args) {
        WorkflowDesigner designer = new WorkflowDesigner();
        LinkedList<WorkflowCommand> commands = runCommands(designer);
        designer.print();
        commands.removeLast().undo();
        designer.print();
        commands.removeLast().undo();
        designer.print();
        undoLastCommand(commands);
        designer.print();
    }

    private static void undoLastCommand(LinkedList<WorkflowCommand> commands) {
        if (!commands.isEmpty()) {
            commands.removeLast().undo();
        }
    }

    private static LinkedList<WorkflowCommand> runCommands(WorkflowDesigner designer) {
        LinkedList<WorkflowCommand> commands = new LinkedList<>();

        WorkflowCommand cmd = new CreateCommand(designer, "Leave Workflow");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer, "Create Leave Application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer, "Submit Application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer, "Application Approved");
        commands.addLast(cmd);
        cmd.execute();

        return commands;
    }
}
