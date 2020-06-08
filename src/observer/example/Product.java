package observer.example;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{

    private String productName;
    private List<Observer> observerList = new ArrayList<>();
    private boolean avaliable;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notify All");
        for (Observer observer : observerList){
            observer.update(productName);
        }
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
        if (avaliable){
            notifyObservers();
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }
}
