package com.cjss;

import java.time.LocalDate;

import java.time.Month;
import java.util.*;
import java.util.stream.Stream;

import static com.cjss.Main.employees;
import static com.cjss.Main.projects;


// DAO class
 class DAO implements Operations {

    public void registerProject(Scanner scanner) {
        System.out.print("Enter project name: ");
        String projectName = scanner.next();
        projects.put(projectName, new Project(projectName));
        System.out.println("Project registered successfully.");
    }

    @Override
    public void registerEmployee(Scanner scanner) {
        System.out.print("Enter employee name: ");
        String name = scanner.next();
        System.out.print("Enter employee id: ");
        int id = scanner.nextInt();

        Employee employee = new RegularEmployee(name, id);

        System.out.print("Enter project name to assign the employee: ");
        String projectName = scanner.next();

        if (projects.containsKey(projectName)) {
            Project project = projects.get(projectName);
            employee.setProject(project);
            project.addEmployee(employee);
            System.out.println("Employee registered and assigned to project successfully.");
        } else {
            System.out.println("Project not found. Please register the project first.");
        }

        employees.add(employee);
    }


    @Override
    public void addAttendance(Employee employee) {
        System.out.println("Enter the employee id....");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        for (Employee employee1 : employees) {
            Attendance attendance = new Attendance(LocalDate.now(), employee1);
            if (employee1 != null) {
                if (employee1.getId() == id) {
                    attendance.addAttendance(LocalDate.now(), "marked");
                    System.out.println("Employee attendance added successfully.....");
                }
            } else {
                System.out.println("Employee not found....");
            }


        }
    }


    @Override
    public void leaveApproval() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id of employee...");
        int id = scanner.nextInt();
        System.out.println("Enter the leave start date ");
        System.out.println("year");
        int sYear = scanner.nextInt();
        System.out.println("month");
        int sMonth = scanner.nextInt();
        System.out.println("date");
        int date = scanner.nextInt();
        System.out.println("Enter the leave end date ");
        System.out.println("year");
        int eYear = scanner.nextInt();
        System.out.println("month");
        int eMonth = scanner.nextInt();
        System.out.println("date");
        int edate = scanner.nextInt();

        System.out.println("Give choice Approve or Reject:A/R");
        char choice = scanner.next().charAt(0);
        if (choice == 'A') {
            for (Employee employee : employees) {
                if (employee.getId() == id) {
                    Leave l = new Leave(LocalDate.of(2024, 02, 01), LocalDate.of(2024, 02, 5));
                    l.setStatus("approved");
                    employee.leaveRequests.add(l);
                    employee.setLeaveRequests(employee.getLeaveRequests());

                }

            }

        } else if (choice == 'R') {
            for (Employee employee : employees) {
                for (Leave leave : employee.getLeaveRequests()) {
                    if (leave.getEmployeeId() == id) {
                        leave.setEmployeeId(id);
                        leave.setStatus("rejected");
                    }

                    employee.setLeaveRequests(employee.getLeaveRequests());
                }
            }
        } else {
            System.out.println("Invalid choice....");
        }

        System.out.println("leave status updated...");
    }

    @Override
    public void viewEmployeesByProject(Scanner scanner) {
        System.out.print("Enter project name to show employees: ");
        String projectName = scanner.next();

        if (projects.containsKey(projectName)) {
            Project project = projects.get(projectName);
            List<Employee> projectEmployees = project.getEmployees();
            System.out.println("Employees assigned to project " + projectName + ":");
            for (Employee employee : projectEmployees) {
                System.out.println("Name: " + employee.getName() + ", ID: " + employee.getId());
            }
        } else {
            System.out.println("Project not found.");
        }
    }


    @Override
    public void viewEmployeesOnLeave() {
        System.out.println("Employees on leave:");
        for (Employee employee : employees) {
            System.out.println(employee);
            List<Leave> leaveRequests = employee.getLeaveRequests();


            for (Leave leave : employee.getLeaveRequests()) {

                if (leave.getStatus().equals("approved") && (leave.getStartDate().getMonth().equals(Month.FEBRUARY))) {
                    if (leave.getEmployeeId() == employee.id) {
                        System.out.println(employee.getName());
                    }
                    ;
                }
            }
        }
    }


    @Override
    public void viewProjectsForEmployee(Scanner scanner) {
        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();

        Employee employee = findEmployeeById(employeeId);

        if (employee != null) {
            System.out.println("Projects worked/ongoing for Employee " + employee.getName() + ":");
            for (Project project : projects.values()) {
                if (project.getEmployees().contains(employee)) {
                    System.out.println("- " + project.getProjectName());
                }
            }
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void exit() {
        System.exit(0);
    }
}
