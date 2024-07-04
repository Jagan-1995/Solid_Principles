package Factory;

import Factory.components.Button.Button;
import Factory.components.DropDown.DropDown;
import Factory.components.Menu.Menu;
import Factory.constants.Platform;

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