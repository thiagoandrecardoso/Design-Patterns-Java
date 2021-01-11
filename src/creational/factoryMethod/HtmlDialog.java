package creational.factoryMethod;

/**
 * Concrete creator
 */
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
