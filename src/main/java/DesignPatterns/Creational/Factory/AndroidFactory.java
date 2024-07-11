package DesignPatterns.Creational.Factory;

import DesignPatterns.Creational.Factory.components.Button.AndroidButton;
import DesignPatterns.Creational.Factory.components.Button.Button;
import DesignPatterns.Creational.Factory.components.DropDown.AndriodDropDown;
import DesignPatterns.Creational.Factory.components.DropDown.DropDown;
import DesignPatterns.Creational.Factory.components.Menu.Menu;

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
