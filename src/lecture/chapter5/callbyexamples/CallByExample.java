package lecture.chapter5.callbyexamples;

public class CallByExample {

    public static void main(String[] args) {

        // Call by Value --> primitive Datentypen

        int numberA = 20;
        int numberB;

        numberB = numberA;      // << Call by Value

        numberA = numberA + 5;

        System.out.println(numberB);


        // Call by Reference

        Person herrBergNeels = new Person();

        Person papa;
        Person schnurziPupsi;

        papa = herrBergNeels;   // << Call by Reference
        schnurziPupsi = papa;   // << Call by Reference

        schnurziPupsi.schlagen();


        System.out.println("Herr Berg-Neels hat ein blaues Auge? " + herrBergNeels.hatBlauesAuge());


    }
}
