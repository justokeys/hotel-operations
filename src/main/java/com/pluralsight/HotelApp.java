package com.pluralsight;
public class HotelApp {
    public static void main(String[] args) {
        Room room1 = new Room(1,139,false,false);
        Reservation rev1 = new Reservation("King",3,true);
        Employee employee1 = new Employee(2283,"hausmusik","DJ",25,41);


        System.out.println("Hello You room has " + room1.getBed() + "beds");
        rev1.getReservation();

        System.out.println("Your pay for this week is " + employee1.getTotalPay());


    }
}
