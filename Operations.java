package com.cjss;

import java.util.List;
import java.util.Scanner;

// Interface for operations
interface Operations {
    void registerProject(Scanner scanner);
    void registerEmployee(Scanner scanner);
    void  addAttendance(Employee employee);
    void leaveApproval();
    void viewEmployeesByProject(Scanner scanner);
    void viewEmployeesOnLeave();
    void viewProjectsForEmployee(Scanner scanner);
    void exit();
}