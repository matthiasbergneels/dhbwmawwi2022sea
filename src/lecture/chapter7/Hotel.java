package lecture.chapter7;

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
    public boolean book(int slots){
        if(slots <= roomCount && slots <= freeSlots()){
            bookedRoomCount += slots;
            return true;
        }
        return false;
    }

    @Override
    public int freeSlots(){
        return roomCount - bookedRoomCount;
    }
}
