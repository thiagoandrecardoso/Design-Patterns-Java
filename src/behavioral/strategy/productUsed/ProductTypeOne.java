package behavioral.strategy.productUsed;

public class ProductTypeOne implements ProductType {
    Product product = null;
    @Override
    public float calcFinalValue() {
        float finalValue;

        if (product.getAmount() <= 10) {
            finalValue = product.getPrice() * product.getAmount();
        } else if (product.getAmount() <= 50) {
            finalValue = (float) ((product.getPrice() * product.getAmount()) * 0.9);
        } else if (product.getAmount() <= 100) {
            finalValue = (float) ((product.getPrice() * product.getAmount()) * 0.8);
        } else {
            finalValue = (float) ((product.getPrice() * product.getAmount()) * 0.7);
        }

        return finalValue;
    }

    @Override
    public void setProduct(Product product) {
        this.product = product;
    }
}
