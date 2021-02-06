package com.company.Project;

import com.company.Employee.EmployeeModal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProjectRepository {

private static List<ProjectModal> projectList=new ArrayList<>();

public void saveProject(ProjectModal projectModal)
{
    projectList.add(projectModal);
}
public List<ProjectModal> fetchAll()
{
    return projectList;
}
    public List<EmployeeModal> getAllEmployeesForProj(int projId){

        List<EmployeeModal> empResponse = new ArrayList<EmployeeModal>();

        for(ProjectModal proj : projectList){
            if(proj.getpId() == projId) {
                empResponse = proj.getEmployee();
            }
                    empResponse= Collections.emptyList();

        }
        return empResponse;
    }

}
