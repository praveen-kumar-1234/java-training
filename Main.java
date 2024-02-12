package com.cjss;

import java.time.LocalDate;
import java.util.*;
import java.time.format.DateTimeParseException;

public class Main {
    static Map<String, Project> projects = new HashMap<>();
    static List<Employee> employees = new ArrayList<>();


    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Service service = new Service(new DAO());
            List<String> proNames = new ArrayList<>();

            List<Employee> employees1 = new ArrayList<>();
            List<Employee> employees2 = new ArrayList<>();
            List<Employee> employees3 = new ArrayList<>();


            List<Leave> Leaves1 = new ArrayList<>();
            Leaves1.add(new Leave(LocalDate.of(2024,02,01),LocalDate.of(2024,02,05)));


            List<Leave> Leaves2 = new ArrayList<>();
            Leaves2.add(new Leave(LocalDate.of(2024,01,01),LocalDate.of(2024,01,05)));


            List<Leave> Leaves3 = new ArrayList<>();
            Leaves3.add(new Leave(LocalDate.of(2023,12,01),LocalDate.of(2023,12,05)));


            List<Leave> Leaves4 = new ArrayList<>();
            Leaves4.add(new Leave(LocalDate.of(2023,11,01),LocalDate.of(2023,11,5)));


            List<Leave> Leaves5 = new ArrayList<>();
            Leaves5.add(new Leave(LocalDate.of(2023,01,01),LocalDate.of(2023,01,3)));


            List<Leave> Leaves6 = new ArrayList<>();
            Leaves6.add(new Leave(LocalDate.of(2023,01,02),LocalDate.of(2023,01,5)));

            List<Leave> Leaves7 = new ArrayList<>();
            Leaves7.add(new Leave(LocalDate.of(2023,02,01),LocalDate.of(2023,02,5)));



            List<Leave> Leaves8 = new ArrayList<>();
            Leaves8.add(new Leave(LocalDate.of(2023,12,03),LocalDate.of(2023,12,7)));

            List<Leave> Leaves9 = new ArrayList<>();
            Leaves9.add(new Leave(LocalDate.of(2023,02,04),LocalDate.of(2023,02,5)));


            List<Leave> Leaves10 = new ArrayList<>();
            Leaves10.add(new Leave(LocalDate.of(2024,01,01),LocalDate.of(2023,01,5)));


            List<Leave> Leaves11 = new ArrayList<>();
            Leaves11.add(new Leave(LocalDate.of(2023,01,01),LocalDate.of(2023,01,3)));


            List<Leave> Leaves12 = new ArrayList<>();
            Leaves12.add(new Leave(LocalDate.of(2024,01,11),LocalDate.of(2023,01,14)));



            Admin admin1 = new Admin("Praveen", 107, Leaves1);
            Admin admin2 = new Admin("Ram", 207, Leaves5);
            Admin admin3 = new Admin("Anish", 307, Leaves9);

            List<Admin> admins = new ArrayList<>();
            admins.add(admin1);
            admins.add(admin2);
            admins.add(admin3);

            employees1.add(admin1);
            employees1.add(new RegularEmployee("Sarma", 108, Leaves2));
            employees1.add(new RegularEmployee("sravya", 109, Leaves3));
            employees1.add(new RegularEmployee("krishna", 110, Leaves4));


            employees2.add(admin2);
            employees2.add(new RegularEmployee("Narayana", 208, Leaves6));
            employees2.add(new RegularEmployee("sateesh", 209, Leaves7));
            employees2.add(new RegularEmployee("lavanya", 210, Leaves8));

            employees3.add(admin3);
            employees3.add(new RegularEmployee("Jayadeep", 308, Leaves10));
            employees3.add(new RegularEmployee("Pasha", 309, Leaves11));
            employees3.add(new RegularEmployee("Priya", 310, Leaves12));

           Employee employee = new RegularEmployee("Lokesh",407,Leaves7);
//            // Populate projects and employees with dummy data
//            Project project1 = new Project("EmployeeManagementSystem", employees1);
//            Project project2 = new Project("UserManagementSystem", employees2);
//            Project project3 = new Project("BusTicketBookingSystem", employees3);
//
//            proNames.add("EmployeeManagementSystem");
//            proNames.add("UserManagementSystem");
//            proNames.add("BusTicketBookingSystem");
//            projects.add(project1);
//            projects.add(project2);
//            projects.add(project3);

            int choice;
            do {
                System.out.println("1. Register a Project");
                System.out.println("2. Register an Employee");
                System.out.println("3. Add Attendance");
                System.out.println("4. Leave Approval");
                System.out.println("5. View Employees by Project");
                System.out.println("6. View Employees on Leave");
                System.out.println("7. View Project Details which worked/ongoing for an employee....");
                System.out.println("8. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                service.performOperation(choice, scanner, employee, admins.get(0));
                //}
            } while (choice != 8);

        } catch (DateTimeParseException e1) {
            System.out.println(e1);
        } catch (InputMismatchException e2) {
            System.out.println("Invalid input: " + e2.getMessage());
        } catch (NullPointerException e3) {
            System.out.println("Null pointer exception: " + e3);
        }

    }
}
