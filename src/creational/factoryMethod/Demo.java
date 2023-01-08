package creational.factoryMethod;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configureDialog();
        runBusinessLogic();
    }

    public static void configureDialog(){
        dialog = new MacDialog();
    }

    public static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
