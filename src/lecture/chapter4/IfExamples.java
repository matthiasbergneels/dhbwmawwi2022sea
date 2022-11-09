package lecture.chapter4;

public class IfExamples {

    public static void main(String[] args) {

        boolean isTired = false;
        int energyDrinkCount = 0;

        if(isTired) {
            if (energyDrinkCount == 0) {
                System.out.println("Ich geh schlafen!");
            }
        }else {
            System.out.println("Juhu, ich bin hellwach - Ohne Energy Drink!");
        }

        System.out.println("Was passiert hier?");



        int speed = 51;

        System.out.println("in den Ort gefahren");

        if(speed >= 0 && speed <= 50){
            System.out.println("Angemessene Geschwindigkeit");
        } else if(speed > 100 && speed <= 150){
            System.out.println("Zu Schnell - jetzt wird kriminell");
        } else if(speed > 50 && speed <= 70){
            System.out.println("Zu Schnell");
        } else if(speed > 70 && speed <= 100){
            System.out.println("Zu Schnell - jetzt wird teuer");
        }  else {
            System.out.println("Irreguläre Geschwindigkeit!");
        }


    }
}
