package com.exponent;

import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
        	System.out.println("*****************************************");
            System.out.println("*          PAYROLL SYSTEM MENU          *");
            System.out.println("*****************************************");
            System.out.println("* 1. Add Full-Time Employee             *");
            System.out.println("* 2. Add Part-Time Employee             *");
            System.out.println("* 3. Display All Employees              *");
            System.out.println("* 4. Remove Employee                    *");
            System.out.println("* 5. Exit                               *");
            System.out.println("*****************************************");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int fId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Name: ");
                    String fName = scanner.nextLine();
                    System.out.print("Enter Monthly Salary: ");
                    double salary = scanner.nextDouble();
                    payrollSystem.addEmployee(new FullTimeEmployee(fId, fName, salary));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int pId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String pName = scanner.nextLine();
                    System.out.print("Enter Hours Worked: ");
                    int hours = scanner.nextInt();
                    System.out.print("Enter Hourly Rate: ");
                    double rate = scanner.nextDouble();
                    payrollSystem.addEmployee(new PartTimeEmployee(pId, pName, hours, rate));
                    break;

                case 3:
                    payrollSystem.displayEmployees();
                    break;

                case 4:
                    System.out.print("Enter Employee ID to remove: ");
                    int rId = scanner.nextInt();
                    payrollSystem.removeEmployee(rId);
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
