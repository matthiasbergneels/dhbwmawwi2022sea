package lecture.chapter7;

public interface Bookable {

    public boolean book(int slots);
    public int freeSlots();

    public default boolean reserve(int slots){
        return false;
    };

}
