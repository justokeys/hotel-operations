package com.pluralsight;

public class Room {
    private int bed;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int bed, double price, boolean isOccupied, boolean isDirty) {
        this.bed = bed;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;

    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }


    public boolean isAvalible() {
        if (this.isOccupied() || this.isDirty()) {
            return true;
        } else return false;
    }

    public void checkIn() {
        if (isAvalible()) {
            this.isDirty = true;
            this.isOccupied = true;
            System.out.println("Room checked in");
        } else
        System.out.println("This Room is currently occupied");

    }

    public void checkedOut() {
        this.isOccupied = false;
        this.cleanroom();
        System.out.println("Room checked out");
    }

    public void cleanroom() {
        if (this.isOccupied == false) {
            this.isDirty = false;
            this.isOccupied = false;
            System.out.println("Room is clean");
        }

        else System.out.println("Room is occupied");


    }


}
