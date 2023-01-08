package creational.factoryMethod;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("Render Macbook Button.");
        onCLick();
    }

    @Override
    public void onCLick() {
        System.out.println("MacBook - Click! Button says - 'Hello World!'");
    }
}
