package DesignPatterns.Creational.Factory.helper;

import DesignPatterns.Creational.Factory.AndroidFactory;
import DesignPatterns.Creational.Factory.IOSFactory;
import DesignPatterns.Creational.Factory.UIFactory;
import DesignPatterns.Creational.Factory.WindowsFactory;
import DesignPatterns.Creational.Factory.constants.Platform;

public class Helper {
    public static UIFactory getUIFactoryForPlatform(Platform platform) {
        if (platform.equals(Platform.IOS)) {
            return new IOSFactory();
        } else if (platform.equals(Platform.WINDOWS)) {
            return new WindowsFactory();
        } else if (platform.equals(Platform.ANDROID)) {
            return new AndroidFactory();
        } else {
            throw new RuntimeException("Invalid platform");
        }
    }
}
/*
Constants and keywords
 */
