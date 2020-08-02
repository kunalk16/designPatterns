package com.kk.dp.behavioral.visitor;

public interface Visitor {
    void visit(Programmer programmer);

    void visit(ProjectLead projectLead);

    void visit(Manager manager);

    void visit(VicePresident vicePresident);
}
