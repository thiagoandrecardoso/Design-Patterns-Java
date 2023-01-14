package creational.abstractfactory.factory;

import creational.abstractfactory.buttons.Button;
import creational.abstractfactory.checkboxes.Checkbox;
/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
