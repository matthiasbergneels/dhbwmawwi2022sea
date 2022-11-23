package lecture.chapter6;

public class FarmRun {

    public static void main(String[] args) {

        // Animal myAnimal = new Animal(145f, 15f, "Tierchen");
        Dog myDog = new Dog(75f, 60f, "Bello", "Schäferhund");
        Dog myDog2 = new Dog(75f, 60f, "Bello", "Schäferhund");
        Bird myBird = new Bird(10f, 0.9f, "Tweety", true);

        /*
        myAnimal.breath();
        myAnimal.eat();
        myAnimal.move();
         */

        myDog.breath();
        myDog.eat();
        myDog.eat(1.8f);
        myDog.move();
        myDog.bark();

        myBird.breath();
        myBird.eat();
        myBird.move();
        myBird.tweet();
        //myBird.bark();


        // toString

        System.out.println(myDog);
        System.out.println(myDog2);
        System.out.println(myBird);


        // Reference Casting

        Animal myAnimal;

        // Narrowing Cast
        myAnimal = myDog;

        myAnimal.move();
        myAnimal.breath();
        myAnimal.eat();
        //myAnimal.bark();

        // Widening Cast
        Dog newMyDog = (Dog)myAnimal;

        newMyDog.eat();
        newMyDog.breath();
        newMyDog.eat();
        newMyDog.bark();

        Animal[] animalShelter = new Animal[5];

        animalShelter[0] = myDog;
        animalShelter[1] = myBird;
        animalShelter[2] = myDog2;
        animalShelter[3] = new Bird(10f, 0.1f, "Piepsy", true);


        System.out.println("\n\n\nTierpflege: ");
        for(Animal currentAnimal : animalShelter){
            if(currentAnimal == null){
                continue;
            }

            currentAnimal.move();
            currentAnimal.eat();
            currentAnimal.breath();

            if(currentAnimal instanceof Dog){
                Dog currentDog = (Dog)currentAnimal;
                currentDog.bark();
            }else{
                System.out.println("Kein Hund!");
            }
        }

        System.out.println(myAnimal instanceof Dog);        // -> true
        System.out.println(myAnimal instanceof Animal);     // -> true
        System.out.println(myAnimal instanceof Object);     // -> true
        System.out.println(myAnimal instanceof Bird);       // -> false

    }
}
