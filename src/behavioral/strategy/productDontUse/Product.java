package behavioral.strategy.productDontUse;

public class Product {

    private float price;
    private int amount;
    private int type;

    public Product(float price, int amount, int type) {
        this.price = price;
        this.amount = amount;
        this.type = type;
    }

    public float calcFinalValue() {
        float finalValue = (float) 0.0;

        if (type == 1) {
            if (amount <= 10) {
                finalValue = price * amount;
            } else if (amount <= 50) {
                finalValue = (float) ((price * amount) * 0.9);
            } else if (amount <= 100) {
                finalValue = (float) ((price * amount) * 0.8);
            } else {
                finalValue = (float) ((price * amount) * 0.7);
            }
        } else if (type == 2) {
            if (amount <= 10) {
                finalValue = price * amount;
            } else if (amount <= 50) {
                finalValue = (float) ((price * amount) * 0.8);
            } else if (amount <= 100) {
                finalValue = (float) ((price * amount) * 0.7);
            } else {
                finalValue = (float) ((price * amount) * 0.6);
            }
        } else if (type == 3) {
            if (amount <= 10) {
                finalValue = price * amount;
            } else if (amount <= 50) {
                finalValue = (float) ((price * amount) * 0.7);
            } else if (amount <= 100) {
                finalValue = (float) ((price * amount) * 0.6);
            } else {
                finalValue = (float) ((price * amount) * 0.5);
            }
        }
        return finalValue;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
