package com.company.Project;

import com.company.Employee.EmployeeModal;
import com.company.Employee.EmployeeService;

import java.util.Calendar;
import java.util.List;

public class projectController {

    ProjectService projectService=new ProjectService();
    EmployeeService employeeService=new EmployeeService();
        public void createProject(String projectName, int pid)
    {
        projectService.createProject(projectName,pid);
    }
    public void displayAll()
    {
        projectService.listAllProjects();
    }
    public void assignEmployees(int projId,int empId)
    {

         projectService.assignEmployees(projId,empId);

    }
    public void getAllEmployeesForProjectId(int ProjectId)
    {
        projectService.listAllEmployeesForProject(ProjectId);
    }

}
