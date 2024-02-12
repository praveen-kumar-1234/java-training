package com.cjss;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Attendance {


        private LocalDate date;
        private Employee employee;
    public static Map<LocalDate, String> attendanceRecords;


        public Attendance() {
        }

        public Attendance(LocalDate date, Employee employee) {
            this.date = date;
            this.employee = employee;
            this.attendanceRecords=new HashMap<>();
        }

    public  void addAttendance(LocalDate date, String status) {
        this.attendanceRecords.put(date, status);
    }

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public Employee getEmployee() {
            return employee;
        }

    public Map<LocalDate, String> getAttendanceRecords() {
        return attendanceRecords;
    }

    public void setEmployee(Employee employee) {
            this.employee = employee;
        }

        @Override
        public String toString() {
            return "Attendance{" +
                    "date=" + date +
                    ", employee=" + employee +
                    '}';
        }
    }





