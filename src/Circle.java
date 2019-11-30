/**
 * Created by student3 on 30.11.19.
 */
public class Circle extends Figure {
    private double Radius;

    public Circle(double radius) {
        Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    @Override
    public double getArea() {

        return Math.PI*Radius*Radius;
    }

    @Override
    public double getPerimetr() {
        return Math.PI*Radius*2;
    }
}
