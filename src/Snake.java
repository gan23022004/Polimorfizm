/**
 * Created by student3 on 30.11.19.
 */
public  class Snake extends Animal implements Printable,Slepeable {
    private double length;

    public Snake(String name, String vid, int age,double length) {
        super(name,age,vid);
        this.length = length;
    }

    @Override
    public void Go() {
        System.out.println(" I Crawl");

    }

    @Override
    public void Eat() {
        System.out.println(" I eat everythings");
    }

    @Override
    public void Print() {
        System.out.println(name+""+age+""+vid+""+length);
    }

    @Override
    public void Sleep() {
        System.out.println("сплю калачиком");

    }
}
