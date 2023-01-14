package creational.abstractfactory.factory;

import creational.abstractfactory.buttons.Button;
import creational.abstractfactory.buttons.WindowsButton;
import creational.abstractfactory.checkboxes.Checkbox;
import creational.abstractfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
