package creational.factoryMethod;

/**
 * Factory base create
 */
public abstract class Dialog {

    public void renderWindow(){
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
