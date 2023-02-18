package lecture.chapter8;

public class RuntimeExceptionExample {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        try {
            for(int i = 0; i <= 5; i++){
                System.out.println(numbers[i]);
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index existiert nicht!");
        }

        System.out.println("Ende");

    }
}
