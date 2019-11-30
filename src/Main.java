/**
 * Created by student3 on 30.11.19.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle= new Circle(45);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimetr());

        Triangel triangel=new Triangel(45,78,25);
        System.out.println(triangel.getPerimetr());
        System.out.println(triangel.getArea());

        Figure figure= new Circle(60);
        System.out.println(figure.getArea());
        System.out.println(figure.getPerimetr());

        Tiger t=new Tiger("Rest","Бенгальский",65,80,50);
        t.Eat();
        t.Go();
        t.Sleep();
        t.Print();

        Snake s=new Snake("Hameleon","Уж обыкноыенный",6, 30);
        s.Go();
        s.Eat();
        s.Sleep();
        s.Print();
        Point<Integer> p1=new Point<>(4,8);
        Point<Double> p2=new Point<>(4.5,55.5);

    }
}
