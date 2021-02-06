package com.company.Employee;

import java.util.Objects;

public class EmployeeModal {
    String ename;
    int empid;
    int age;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEmpid() {
        return empid;
    }

       public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "EmployeeModal{" +
                "ename='" + ename + '\'' +
                ", empid=" + empid +
                ", age=" + age +
                '}';
    }


    public void setAge(int age) {
        this.age = age;
    }
}
