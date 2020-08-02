package com.kk.dp.structural.adapter.twoWayAdapter;

public class Client {
    public static void main(String[] args) {
        Employee employee = new Employee();
        fetchEmployeeDetails(employee);

        Customer customer = new EmployeeCustomerAdapter(employee);

        System.out.println(createCard(customer));
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
