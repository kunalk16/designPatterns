package com.kk.dp.behavioral.visitor;

import java.util.*;

public class ProjectLead extends AbstractEmployee {
    private final List<Employee> directReports;

    public ProjectLead(String name, Employee...employees) {
        super(name);
        this.directReports = new ArrayList<>();
        directReports.addAll(Arrays.asList(employees));
    }

    @Override
    public Collection<Employee> getDirectReports() {
        return directReports;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
