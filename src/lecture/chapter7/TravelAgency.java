package lecture.chapter7;

public class TravelAgency {

    public static void main(String[] args) {
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
            System.out.println("Freie Plätze: " + bookableEntity.freeSlots());
            boolean successfullBooking = bookableEntity.book(100);

            if(successfullBooking){
                System.out.println("Die Plätze wurden gebucht");
                System.out.println("Es sind noch " + bookableEntity.freeSlots() + " Plätze frei");
            } else {
                System.out.println("Nicht genug freie Plätze!");
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
