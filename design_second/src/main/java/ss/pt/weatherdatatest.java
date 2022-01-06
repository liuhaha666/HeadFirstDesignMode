package ss.pt;

public class weatherdatatest {
    public static void main(String[] args) throws Exception {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80 ,65,30.4f);
        weatherData.setMeasurements(78 ,90,29.2f);
    }
}
