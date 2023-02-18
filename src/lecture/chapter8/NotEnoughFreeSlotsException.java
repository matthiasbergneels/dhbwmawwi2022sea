package lecture.chapter8;

public class NotEnoughFreeSlotsException extends Exception {

    private final int currentFreeSlots;

    public NotEnoughFreeSlotsException(int freeSlots, int slotsToBook){
        super("Es wurde versucht " + slotsToBook
                + " Plätze zu buchen, aber es sind nur " + freeSlots + " Plätze frei");

        currentFreeSlots = freeSlots;
    }

    public int getCurrentFreeSlots(){
        return currentFreeSlots;
    }
}
