package observer.example;

public class RunObserverPattern {

    public static void main(String[] args) {
        Costumer costumer1 = new Costumer();
        costumer1.setCostumerName("Iago");
        Costumer costumer2= new Costumer();
        costumer2.setCostumerName("Chefe");

        Product product1 = new Product();
        product1.setProductName("iPhone 8");
        product1.setAvaliable(false);

        product1.registerObserver(costumer1);
        product1.registerObserver(costumer2);

        product1.setAvaliable(true);
    }

}
