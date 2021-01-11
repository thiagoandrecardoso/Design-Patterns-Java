package creational.factoryMethod;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configureDialog("win");
        runBusinessLogic();
    }

    public static void configureDialog(String dialogId){
        if (dialogId.equals("html")){
            dialog = new HtmlDialog();
        } else if (dialogId.equals("win")){
            dialog = new WindowsDialog();
        }
    }

    public static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
