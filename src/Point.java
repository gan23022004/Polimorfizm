/**
 * Created by student3 on 30.11.19.
 */
public class Point<T>{
    private T x,y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }
}
