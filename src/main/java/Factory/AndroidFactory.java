package Factory;

import Factory.components.Button.AndroidButton;
import Factory.components.Button.Button;
import Factory.components.DropDown.AndriodDropDown;
import Factory.components.DropDown.DropDown;
import Factory.components.Menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndriodDropDown();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
