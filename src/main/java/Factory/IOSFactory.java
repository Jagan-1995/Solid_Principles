package Factory;

import Factory.components.Button.Button;
import Factory.components.Button.IOSButton;
import Factory.components.DropDown.DropDown;
import Factory.components.DropDown.IOSDropDown;
import Factory.components.Menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
