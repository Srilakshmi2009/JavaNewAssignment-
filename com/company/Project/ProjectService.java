package com.company.Project;

import com.company.Employee.EmployeeModal;
import com.company.Employee.EmployeeService;

import java.util.*;

public class ProjectService {

    ProjectRepository projectRepository=new ProjectRepository();
    EmployeeService employeeService=new EmployeeService();
    public void createProject(String name, int pid)
    { ProjectModal projectModal=new ProjectModal();
        projectModal.setpId(pid);
        projectModal.setProjectName(name);
       // projectModal.setStartDate(date);
     // projectModal.setEmployee(assignEmployees(pid));

        projectRepository.saveProject(projectModal);
    }
    public void listAllProjects()
    {
        List<ProjectModal> projectList= projectRepository.fetchAll();
        for(ProjectModal p:projectList)
            System.out.println(p);
    }
    public void listAllEmployeesForProject(int pid)
    {
        List<EmployeeModal> empProjectList=projectRepository.getAllEmployeesForProj(pid);

        for(EmployeeModal emp:empProjectList)
           System.out.println(emp);
    }
        public void assignEmployees(int projId, int empId){

            EmployeeModal emp = employeeService.getEmployeeById(empId);
           ProjectModal projectModal=new ProjectModal();

            if(projectRepository.getAllEmployeesForProj(projId)!=null)
            {
                projectRepository.getAllEmployeesForProj(projId).add(emp);
            }
            else {
                List<EmployeeModal> emplist = new ArrayList<>();
                emplist.add(emp);
                projectModal.setEmployee(emplist);
            }

               // projectRepository.getAllEmployeesForProj(projId).(emp);

            }
        }





