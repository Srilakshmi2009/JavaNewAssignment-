package com.company.Employee;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<EmployeeModal>
{
    @Override
    public int compare(EmployeeModal o1, EmployeeModal o2) {
        if(o1.getAge()==o2.getAge()) return 0;
        else if(o1.getAge()>o2.getAge()) return 1;
        else return -1;
    }
}
