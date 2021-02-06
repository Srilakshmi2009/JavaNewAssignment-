package com.company.Employee;

import com.company.Project.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Main {
   static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

       EmployeeController empcontroller = new EmployeeController();
        int i = 0;
        while (i < 3) {
            System.out.println("enter employee name");
            String name = sc.next();
            System.out.println("enter employee age");
            int age = sc.nextInt();
            System.out.println("enter employee id");
            int id = sc.nextInt();
            empcontroller.createEmp(name, age, id);
            i++;
        }
        System.out.println("Employees");
        empcontroller.displayAll();

        System.out.println("enter empId to delete");
        int empId=sc.nextInt();
        empcontroller.deleteemployee(empId);
        empcontroller.displayAll();
         System.out.println("enter empId to Update");
        int eId=sc.nextInt();
        empcontroller.updateEmployee(eId,"uma");
        empcontroller.displayAll();

       System.out.println("After Sorting by Age");
        empcontroller.sortByAge();
      System.out.println("After Sorting by Name");
       empcontroller.sortByName();

       List<EmployeeModal> emplist=new ArrayList<>();
        projectController projectController = new projectController();
        int j = 0;
        while (j < 3) {
            System.out.println("enter project name");
            String name = sc.next();
            System.out.println("enter project id");
            int id = sc.nextInt();

            projectController.createProject(name,id);
            j++;
        }
       projectController.displayAll();

       projectController.assignEmployees(1,1);
       projectController.assignEmployees(2,2);
       projectController.assignEmployees(3,3);
       projectController.getAllEmployeesForProjectId(1);
    }
}
