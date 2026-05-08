package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    public void getAvailableRooms_Should_CheckAvailability(){
        //arrange
        Hotel hotel = new Hotel("James",10,10,5,5);
        int expected = 5;

        // act
        int actualamount = hotel.getAvailableRooms();

        //assert

        assertEquals(expected,actualamount);

    }
        @Test
        public void checkIn_room_should_b_dirty(){
        //arrange
        Room room1 = new Room(2,124,true,true);

        //act
            room1.checkIn();

            //assert

            assertTrue(room1.isDirty());


        }
        @Test
        public void checkIn_room_should_be_occupied(){
            //arrange
            Room room1 = new Room(2,124,true,true);

            //act
            room1.checkIn();

            //assert
            assertTrue(room1.isOccupied());
        }

        @Test
        public void checkedOut_room_should_not_be_occupied() {
            //arrange
            Room room1 = new Room(2, 124, false, true);

            //act
            room1.checkedOut();

            //assert
            assertFalse(room1.isOccupied());
        }


            @Test
            public void room_should_not_be_occupied_(){
                //arrange
                Room room1 = new Room(2,124,false,false);

                //act
                room1.cleanroom();

                //assert
                assertFalse(room1.isOccupied());


        }

    @Test
    public void room_should_not_be_dirty(){
        //arrange
        Room room1 = new Room(2,124,false,false);

        //act
        room1.cleanroom();

        //assert
        assertFalse(room1.isDirty());


    }



}