package creational.factoryMethod;

/**
 * Commun Product
 */
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("Render html");
        onCLick();
    }

    @Override
    public void onCLick() {
        System.out.println("HTML - Click! Button says - 'Hello World!'");
    }
}
