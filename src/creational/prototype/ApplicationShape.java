package creational.prototype;

public class ApplicationShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(4);
        rectangle.setHeingth(5);
        rectangle.x = 10;
        rectangle.y = 11;

        Rectangle rectangleClone = (Rectangle) rectangle.clone();

        System.out.println("Original: " + rectangle.getHeingth());
        System.out.println("Clone: " + rectangleClone.getHeingth());
        System.out.println("Original: " + rectangle.x);
        System.out.println("Clone: " + rectangleClone.x);
    }
}
