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
        this.bookedSuites = 0;
        this.bookBasicRooms = 0;
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

    public boolean bookroom(int roomIWant, boolean isSuite) {
        if (isSuite) {
            if (getAvailableSuites() >= roomIWant) {
                this.bookedSuites += roomIWant;
                return true;
            }

        } else {
            if (getAvailableRooms() >= roomIWant) {
                this.bookBasicRooms += roomIWant;
                return true;
            }
        }

        return false;
    }

    public int getAvailableSuites() {
        if(this.numberOfSuites - this.bookedSuites < 0){
            System.out.println("No suites available");
            return 0;

        }else
            return this.numberOfSuites - this.bookedSuites;



    }


    public int getAvailableRooms() {
        if(this.numberOfRooms - this.bookBasicRooms< 0){
            System.out.println("No rooms available");
            return 0;

        }else
            return this.numberOfRooms - this.bookBasicRooms;
    }




}
