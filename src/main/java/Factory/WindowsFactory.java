package Factory;

import Factory.components.Button.Button;
import Factory.components.Button.WindowsButton;
import Factory.components.DropDown.DropDown;
import Factory.components.DropDown.WindowsDropDown;
import Factory.components.Menu.Menu;
import Factory.components.Menu.WindowsMenu;

public class WindowsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
