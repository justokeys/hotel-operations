package com.pluralsight;

import javax.swing.*;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

    }

    public String getRoomType(String king) {
        return this.roomType;

    }

    public String setRoomType(String roomType){
        return roomType;

    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getPrice(){
        if(roomType.equalsIgnoreCase("king")){
            return 139.00;
        } else if (roomType.equalsIgnoreCase("Double")) {
            return 124.00;
        }
        return 0.0;
    }


    public boolean isWeekend() {
        return isWeekend;
    }

    public boolean setIsWeekend(boolean isWeekend){

        return isWeekend;
    }

    public void getReservation(){
        double grandtotal = 0.0;
        double roomT = this.getPrice();
        grandtotal = (1.0 * getNumberOfNights()) * roomT;
        if(isWeekend()){
            double weekEndPrice = grandtotal * .1;
            System.out.println("Your reservation total is " + (grandtotal + weekEndPrice) );

        }else

        System.out.println("Your reservation total is " + grandtotal);




    }




}


