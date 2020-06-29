package observer.weather;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30);
        weatherData.setMeasurements(82, 70, 29);
        weatherData.setMeasurements(78, 90, 29);
    }
}
