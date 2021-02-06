package com.company.Employee;

import java.util.List;

public class EmployeeController {

    EmployeeService empservice=new EmployeeService();

    public void createEmp(String name,int age,int id) {
        empservice.createEmployee(name,id,age);
    }

    public void displayAll()
    {
        empservice.listallEmployees();
    }
    public void deleteemployee(int empid)
    {
        empservice.deleteemployee(empid);
    }
    public void updateEmployee(int empId,String name)
    {
        empservice.updateEmployee(empId,name);
    }
    public void sortByAge()
    {
        List<EmployeeModal> emplist= empservice.sortByAge();
        for(EmployeeModal e:emplist)
            System.out.println(e);
    }
    public void sortByName()
    {
        List<EmployeeModal> emplist= empservice.sortByEmpName();
        for(EmployeeModal e:emplist)
            System.out.println(e);
    }

}
