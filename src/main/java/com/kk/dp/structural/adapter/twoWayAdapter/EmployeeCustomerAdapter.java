package com.kk.dp.structural.adapter.twoWayAdapter;

public class EmployeeCustomerAdapter implements Customer {
    private Employee employee;

    public EmployeeCustomerAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getFullName() {
        return this.employee.getName();
    }

    @Override
    public String getDesignation() {
        return this.employee.getPosition();
    }

    @Override
    public String getAddress() {
        return this.employee.getOfficeAddress();
    }
}
