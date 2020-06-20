package strategy.userd;

public abstract class ProductAbs {
    public ProductType productType;

    public ProductAbs(ProductType productType) {
        this.productType = productType;
        init();
    }

    public void init(){
        productType.setProduct((Product) this);
    }
}
