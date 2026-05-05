package com.pluralsight;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payrate;
    private double hoursWorked;
    private int startTime;



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


    public void punchIn() {
       LocalTime hoursIn = LocalTime.now();
       punchIn(hoursIn.getHour());

    }

    public void punchIn(int time ){
        this.startTime = time;

    }

    public void punchOut(int time){
        double hours = time - this.startTime;

        this.hoursWorked += hours;

        
    }

    public void punchOut(){
        LocalTime hoursOut = LocalTime.now();
        punchOut(hoursOut.getHour());
    }
    
    






}
