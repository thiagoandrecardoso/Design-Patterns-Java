package creational.abstractfactory;

import creational.abstractfactory.app.Application;
import creational.abstractfactory.factory.GUIFactory;
import creational.abstractfactory.factory.MacOSFactory;
import creational.abstractfactory.factory.WindowsFactory;

public class Demo {

    public static Application configureApplication(){
        Application application;
        GUIFactory guiFactory = null;

        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.contains("mac")){
            guiFactory = new MacOSFactory();
        } else if (osName.contains("windows")) {
            guiFactory = new WindowsFactory();
        }

        assert guiFactory != null;
        application = new Application(guiFactory);

        return application;
    }

    public static void main(String[] args) {
        final Application application = configureApplication();
        application.paint();
    }
}
