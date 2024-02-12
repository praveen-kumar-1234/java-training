package com.cjss;

import java.util.List;
import java.util.Scanner;

import com.cjss.Main.*;
// Service class
class Service {
    private final DAO dao;

    public Service(DAO dao) {
        this.dao = dao;
    }

    public void performOperation(int choice, Scanner scanner,Employee employee,Admin admin) {
        switch (choice) {
            case 1:

                dao.registerProject(scanner);
                break;
            case 2:
                dao.registerEmployee(scanner);
                break;
            case 3:
                dao.addAttendance(employee);
                break;
            case 4:
                dao.leaveApproval();
                break;
            case 5:
                dao.viewEmployeesByProject(scanner);
                break;
            case 6:
                dao.viewEmployeesOnLeave();
                break;
            case 7:
                dao.viewProjectsForEmployee(scanner);
                break;
            case 8:
                dao.exit();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
