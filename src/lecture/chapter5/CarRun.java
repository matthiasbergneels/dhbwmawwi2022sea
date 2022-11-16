package lecture.chapter5;

import java.sql.SQLOutput;

public class CarRun {

    public static void main(String[] args) {

        Car myCar = new Car();
        Car yourCar = new Car();

        myCar.hp = 160;
        myCar.color = "LILA";
        myCar.brand = "Porsche";

        yourCar.hp = 300;
        yourCar.color = "Schwarz";
        yourCar.brand = "Fiat";

        System.out.println("Mein Auto ist ein " + myCar.color + " " + myCar.brand);
        System.out.println("Dein Auto ist ein " + yourCar.color + " " + yourCar.brand);

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();

        System.out.println("Mein Auto ist " + myCar.currentSpeed + " kmh schnell.");
        System.out.println("Dein Auto ist " + yourCar.currentSpeed + " kmh schnell.");

        myCar.brake();

        System.out.println("Mein Auto ist " + myCar.currentSpeed + " kmh schnell.");

        myCar.fullBreak();

        System.out.println("Mein Auto ist " + myCar.currentSpeed + " kmh schnell.");
    }
}
