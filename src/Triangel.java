/**
 * Created by student3 on 30.11.19.
 */
public class Triangel extends Figure {
    private double a, b,c;

    public Triangel(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double getArea() {
        double pp=getPerimetr()/2;

        return Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));
    }

    @Override
    public double getPerimetr() {
        return a+b+c;
    }
}
