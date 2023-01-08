package creational.factoryMethod;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configureDialog("html");
        runBusinessLogic();
    }

    public static void configureDialog(String dialogId){
        if ("html".equals(dialogId)){
            dialog = new HtmlDialog();
        } else if ("win".equals(dialogId)){
            dialog = new WindowsDialog();
        }
    }

    public static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
