package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfRooms;
    private int numberOfSuites;
    private int bookedSuites;
    private int bookBasicRooms;
    private boolean isSuite;

    public Hotel(String name, int numberOfRooms, int numberOfSuites) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
    }

    public Hotel(String name, int numberOfRooms, int numberOfSuites, int bookedSuites, int bookBasicRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
        this.bookedSuites = bookedSuites;
        this.bookBasicRooms = bookBasicRooms;
    }

    public boolean isSuite() {
        return isSuite;
    }

    public void setSuite(boolean suite) {
        isSuite = suite;
    }

    public boolean bookroom(int numberOfRooms,boolean isSuite){

        if (this.numberOfRooms > 0 && this.isSuite == true){
            System.out.println("Your room as been booked");
            this.bookBasicRooms += 1;
            this.getAvailableSuites() =- 1;
            return true;
        } return false;

    }

    public void getAvailableSuites() {
        System.out.println(this.numberOfSuites);


    }

    public void getAvailiblesSuites(){

        for(Hotel suit :this.numberOfSuites){

        }

    }

    public void getBookedRooms(){

    }















}
