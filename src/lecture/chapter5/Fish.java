package lecture.chapter5;

import lecture.chapter6.Animal;

public class Fish extends Animal {

    private boolean isSaltSeaFish;

    public Fish(float size, float weight, String description, boolean isSaltSeaFish) {
        super(size, weight, description);
        this.isSaltSeaFish = isSaltSeaFish;
    }

    @Override
    public void breath(){
        System.out.println("Der Fish " + description + " atmet.");
    }
}
