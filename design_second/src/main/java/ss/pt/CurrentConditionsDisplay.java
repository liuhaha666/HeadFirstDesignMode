package ss.pt;
import java.util.Observer;
import java.util.Observable;

public class CurrentConditionsDisplay implements Observer{
    Observable observalbe;
    private float temperature;
    private float humidity;
    public CurrentConditionsDisplay(Observable observalbe){
        this.observalbe = observalbe;
        observalbe.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }

    }

    public  void display(){
        System.out.println("C c:" + temperature + "F degress and" + humidity + "% humidity");
    }
}
