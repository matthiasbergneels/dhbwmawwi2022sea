package lecture.chapter4;

public class SwitchCaseExample {

    public static void main(String[] args) {

        int grade = 4;

        switch(grade){
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Ausreichend");
                break;
            case 5:
                System.out.println("Ungenügend");
                break;
            default:
                System.out.println("ungültige Note");
        }


        switch(grade){
            case 4:
                System.out.print("Knapp ");
            case 1:
            case 2:
            case 3:
                System.out.println("Klausur bestanden");
                break;
            case 5:
            case 6:
                System.out.println("Durchgefallen");
                break;
            default:
                System.out.println("ungültige Note");
        }


        boolean whatEver = switch(grade){
            case 1,2,3,4 -> {System.out.println("Bestanden");
                            yield true;}
            case 5 -> false;
            default -> false;
        };

    }
}
