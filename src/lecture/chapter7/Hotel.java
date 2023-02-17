package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public class Hotel implements Bookable{

    private int roomCount;
    private int bookedRoomCount;

    public Hotel(int roomCount){
        this.roomCount = roomCount;
        bookedRoomCount = 0;
    }

    public void cleanRooms(){
        System.out.println("Räume werden geputzt...");
    }

    @Override
    public void book(int slots) throws NotEnoughFreeSlotsException{

        if(slots > freeSlots()){
            NotEnoughFreeSlotsException myFreeSlotsException = new NotEnoughFreeSlotsException(freeSlots(), slots);
            throw myFreeSlotsException;
        }

        if(slots <= roomCount && slots <= freeSlots()){
            bookedRoomCount += slots;
            return;
        }
    }

    @Override
    public int freeSlots(){
        return roomCount - bookedRoomCount;
    }
}
