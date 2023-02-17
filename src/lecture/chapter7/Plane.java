package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public class Plane implements Bookable{

    private boolean[] seats;        // false = frei, true = belegt

    public Plane(int seatCount){
        seats = new boolean[seatCount];
    }

    public void fly(){
        System.out.println("Und ich flieg, flieg, flieg, ... *sing* ");
    }

    public void book(int slots) throws NotEnoughFreeSlotsException {

        if(slots > freeSlots()){
            throw new NotEnoughFreeSlotsException(freeSlots(), slots);
        }

        if(slots <= seats.length && slots <= freeSlots()){
            for(int i = 0; i < seats.length; i++){
                if(!seats[i]){
                    seats[i] = true;
                    slots--;
                }
                if(slots == 0){
                    return;
                }
            }
        }
    }

    @Override
    public int freeSlots() {
        int freeSeatCount = 0;
        for(boolean seat : seats){
            if(!seat){
                freeSeatCount++;
            }
        }
        return freeSeatCount;
    }
}
