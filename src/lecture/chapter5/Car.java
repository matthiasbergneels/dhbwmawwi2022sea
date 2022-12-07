package lecture.chapter5;

public class Car {

    private int hp;
    private String color;
    private int currentSpeed;
    public final ALLOWED_BRANDS brand;

    private static int carCount;
    private static Car[] garage = new Car[100];

    public final static String ALLOWED_COLOR_RED = "rot";
    public final static String ALLOWED_COLOR_GREEN = "grün";
    public final static String ALLOWED_COLOR_BLUE= "blau";
    public final static String ALLOWED_COLOR_BLACK = "schwarz";

    public enum ALLOWED_BRANDS{
        Fiat,
        Mercedes,
        BMW,
        Tesla,
        Jeep
    }

    public Car(int hp, String color, ALLOWED_BRANDS brand){
        setHp(hp);
        this.color = color;
        this.brand = brand;

        currentSpeed = 0;

        carCount++;
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == null){
                garage[i] = this;
                break;
            }
        }
    }

    public void setColor(String color) {
        if(color.equals(ALLOWED_COLOR_GREEN)
            || color.equals(ALLOWED_COLOR_BLUE)
                || color.equals(ALLOWED_COLOR_RED)
                || color.equals(ALLOWED_COLOR_BLACK)){
            this.color = color;
        } else {
            this.color = ALLOWED_COLOR_BLACK;
        }

    }

    public void accelerate(int deltaSpeed){
        currentSpeed = currentSpeed + deltaSpeed;
        System.out.println("Auto wird schneller - aktuell " + currentSpeed + " kmh");
    }

    public void brake(){
        currentSpeed = currentSpeed - 10;
        System.out.println("Auto wird langsamer - aktuell " + currentSpeed + " kmh");
    }

    public void fullBreak(){
        currentSpeed = 0;
        System.out.println("Auto steht!");
    }

    public int getHp(){
        return hp;
    }

    public void setHp(int newHp){
        if(newHp > 0 && newHp <= 1000){
            hp = newHp;
        } else {
            hp = 150;
        }

    }

    public String getColor(){
        return color;
    }

    public ALLOWED_BRANDS getBrand(){
        return brand;
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }

    @Override
    protected void finalize() {
        System.out.println("Der " + brand + "(Farbe: "+ color +")  wird verschrottet");
        carCount--;
    }

    public static int getCarCount(){
        return carCount;
    }

    public static void rePaintAllCars(String color){
        for(Car currentCar : garage){
            currentCar.color = color;
        }
    }
}
