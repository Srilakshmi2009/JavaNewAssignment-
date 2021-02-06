package com.company.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {
    EmployeeRepository empRepo=new EmployeeRepository();

    public  void createEmployee(String name,int id,int age)
    {
        EmployeeModal employee=new EmployeeModal();
        employee.setAge(age);
        employee.setEmpid(id);
        employee.setEname(name);

        empRepo.saveEmployee(employee);
    }
    public void  listallEmployees()
    {
        List<EmployeeModal> EmployeeList= empRepo.fetchAll();
        for(EmployeeModal emp:EmployeeList) System.out.println(emp);
    }
    public void deleteemployee(int empid)
    {
        List<EmployeeModal> emplist=empRepo.fetchAll();
        for(EmployeeModal emp:emplist) { if(emp.getEmpid()==empid) emplist.remove(emp);}
    }
    public void updateEmployee(int empid,String name)
    {
        List<EmployeeModal> emplist=empRepo.fetchAll();
        for(EmployeeModal emp:emplist) { if(emp.getEmpid()==empid) emp.setEname(name);}
    }

    public List<EmployeeModal> sortByAge()
    {
        List<EmployeeModal> emplist=empRepo.fetchAll();
        Collections.sort(emplist, new EmployeeAgeComparator());
        return emplist;
    }
    public List<EmployeeModal> sortByEmpid()
    {
        List<EmployeeModal> emplist=empRepo.fetchAll();
        Collections.sort(emplist, new Comparator<EmployeeModal>() {
            @Override
            public int compare(EmployeeModal o1, EmployeeModal o2) {
                return o1.getEmpid()-o2.getEmpid();
            }
        });
        return emplist;
    }
    public List<EmployeeModal> sortByEmpName()
    {
        List<EmployeeModal> emplist=empRepo.fetchAll();
        Collections.sort(emplist, new Comparator<EmployeeModal>() {
            @Override
            public int compare(EmployeeModal o1, EmployeeModal o2) {
                return o1.getEname().compareTo(o2.getEname());
            }
        });

        return emplist;
    }
 public EmployeeModal getEmployeeById(int empid)
 {
     List<EmployeeModal> emplist=empRepo.fetchAll();
      for (EmployeeModal emp : emplist) {
             if (emp.getEmpid() == empid) return emp;
      }
     return  (EmployeeModal) Collections.emptyList();
 }
}
