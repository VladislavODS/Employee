package com.company;

public class EmployeeNamePrinter implements Printer {
    @Override
    public void print(Employee employee) {

        if (employee.firstName.isEmpty() || employee.lastName.isEmpty()) {
            System.out.println("First Name or Last Name cannot be empty");
        }
        else {
            System.out.println("First name: " + employee.firstName);
            System.out.println("Vlad name: " + employee.lastName);
        }
    }
}
