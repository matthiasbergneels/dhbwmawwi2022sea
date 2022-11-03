package lecture.chapter3;

public class ArrayExample {

    public static void main(String[] args) {

        int numberA;
        int numberB;
        int numberC;

        int[] numbers = new int[5];

        numbers[0] = 15;
        numbers[1] = 42;
        numbers[2] = 89;
        numbers[3] = 172;
        numbers[4] = 255;

        int[] numbersTwo = {15, 42, 89, 172, 255, 1000, 98271};

        System.out.println(numbersTwo[2]);

        boolean[] aLotOfTrueOrFalse = {true, false, false, true, true}; //new boolean[5];

        String[] lotOfTexts = {"hier", "steht", "Text", "viel"};

        System.out.println(lotOfTexts.length);


        char[][] ticTacToeField = new char[3][3];

        ticTacToeField[0][0] = 'X';
        ticTacToeField[1][1] = 'O';

        String[][][] chapterContent = new String[5][][];

        chapterContent[0] = new String[3][];

        chapterContent[0][0] = new String[5];

        chapterContent[0][0][0] = "Hallo";
        chapterContent[0][0][1] = "das";
        chapterContent[0][0][2] = "wird";
        chapterContent[0][0][3] = "kompliziert";
        chapterContent[0][0][3] = "mist";

        chapterContent[0][1] = new String[3];

        chapterContent[0][1][0] = "Ich";
        chapterContent[0][1][1] = "liebe";
        chapterContent[0][1][2] = "Käse";

        String[][] sentences = {
                                    {"Ich", "bin", "hier"},
                                    {"Wir", "wollen", "endlich", "nach", "Hause"},
                                    {"Wann", "hört", "das", "auf"}
                                };
    }
}
