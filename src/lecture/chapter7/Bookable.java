package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public interface Bookable {

    public void book(int slots) throws NotEnoughFreeSlotsException, NoSuchMethodException;
    public int freeSlots();

    public default boolean reserve(int slots){
        return false;
    };

}
