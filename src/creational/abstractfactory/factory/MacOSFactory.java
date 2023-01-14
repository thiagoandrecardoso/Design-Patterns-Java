package creational.abstractfactory.factory;

import creational.abstractfactory.buttons.Button;
import creational.abstractfactory.buttons.MacOSButton;
import creational.abstractfactory.checkboxes.Checkbox;
import creational.abstractfactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
