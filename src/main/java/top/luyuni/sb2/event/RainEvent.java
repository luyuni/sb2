package top.luyuni.sb2.event;

public class RainEvent extends WeatherEvent {
    @Override
    public String getWeather() {
        return "rain";
    }
}
