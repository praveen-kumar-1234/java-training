package com.cjss;

import java.time.LocalDate;

class Leave {
    private LocalDate startDate;
    private LocalDate endDate;
    private int employeeId;
    private String status; // pending, approved, rejected

    public Leave(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.employeeId = getEmployeeId();
        this.status = "pending"; // Default status is pending
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", employeeId=" + employeeId +
                ", status='" + status + '\'' +
                '}';
    }
}