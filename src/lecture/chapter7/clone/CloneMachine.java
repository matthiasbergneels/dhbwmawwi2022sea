package lecture.chapter7.clone;

public class CloneMachine {

    public static void main(String[] args) throws CloneNotSupportedException {

        Sheep dolly = new Sheep("Dolly", 3);

        Sheep dollyClone = dolly.clone();

        System.out.println("Dolly: " + dolly);
        System.out.println("Dolly geklont: " + dollyClone);
        System.out.println("Dolly == Dolly geklont: " + (dolly == dollyClone));


    }
}
