package Factory;

import Factory.constants.Platform;

public class Flutter {
    // Non-factory methods
    void refreshUI(){
        System.out.println("Refreshing the UI");
    }

    void setTheme(){
        System.out.println("Setting Theme");
    }

    /*
    getUIFactory actually returns the object corresponding to the platform type
    that's why it is called Factory method
     */
    /*
    This code of if else for creating corresponding object is moved to
    UIFactoryFactory class - Practical Factory Design pattern.
     */

    UIFactory getUIFactory(Platform platform){
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }
}
