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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}
