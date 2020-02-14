package top.luyuni.sb2.event;

public class Test {
    public static void main(String[] args) {
        /**
         * 广播器
         */
        WeatherEventMulticaster eventMulticaster = new WeatherEventMulticaster();

        RainListener rainListener = new RainListener();
        SnowListener snowListener = new SnowListener();
        /**
         * 注册监听器
         */
        eventMulticaster.addListener(rainListener);
        eventMulticaster.addListener(snowListener);

        eventMulticaster.removeListener(snowListener);

        RainEvent rainEvent = new RainEvent();
        SnowEvent snowEvent = new SnowEvent();

        /**
         * 发布事件
         */
        eventMulticaster.multicastEvent(rainEvent);
        eventMulticaster.multicastEvent(snowEvent);
    }
}
