package com.company.Project;

import com.company.Employee.EmployeeModal;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ProjectModal {
    String projectName;
    int pId;
    Date startDate;//simpledate format
    private List<EmployeeModal> employee;

    public String getProjectName() {
        return projectName;
    }

    public List<EmployeeModal> getEmployee() {
        return employee;
    }

    public void setEmployee(List<EmployeeModal> employee) {
        this.employee = employee;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "ProjectModal{" +
                "projectName='" + projectName + '\'' +
                ", pId=" + pId +
                ", startDate=" + startDate +
                ", employee=" + employee +
                '}';
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

   /* public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }*/
}
