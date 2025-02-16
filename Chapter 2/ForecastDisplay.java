import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure = 29.92f;
    private float lastPressure;
    Observable observable;

    public ForecastDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg)
    {
        if(obs instanceof WeatherData)
        {
            WeatherData weatherData = (WeatherData)obs;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    public void display()
    {
        System.out.println("Current conditions: " + temperature 
            + "F degrees and " + humidity + "% humidity");
    }
}
