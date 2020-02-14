package top.luyuni.sb2.event;

public interface EventMulticaster {
    void multicastEvent(WeatherEvent event);

    void addListener(WeatherListener listener);

    void removeListener(WeatherListener listener);
}
