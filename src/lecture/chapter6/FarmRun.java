package lecture.chapter6;

public class FarmRun {

    public static void main(String[] args) {

        Animal myAnimal = new Animal(145f, 15f, "Tierchen");
        Dog myDog = new Dog(75f, 60f, "Bello", "Schäferhund");

        myAnimal.breath();
        myAnimal.eat();
        myAnimal.move();

        myDog.breath();
        myDog.eat();
        myDog.move();
        myDog.bark();
    }
}
