package lecture.chapter5;

public class ComparingStrings {

    public static void main(String[] args) {
        String textOne = "Hallo";
        String textTwo = "Hal"+"lo";
        String textThree = new String("Hallo");

        // == bei Reference --> Vergleich auf Objektidentität
        System.out.println("Literal initialisiert");
        if(textOne == textTwo){
            System.out.println("Identischer String");
        } else {
            System.out.println("Unterschiedliche Strings");
        }

        System.out.println("new initialisiert");
        if(textOne == textThree){
            System.out.println("Identischer String");
        } else {
            System.out.println("Unterschiedliche Strings");
        }

        // Inhaltsvergleich (bei Strings)
        System.out.println("Vergleich mit Equals:");
        if(textOne.equals(textThree)){
            System.out.println("Identischer String");
        } else {
            System.out.println("Unterschiedliche Strings");
        }
    }
}
