package lecture.chapter4;

public class LoopExamples {

    public static void main(String[] args) {

        double runningDistanceInKm = 0.0;
        double runningDurationInMin = 0.0;

        while(runningDistanceInKm < 10.0 && runningDurationInMin < 60.0){
            // Werte von Sensor auslesen
            runningDistanceInKm += 1;
            runningDurationInMin += 6.25;

            System.out.println("Aktuelle Distanz: " + runningDistanceInKm);
            System.out.println("Aktuelle Zeit: " + runningDurationInMin);
        }

        System.out.println("Lauf ist beendet!");
        System.out.println("Werte: ");
        System.out.println("Aktuelle Distanz: " + runningDistanceInKm);
        System.out.println("Aktuelle Zeit: " + runningDurationInMin);


        System.out.println("Zählen mit while-Schleife:");
        int count = 0;
        while(count <= 10){
            count++;
            if(count % 2 != 0){
                System.out.println("Ungerade Zahlen sind unsexy");
                continue;
            }
            System.out.println(count);
        }


        // Fußgesteuerte Schleife
        count = 0;

        System.out.println("Zählen mit do-while-Schleife:");
        do {

            System.out.println(count++);
            if(count == 6){
                System.out.println("Zahl des Teufels - raus aus der Schleife");
                break;
            }
        }while(count <= 10);


        System.out.println("Zähler Schleife - for");
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        for(count = 0; count <= 10; count = count + 4){
            System.out.println(count);
        }


        System.out.println("Array Zugriff mit Schleien:");
        String[] lotOfTexts = {"hier", "steht", "Text", "viel"};

        for(int i = 0; i < lotOfTexts.length; i++){
            if(lotOfTexts[i].equals("steht")){
                lotOfTexts[i] = "ist";
            }
            System.out.println(lotOfTexts[i]);
        }
        
        System.out.println("Array Zugriff mit For-Each-Schleife");
        for(String text : lotOfTexts){
            if(text.equals("ist")){
                text = "steht";
            }
            System.out.println(text);
        }

        System.out.println("Array Zugriff mit For-Each-Schleife");
        for(String text : lotOfTexts){
            System.out.println(text);
        }

    }
}
