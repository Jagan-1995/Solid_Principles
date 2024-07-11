package DesignPatterns.Creational.Factory;

import DesignPatterns.Creational.Factory.components.DropDown.DropDown;
import DesignPatterns.Creational.Factory.components.Menu.Menu;
import DesignPatterns.Creational.Factory.components.Button.Button;

public interface UIFactory {
    // factory methods

    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
