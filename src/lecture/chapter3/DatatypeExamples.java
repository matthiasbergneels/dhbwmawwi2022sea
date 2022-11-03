package lecture.chapter3;

public class DatatypeExamples {

    public static void main(String[] args) {

        // Deklaration --> Speicherbereich wird allokiert
        int numberA;

        numberA = 45;       // --> Wert wird in Speicherbereich abgelegt

        // Deklaration & initialisierung
        double numberB = 45.5;

        int numberC = 56, numberD, nuhmberE = 45;

        boolean tired = false;      // true

        tired = true;
        numberA = 100;

        final double THIS_IS_PI;
        THIS_IS_PI = 3.14;

        // THIS_IS_PI = 5.0;      //  --> nicht möglich, da Konstante schon initialisiert ist

        // Literale

        // Ganzzahl
        numberA = 15;               // --> Dezimal-Literal
        System.out.println(numberA);

        numberA = 044;              // --> Oktal-Literal
        System.out.println(numberA);

        numberA = 0x44;              // --> Hexadezimal-Literal
        System.out.println(numberA);

        int redRGB = 0xFF0000;      // = 16711680;
        System.out.println(redRGB);

        long extraNumberA = 3000000000l; // --> long-Literal

        long extraNumberB = extraNumberA;

        // Fließkomma
        numberB = 2.78;                 // --> Double-Literal
        System.out.println(numberB);

        numberB = 0.567e4;              // --> Double-Literal
        System.out.println(numberB);

        numberB = -0.6e1D;               // --> Double-Literal
        System.out.println(numberB);

        float numberF = 0.6e1F;         // --> FLoat-Literal immer mit F!
        System.out.println(numberF);


        // alphanumerische Literale

        // Char-Literal
        char singleCharacterOne = 'a';
        System.out.println(singleCharacterOne);

        char singleCharacterTwo = 77;           // Char geht auch mit int-Literalen!
        System.out.println(singleCharacterTwo);

        char singleCharacterThree = '\u2764';
        System.out.println(singleCharacterThree);

        char singleCharacterFour = '\'';
        System.out.println(singleCharacterFour);

        // String-Literal (Zeichenkettenliteral)
        String longerText = "Und hier \t kann ich \"viele\" Zeichen \nangeben. \u2764";
        System.out.println(longerText);

        String longerTextTwo = "Und hier \t kann ich \n viele Zeichen \nangeben. \u2764";
        System.out.println(longerText);

        String textTemplate = """
                <!html>
                    <head>
                    </head>
                    <body>
                        <h1>Juhu!</h1>
                    </body>
                </html>
                """;

        System.out.println(textTemplate);
    }
}
