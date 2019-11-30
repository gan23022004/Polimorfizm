/**
 * Created by student3 on 30.11.19.
 */
public abstract class Animal {
    protected String name;
    protected int age;
    protected String vid;

    public Animal(String name, int age, String vid) {
        this.name = name;
        this.age = age;
        this.vid = vid;
    }


     abstract public void Go();
    abstract public void Eat();

}
