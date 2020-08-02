package com.kk.dp.structural.adapter.classAdapter;

public class EmployeeCustomerAdapter extends Employee implements Customer {
    @Override
    public String getFullName() {
        return this.getName();
    }

    @Override
    public String getDesignation() {
        return this.getPosition();
    }

    @Override
    public String getAddress() {
        return this.getOfficeAddress();
    }
}
