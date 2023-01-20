package creational.builders.components;

import creational.builders.cars.Car;

/**
 * Just another feature of a car.
 */
public class TripComputer {
    private Car car;

    public void setCar(Car car){
        this.car = car;
    }

    public void showFuelLever(){
        System.out.println("Fuel lever:" + car.getFuel());
    }

    public void showStatus(){
        if(this.car.getEngine().isStarted()){
            System.out.println("Car is started");
        } else{
            System.out.println("Car isn't started");
        }
    }
}
