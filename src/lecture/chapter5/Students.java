package lecture.chapter5;

public class Students {

    private int id;

    public void drink(float amount){
        System.out.println("Der Student trinkt die Menge " + amount + "l");
    }

    public void drink(float amount, float alcoholInPercentage){
        drink(amount);
        System.out.println("und wird "+ (alcoholInPercentage > 20 ? "schnell" : "langsam") +" betrunken");
    }

    public void drink(float amount, boolean isPoisened){
        drink(amount);
        System.out.println("und stirbt");
    }

    public void drink(float amount, double coffeinInMg){
        drink(amount);
        System.out.println("und wird "+ (coffeinInMg > 50 ? "schnell" : "langsam") +" wach");
    }

    /*
    Valide Signaturen zum Überladen:
    drink(float)
    drink(float, float)
    drink(float, float, float)
    drink(float, boolean)
    drink(float, double)
    drink(double, float)
    drink(double, boolean)
    ...

     */
}
