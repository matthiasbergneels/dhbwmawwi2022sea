package lecture.chapter7;

public class Plane implements Bookable{

    private boolean[] seats;        // false = frei, true = belegt

    public Plane(int seatCount){
        seats = new boolean[seatCount];
    }

    public void fly(){
        System.out.println("Und ich flieg, flieg, flieg, ... *sing* ");
    }

    public boolean book(int slots){
        if(slots <= seats.length && slots <= freeSlots()){
            for(int i = 0; i < seats.length; i++){
                if(!seats[i]){
                    seats[i] = true;
                    slots--;
                }
                if(slots == 0){
                    return true;
                }
            }
        }
        return false;
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
