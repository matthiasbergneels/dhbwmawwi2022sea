package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public class TravelAgency {

    public static void main(String[] args) throws Exception{
        Hotel hilton = new Hotel(100);
        Hotel holidayInn = new Hotel(400);
        Plane planeOne = new Plane(80);
        Plane planeTwo = new Plane(500);


        // Narrowing Cast
        Bookable bookableOne = hilton;


        Bookable[] bookableEntities = new Bookable[5];

        bookableEntities[0] = hilton;
        bookableEntities[1] = holidayInn;
        bookableEntities[2] = planeOne;
        bookableEntities[3] = planeTwo;


        for(Bookable bookableEntity : bookableEntities){
            if(bookableEntity == null){
                continue;
            }

            try {
                System.out.println("Freie Plätze: " + bookableEntity.freeSlots());
                bookableEntity.book(100);

                System.out.println("Die Plätze wurden gebucht");
                System.out.println("Es sind noch " + bookableEntity.freeSlots() + " Plätze frei");
            }catch(NotEnoughFreeSlotsException myNotEnoughFreeSlotsException){
                System.out.println(myNotEnoughFreeSlotsException.getMessage());
                System.out.println("Freie Plätze: " + myNotEnoughFreeSlotsException.getCurrentFreeSlots());
            }catch(NoSuchMethodException e){

            }catch(Exception e){
                // Catch All
                throw e;
            }
            finally{
                System.out.println("Finally: An mir kommst du nicht vorbei!");
            }

            if(bookableEntity instanceof Plane){
                // Widening Cast
                Plane currentPlane = (Plane)bookableEntity;
                currentPlane.fly();
            }
        }


        System.out.println("Plane implementiert Bookable - " + (planeOne instanceof Bookable));

    }
}
