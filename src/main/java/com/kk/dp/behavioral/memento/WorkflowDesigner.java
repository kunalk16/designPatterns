package com.kk.dp.behavioral.memento;

public class WorkflowDesigner {
    private Workflow workflow;

    public void createWorkflow(String name) {
        this.workflow = new Workflow(name);
    }

    public Workflow getWorkflow() {
        return this.workflow;
    }

    public Memento getMemento() {
        if(workflow == null) {
            return new Memento();
        }
        return new Memento(workflow.getName(), workflow.getSteps());
    }

    public void setMemento(Memento memento) {
        if(memento.isEmpty()) {
            this.workflow = null;
        }else {
            this.workflow = new Workflow(memento.getName(), memento.getSteps());
        }
    }

    public void addStep(String step) {
        this.workflow.addStep(step);
    }

    public void removeStep(String step) {
        this.workflow.removeStep(step);
    }

    public void print() {
        System.out.println(this.workflow);
    }

    public static class Memento {
        private final String[] steps;
        private final String name;

        private Memento() {
            this.name = null;
            this.steps = null;
        }

        private Memento(String name, String...steps) {
            this.name = name;
            this.steps = steps;
        }

        private String[] getSteps() {
            return this.steps;
        }

        private String getName() {
            return this.name;
        }

        private boolean isEmpty() {
            return this.name == null && this.steps == null;
        }
    }
}
