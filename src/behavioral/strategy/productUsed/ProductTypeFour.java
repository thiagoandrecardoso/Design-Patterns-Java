package behavioral.strategy.productUsed;

public class ProductTypeFour implements ProductType{
    Product product = null;
    @Override
    public float calcFinalValue() {
        float finalValue;

        if (product.getPrice() >= 1000) {
            finalValue = (float) ((product.getPrice() * product.getAmount()) * 0.9);
        } else {
            finalValue = (product.getPrice() * product.getAmount());
        }

        return finalValue;
    }

    @Override
    public void setProduct(Product product) {
        this.product = product;
    }
}
