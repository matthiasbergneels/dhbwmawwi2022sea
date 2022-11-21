package lecture.chapter5.callbyexamples;

public class Person {

    private boolean hatBlauesAuge;

    public Person(){
        hatBlauesAuge = false;
    }

    public void schlagen(){
        hatBlauesAuge = true;
    }

    public boolean hatBlauesAuge(){
        return hatBlauesAuge;
    }


}
