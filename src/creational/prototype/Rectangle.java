package creational.prototype;

public class Rectangle extends Shape{
    private int width;
    private int heingth;

    public Rectangle(Rectangle rectangle){
        super(rectangle);
        this.width = rectangle.width;
        this.heingth = rectangle.heingth;
    }

    public Rectangle() {
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeingth() {
        return heingth;
    }

    public void setHeingth(int heingth) {
        this.heingth = heingth;
    }
}
