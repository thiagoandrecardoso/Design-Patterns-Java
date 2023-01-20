package creational.builders;

import creational.builders.cars.CarType;
import creational.builders.components.Engine;
import creational.builders.components.GPSNavigator;
import creational.builders.components.Transmission;
import creational.builders.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
