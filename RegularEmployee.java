package com.cjss;

import java.util.List;

// RegularEmployee class extending Employee
class RegularEmployee extends Employee {

    public RegularEmployee(String name,int id){
        super(name,id);
    }
    public RegularEmployee(String name, int id, List<Leave> LeaveRequests) {
        super(name, id);
    }

    @Override
    public String toString() {
        return "RegularEmployee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", leaveRequests=" + leaveRequests +
                '}';
    }
}
