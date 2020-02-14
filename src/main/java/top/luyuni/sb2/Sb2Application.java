package top.luyuni.sb2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import top.luyuni.sb2.initializer.SecondInitializer;
import top.luyuni.sb2.listener.SecondListener;

import java.util.Properties;

@SpringBootApplication
@MapperScan("top.luyuni.sb2.mapper")
@PropertySource({"demo.properties"})
public class Sb2Application {

    public static void main(String[] args) {
//        SpringApplication.run(Sb2Application.class, args);
//        SpringApplication springApplication = new SpringApplication(Sb2Application.class);
//        springApplication.addInitializers(new SecondInitializer());
//        springApplication.addListeners(new SecondListener());
//        springApplication.run(args);
        SpringApplication springApplication = new SpringApplication(Sb2Application.class);
        Properties properties = new Properties();
        properties.setProperty("luyuni", "niyulu1");
        springApplication.setDefaultProperties(properties);
        springApplication.run(args);
    }

}
