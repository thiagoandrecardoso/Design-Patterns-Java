package creational.prototype.iaexample;

public class PrototypeExample {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Original");
        ConcretePrototype clone = (ConcretePrototype) prototype.clone();

        System.out.println("Original: " + prototype.getProperty());
        System.out.println("Clone: " + clone.getProperty());
    }
}
