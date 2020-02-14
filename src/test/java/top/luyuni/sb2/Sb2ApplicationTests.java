package top.luyuni.sb2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.luyuni.sb2.event.WeatherRunListener;

@SpringBootTest
class Sb2ApplicationTests {

    @Autowired
    private WeatherRunListener weatherRunListener;

    @Test
    void contextLoads() {
    }

    @Test
    public void testEvent(){
        weatherRunListener.rain();
        weatherRunListener.snow();
    }
}
