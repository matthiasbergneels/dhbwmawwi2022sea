package lecture.chapter6;

public final class Bird extends Animal{

    private boolean canFly;

    public Bird(float size, float weight, String description, boolean canFly) {
        super(size, weight, description);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public void tweet(){
        System.out.println("Der Vogel " + description + " zwitschert. *beep*");
    }

    @Override
    public void breath(){
        System.out.println("Der Vogel " + description + " atmet.");
    }
}
