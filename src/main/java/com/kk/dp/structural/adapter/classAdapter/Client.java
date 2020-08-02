package com.kk.dp.structural.adapter.classAdapter;

public class Client {
    public static void main(String[] args) {
        EmployeeCustomerAdapter adapter = new EmployeeCustomerAdapter();
        fetchEmployeeDetails(adapter);

        System.out.println(createCard(adapter));
    }

    private static String createCard(Customer customer) {
        return customer.getFullName() + "\n" +
                customer.getDesignation() + "\n" +
                customer.getAddress();
    }

    private static void fetchEmployeeDetails(Employee employee) {
        employee.setName("Mark");
        employee.setPosition("Engineer");
        employee.setOfficeAddress("Denmark");
    }
}
