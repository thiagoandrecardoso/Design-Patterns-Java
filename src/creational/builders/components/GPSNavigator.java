package creational.builders.components;
/**
 * Just another feature of a car.
 */
public class GPSNavigator {
    private final String route;

    public GPSNavigator(){
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}
