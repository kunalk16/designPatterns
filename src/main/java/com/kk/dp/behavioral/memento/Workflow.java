package com.kk.dp.behavioral.memento;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Workflow {
    private final String name;

    private final List<String> steps;

    public Workflow(String name) {
        this.name = name;
        this.steps = new LinkedList<>();
    }

    public Workflow(String name, String...steps) {
        this.name = name;
        this.steps = new LinkedList<>(Arrays.asList(steps));
    }

    public String getName() {
        return this.name;
    }

    public String[] getSteps() {
        return this.steps.toArray(new String[0]);
    }

    public void addStep(String step) {
        this.steps.add(step);
    }

    public void removeStep(String step) {
        this.steps.remove(step);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Workflow [name=");
        builder.append(name).append("]\nBEGIN -> ");
        for(String step : steps) {
            builder.append(step).append(" -> ");
        }
        builder.append("END");
        return builder.toString();
    }
}
