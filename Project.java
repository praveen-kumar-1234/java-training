package com.cjss;

import java.util.*;

// Class for Project


class Project {
    private String projectName;
    private List<Employee> employees;

    public Project(String projectName) {
        this.projectName = projectName;
        this.employees = new ArrayList<>();
    }

    public String getProjectName() {
        return projectName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
