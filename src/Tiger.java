/**
 * Created by student3 on 30.11.19.
 */
public class Tiger extends Animal implements Printable,Slepeable {
    private double weight;
    private double height;


    public Tiger(String name, String vid, int age, double weight, double height) {
        super(name, age, vid);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void Go() {
        System.out.println("Run");
    }

    @Override
    public void Eat() {
        System.out.println("Eat meat");
    }

    @Override
    public void Print() {
        System.out.println(name +""+vid+""+age+""+""+weight+""+height);
    }

    @Override
    public void Sleep() {
        System.out.println("сплю как хочу");

    }
}
