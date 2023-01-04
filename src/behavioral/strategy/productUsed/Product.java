package behavioral.strategy.productUsed;

public class Product extends ProductAbs{
    private float price;
    private int amount;

    public Product(float price, int amount, ProductType productType) {
        super(productType);
        this.price = price;
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
