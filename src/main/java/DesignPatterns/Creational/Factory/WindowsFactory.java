package DesignPatterns.Creational.Factory;

import DesignPatterns.Creational.Factory.components.Menu.WindowsMenu;
import DesignPatterns.Creational.Factory.components.Button.Button;
import DesignPatterns.Creational.Factory.components.Button.WindowsButton;
import DesignPatterns.Creational.Factory.components.DropDown.DropDown;
import DesignPatterns.Creational.Factory.components.DropDown.WindowsDropDown;
import DesignPatterns.Creational.Factory.components.Menu.Menu;

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
