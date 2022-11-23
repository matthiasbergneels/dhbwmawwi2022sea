package lecture.chapter6;

public class Dog extends Animal{
    private String breed;

    public Dog(float size, float weight, String description, String breed){
        super(size, weight, description);
        this.setBreed(breed);
    }

    public void bark(){
        System.out.println("Der Hund " + description + " bellt! *wuff*");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("als Hund Fleisch");
    }

    // Methode eat aus Super-Klasse überladen
    public void eat(float meatAmount){
        eat();
        System.out.println("und zwar " + meatAmount + " kg");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void breath(){
        System.out.println("Der Hund " + description + " atmet.");
    }

    public String toString(){
        return super.toString() + ", " + this.getBreed();
    }
}
