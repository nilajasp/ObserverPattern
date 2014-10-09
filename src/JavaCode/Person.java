package JavaCode;

/**
 * Created by nilajapatankar on 10/6/14.
 */
public class Person implements Observer{
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(boolean available) {
        String availability = available ? "available" : "not available";
        System.out.println("Hello "+name+", Product is now "+availability);
    }
}
