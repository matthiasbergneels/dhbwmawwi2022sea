package lecture.chapter3;

public class DatatypeConversion {

    public static void main(String[] args) {

        byte smallNumber = 15;

        int biggerNumber;
        double bigPreciseNumber;

        // Implizite Typkonvertierung byte -> int
        biggerNumber = smallNumber;

        // Implizite Typkonvertierung byte -> double
        bigPreciseNumber = smallNumber;


        System.out.println(smallNumber);
        System.out.println(biggerNumber);
        System.out.println(bigPreciseNumber);


        long veryBigNumber = 1_999_999_999_999_999_999l;

        float smallPreciseNumber;


        // Sonderfälle :-(
        // long --> float where the magic happens - or not
        smallPreciseNumber = veryBigNumber;

        // long --> double where the magic happens - or not
        bigPreciseNumber = veryBigNumber;

        System.out.println(veryBigNumber);
        System.out.println(smallPreciseNumber);
        System.out.println(bigPreciseNumber);


        // explizite Konvertierung

        biggerNumber = 50;

        // int -> byte
        smallNumber = (byte)biggerNumber;

        System.out.println(smallNumber);

        // double -> int
        bigPreciseNumber = 3.914;

        biggerNumber = (int)bigPreciseNumber;

        System.out.println(biggerNumber);


        // byte --> Max = 127
        biggerNumber = 12700;

        smallNumber = (byte)biggerNumber;

        System.out.println(smallNumber);







    }
}
