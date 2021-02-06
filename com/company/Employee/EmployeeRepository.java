package com.company.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository{
    private static List<EmployeeModal> emplist=new ArrayList<EmployeeModal>();

    public boolean saveEmployee(EmployeeModal emp)
    {
        emplist.add(emp);
        return true;
    }
    public List<EmployeeModal> fetchAll()
    {
            return emplist;
    }
}
