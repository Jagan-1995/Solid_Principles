package Factory.helper;

import Factory.AndroidFactory;
import Factory.IOSFactory;
import Factory.UIFactory;
import Factory.WindowsFactory;
import Factory.constants.Platform;

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
