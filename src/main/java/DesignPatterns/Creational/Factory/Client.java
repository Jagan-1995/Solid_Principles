package DesignPatterns.Creational.Factory;

import DesignPatterns.Creational.Factory.components.Button.Button;
import DesignPatterns.Creational.Factory.components.DropDown.DropDown;
import DesignPatterns.Creational.Factory.constants.Platform;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(Platform.ANDROID );

        Button button = uiFactory.createButton();
        DropDown dropDown = uiFactory.createDropDown();

        button.clickButton();
        button.showButton();

        dropDown.showDropDown();


    }
}
 // testing