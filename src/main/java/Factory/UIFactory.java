package Factory;

import Factory.components.Button.Button;
import Factory.components.DropDown.DropDown;
import Factory.components.Menu.Menu;

public interface UIFactory {
    // factory methods

    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
