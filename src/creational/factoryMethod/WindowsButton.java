package creational.factoryMethod;

/**
 * Commun Product
 */
public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Render Wind Button");
        onCLick();
    }

    @Override
    public void onCLick() {
        System.out.println("Windows - Click! Button says - 'Hello World!'");
    }
}
