package com.cjss;

import java.util.List;

// Class for Admin
class Admin extends Employee {

    public Admin(String name, int id, List<Leave> leaveRequests) {
        super(name, id);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", leaveRequests=" + leaveRequests +
                '}';
    }
}