package behavioral.observer.classroom;

import java.util.ArrayList;

public class Teacher implements Subject{
    private ArrayList observers;

    private int testDay;

    public Teacher() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(testDay);
        }
    }

    public void setTestDay(int testDay){
        this.testDay = testDay;
        notifyObservers();
    }
}
