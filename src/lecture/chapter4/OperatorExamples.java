package lecture.chapter4;

public class OperatorExamples {

    public static void main(String[] args) {

        int numberA = 5;
        int numberB = 3;

        int result;

        result = numberA + ++numberB;
        System.out.println(result);
        System.out.println(numberB);

        result = -numberA;
        System.out.println(result);

        result = numberA / numberB;
        System.out.println(result); // --> Ergebnis: 1

        result = numberA % numberB;
        System.out.println(result); // --> Ergebnis: 2 (Restwert der Division)

        // Inkrement / Dekrement
        int count = 0;

        count++;
        ++count;
        count = count + 1;

        // Postinkrement Operator
        System.out.println("Inkrementiert: " + count++);

        count--;
        count = count - 1;

        System.out.println(count);


        count = 0;

        System.out.println(count);
        count = count + 1;
        System.out.println(count);
        count = count + 1;
        System.out.println(count);
        count = count + 1;
        System.out.println(count);

        System.out.println(count++);
        System.out.println(count++);
        System.out.println(count++);
        System.out.println(count++);
        System.out.println(count++);
        System.out.println(count++);



        boolean compareResult;

        compareResult = numberA == numberB;
        System.out.println("NumberA ist gleich numberB:" + compareResult);

        compareResult = numberA != numberB;
        System.out.println("NumberA ist ungleich numberB:" + compareResult);

        compareResult = numberA > numberB;
        System.out.println("NumberA ist größer numberB:" + compareResult);


        // Zuweisungs-Operatoren

        count = count + 1;

        count += 1;

        count *= 5; // entspricht count = count * 5;

        count *= numberA;

        System.out.println(count);
        System.out.println(count += 6);


        // Fragezeichen Operator

        boolean isTired = false;

        System.out.println(isTired ? "Mehr Energy Drink" : "Juhu, ich bin hellwach!");

        String text = isTired ? "Mehr Energy Drink" : "Juhu, ich bin hellwach!";

        byte numberC = (byte)178;

        // Zeichenketten-Verkettung

        String textOne = "Hello";
        String textTwo = "World";

        String resultText = numberA + count + textOne + "  " + textTwo + "!" + (count + numberA);
        System.out.println(resultText);
    }
}
