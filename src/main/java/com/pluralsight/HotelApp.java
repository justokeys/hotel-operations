package com.pluralsight;

import java.time.LocalTime;

public class HotelApp {
    public static void main(String[] args) {
        Room room1 = new Room(1,139,false,false);
        Reservation rev1 = new Reservation("King",3,true);
        Employee employee1 = new Employee(2283,"hausmusik","DJ",25,25);
        Hotel hotel = new Hotel("Larry",0,0);
        Hotel hotel1 = new Hotel("Marc",30,20,21,15);

        employee1.punchIn(13);
        employee1.punchOut();


        System.out.println("Your pay is " + employee1.getTotalPay());
        System.out.println(employee1.getRegularHours());


        System.out.println("Hello You room has " + room1.getBed() + "beds");
        rev1.getReservation();

        System.out.println("Your pay for is " + employee1.getTotalPay());

        System.out.println(hotel1.getAvailableSuites());

        hotel1.bookroom(2,true);

        System.out.println(hotel1.getAvailableSuites());


    }
}
