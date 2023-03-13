package lecture.chapter9;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public int hashCode() {
        return x + y;
    }
}
