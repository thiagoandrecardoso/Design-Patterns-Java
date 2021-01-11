package creational.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        People people = People.getInstance();
        people.setName("Sarah Lopes");
        System.out.println(people.getName());

        People people1 = People.getInstance();
        System.out.println(people1.getName());
    }
}
