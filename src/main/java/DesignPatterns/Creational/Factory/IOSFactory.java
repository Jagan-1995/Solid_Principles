package DesignPatterns.Creational.Factory;

import DesignPatterns.Creational.Factory.components.Button.IOSButton;
import DesignPatterns.Creational.Factory.components.DropDown.DropDown;
import DesignPatterns.Creational.Factory.components.Menu.Menu;
import DesignPatterns.Creational.Factory.components.Button.Button;
import DesignPatterns.Creational.Factory.components.DropDown.IOSDropDown;

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
