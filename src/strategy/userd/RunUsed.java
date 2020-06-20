package strategy.userd;

public class RunUsed {
    public static void main(String[] args) {

        ProductType type = new ProductTypeFour();

        Product product = new Product((float) 1000.00, 2, type);

        System.out.println(product.productType.calcFinalValue());
    }
}
