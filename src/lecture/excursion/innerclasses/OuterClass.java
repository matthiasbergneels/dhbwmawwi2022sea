package lecture.excursion.innerclasses;

public class OuterClass {

    public static interface Printable{
        void printMessage(String message);
    }

    private static String staticInfo = "Äußere Klasse statische Info";
    private String instanceInfo = "Äußere Klasse instanz Info ";
    private OuterClass.Printable myPrintable;

    public OuterClass(int id){
        instanceInfo = instanceInfo + id;
    }

    // Inner Top Level Class
    public static class InnereTopLevelClass{

        public void printMessage(String message){
            System.out.println("Nachricht von " + this.getClass() + ": " + message);
            System.out.println("Static Info: " + staticInfo);
            //System.out.println("Instance Info: " + instanceInfo);
        }
    }

    // Inner Element Class
    public class InnerElementClass{
        public void printMessage(String message){
            System.out.println("Nachricht von " + this.getClass() + ": " + message);
            System.out.println("Static Info: " + staticInfo);
            System.out.println("Instance Info: " + instanceInfo);
        }
    }

    public void printMessage(String message){
        System.out.println("Nachricht von " + this.getClass() + ": " + message);
        System.out.println("Static Info: " + staticInfo);
        System.out.println("Instance Info: " + instanceInfo);
    }

    public void printFromInnerLocalClass(String messageToInnerClass){
        // Inner Local Class
        class InnerLocalClass{
            public void printMessage(String message){
                System.out.println("Nachricht von " + this.getClass() + ": " + message);
                System.out.println("Static Info: " + staticInfo);
                System.out.println("Instance Info: " + instanceInfo);
            }
        }

        InnerLocalClass myInnerLocalClassObject = new InnerLocalClass();
        myInnerLocalClassObject.printMessage(messageToInnerClass);
    }

    public void printFromAnonymousClass(String messageToInnerClass){

        OuterClass.Printable myAnonymousClassObject = new OuterClass.Printable() {
            private int counter = 0;
            @Override
            public void printMessage(String message) {
                System.out.println("Nachricht von " + this.getClass() + ": " + message);
                System.out.println("Static Info: " + staticInfo);
                System.out.println("Instance Info: " + instanceInfo);
                System.out.println(counter++);
            }

            public int getCounter(){
                return counter;
            }
        };

        if(myPrintable == null)
            myPrintable = myAnonymousClassObject;

        myPrintable.printMessage(messageToInnerClass);
    }

    public void printWithLambdaFunction(String messageToLambdaFunction){
        Printable myLambdaFunction = message -> {
            System.out.println("Nachricht von " + this.getClass() + ": " + message);
            System.out.println("Static Info: " + staticInfo);
            System.out.println("Instance Info: " + instanceInfo);
        };

        myLambdaFunction.printMessage(messageToLambdaFunction);
    }

    public static void main(String[] args) {
        String message = "Hello from the inner World";

        OuterClass myOuterClassObject = new OuterClass(1);
        myOuterClassObject.printMessage(message);

        OuterClass.InnereTopLevelClass myInnerTopLevelClassObject = new OuterClass.InnereTopLevelClass();
        myInnerTopLevelClassObject.printMessage(message);

        OuterClass.InnerElementClass myInnerElementClassObject = myOuterClassObject.new InnerElementClass();
        myInnerElementClassObject.printMessage(message);

        OuterClass myOuterClassSecondObject = new OuterClass(2);
        OuterClass.InnerElementClass myInnerElementClassSecondObject = myOuterClassSecondObject.new InnerElementClass();
        myInnerElementClassSecondObject.printMessage(message);

        myOuterClassObject.printFromInnerLocalClass(message);

        myOuterClassObject.printFromAnonymousClass(message);
        myOuterClassObject.printFromAnonymousClass(message);
        myOuterClassObject.printFromAnonymousClass(message);
        myOuterClassObject.printFromAnonymousClass(message);
        myOuterClassObject.printFromAnonymousClass(message);

        myOuterClassObject.printWithLambdaFunction(message);
    }
}
