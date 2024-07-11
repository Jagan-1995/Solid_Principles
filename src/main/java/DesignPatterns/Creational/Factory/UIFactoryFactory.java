package DesignPatterns.Creational.Factory;

import DesignPatterns.Creational.Factory.constants.Platform;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryForPlatform(Platform platform){
        if(platform.equals(Platform.IOS)){
            return new IOSFactory();
        }
        else if(platform.equals(Platform.WINDOWS)){
            return new WindowsFactory();
        }
        else if(platform.equals(Platform.ANDROID)){
            return new AndroidFactory();
        }
        else {
            throw new RuntimeException("Invalid platform");
        }
    }
}
