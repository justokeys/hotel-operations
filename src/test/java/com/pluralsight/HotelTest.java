package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HotelTest {

    @Test
    public void getAvailableRooms_Should_CheckAvailability(){
        Hotel hotel = new Hotel("James",10,10,5,5);
        int expected = 5;

        // act
        hotel.getAvailableRooms();

        //assert
        int actualamount = hotel.getAvailableRooms();
        assertEquals(expected,actualamount);

    }

        public void room_should_be_occupied_and_dirty()


}