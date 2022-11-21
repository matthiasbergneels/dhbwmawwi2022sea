package lecture.chapter5;

import java.sql.SQLOutput;

public class CarRun {

    public static void main(String[] args) {

        System.out.println("Es gibt " + Car.getCarCount() + " Autos");

        Car myCar = new Car(160, "rot", Car.ALLOWED_BRANDS.Fiat);
        Car myCarCopy = new Car(160, "LILA", Car.ALLOWED_BRANDS.Jeep);
        Car yourCar = new Car(-5, Car.ALLOWED_COLOR_BLACK, Car.ALLOWED_BRANDS.Tesla);

        System.out.println("Es gibt " + Car.getCarCount() + " Autos");

        System.out.println("Zwei Objekte Vergleich:");
        if(myCar == myCarCopy){
            System.out.println("Identisches Auto");
        } else {
            System.out.println("unterschiedliche Autos");
        }

        Car myCarReferenceCopy = myCar;

        System.out.println("Reference Copy Vergleich:");
        if(myCar == myCarReferenceCopy){
            System.out.println("Identisches Auto");
        } else {
            System.out.println("unterschiedliche Autos");
        }


        /*
        myCar.hp = 160;
        myCar.color = "LILA";
        myCar.brand = "Porsche";

        yourCar.hp = 300;
        yourCar.color = "Schwarz";
        yourCar.brand = "Fiat";
         */

        /* --> unterbunden durch Einschränkung der Sichtbarkeit der Attribute --> private
        yourCar.color = "kack braun";
        yourCar.hp = -5;
        yourCar.currentSpeed = -500;
         */

        System.out.println("Aktuelle Leistung deines Autos: " + yourCar.getHp() + " PS");
        yourCar.setHp(-5);
        System.out.println("Aktuelle Leistung deines Autos: " + yourCar.getHp() + " PS");

        System.out.println("Mein Auto ist ein " + myCar.getColor() + " " + myCar.getBrand());
        System.out.println("Dein Auto ist ein " + yourCar.getColor() + " " + yourCar.getBrand());

        myCar.accelerate(16);
        myCar.accelerate(25);
        myCar.accelerate(5);

        System.out.println("Mein Auto ist " + myCar.getCurrentSpeed() + " kmh schnell.");
        System.out.println("Dein Auto ist " + yourCar.getCurrentSpeed() + " kmh schnell.");

        myCar.brake();

        System.out.println("Mein Auto ist " + myCar.getCurrentSpeed() + " kmh schnell.");

        myCar.fullBreak();

        System.out.println("Mein Auto ist " + myCar.getCurrentSpeed() + " kmh schnell.");


        // Verschrottung

        myCar = null;
        myCarReferenceCopy = null;

        // Objekt --> unreachable
        System.gc();

        try {
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Da ist etwas schief gelaufen.");
        }

        System.out.println("Es gibt " + Car.getCarCount() + " Autos");
    }
}
