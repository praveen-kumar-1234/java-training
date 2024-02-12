package com.cjss;

import java.util.*;
import java.util.List;

public abstract class Employee {
    String name;
     int id;

    Project project;


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }






    public String getName() {
        return name;
    }

    public  int getId() {
        return id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }


    public  List<Leave> leaveRequests;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLeaveRequests(List<Leave> leaveRequests) {
        this.leaveRequests = leaveRequests;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.leaveRequests = new ArrayList<>();
    }



    public   List<Leave> getLeaveRequests() {
        return leaveRequests;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", leaveRequests=" + leaveRequests +
                '}';
    }
}
