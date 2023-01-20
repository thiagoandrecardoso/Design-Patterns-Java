package creational.builders;

import creational.builders.cars.Car;
import creational.builders.cars.CarBuilder;
import creational.builders.cars.CarManualBuilder;
import creational.builders.cars.Manual;
import creational.builders.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
        car.getTripComputer().setCar(car);
        car.setFuel(10);
        car.getTripComputer().showFuelLever();

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);

        Manual carManual = carManualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
