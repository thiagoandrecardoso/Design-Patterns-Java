package creational.prototype.iaexample;

public class ConcretePrototype implements Protorype{

    private String property;

    public ConcretePrototype(String property) {
        this.property = property;
    }

    @Override
    public Protorype clone() {
        return new ConcretePrototype(property);
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
