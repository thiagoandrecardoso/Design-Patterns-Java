package creational.abstractfactory.app;

import creational.abstractfactory.buttons.Button;
import creational.abstractfactory.checkboxes.Checkbox;
import creational.abstractfactory.factory.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
