package com.exponent;

import java.util.ArrayList;

public class PayrollSystem {
    private ArrayList<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println("Employee added successfully.");
    }

    public void removeEmployee(int id) {
        Employee toRemove = null;
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                toRemove = emp;
                break;
            }
        }

        if (toRemove != null) {
            employeeList.remove(toRemove);
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void displayEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        }
    }
}
