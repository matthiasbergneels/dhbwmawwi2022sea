package lecture.chapter6;

public class Animal {

    private float size;
    private float weight;
    protected String description;

    public Animal(float size, float weight, String description){
        this.setSize(size);
        this.setWeight(weight);
        this.setDescription(description);
    }

    public void breath(){
        System.out.println("Das Tier " + description + " atmet.");
    }

    public void eat(){
        System.out.println("Das Tier " + description + " frisst.");
    }

    public void move(){
        System.out.println("Das Tier " + description + " bewegt sich.");
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
