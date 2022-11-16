package lecture.chapter5;

public class Car {

    int hp;
    String color;
    int currentSpeed;
    String brand;


    void accelerate(){
        currentSpeed = currentSpeed + 10;
        System.out.println("Auto wird schneller - aktuell " + currentSpeed + " kmh");
    }

    void brake(){
        currentSpeed = currentSpeed - 10;
        System.out.println("Auto wird langsamer - aktuell " + currentSpeed + " kmh");
    }

    void fullBreak(){
        currentSpeed = 0;
        System.out.println("Auto steht!");
    }
}
