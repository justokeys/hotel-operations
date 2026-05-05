package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payrate;
    private double hoursWorked;



    public Employee(int employeeId, String name, String department, double payrate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payrate = payrate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        double regularPay = this.payrate * this.getRegularHours();
        double overTimePay  = this.getOverTimeHours() * (this.payrate * 1.5);
        double totalPay = regularPay + overTimePay;
        return totalPay;
    }

    public double getRegularHours() {
        if(this.hoursWorked<= 40)
            return this.hoursWorked;
        return 40;
    }

    public double getOverTimeHours(){
        if(this.hoursWorked > 40){
        return this.hoursWorked - 40;}
        return 0;
    }






}
