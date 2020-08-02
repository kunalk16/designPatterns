package com.kk.dp.behavioral.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Manager extends AbstractEmployee {
    private final List<Employee> directReports;

    public Manager(String name, Employee...employees) {
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
