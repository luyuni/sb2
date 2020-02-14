package top.luyuni.sb2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.luyuni.sb2.initializer.SecondInitializer;
import top.luyuni.sb2.listener.SecondListener;

@SpringBootApplication
@MapperScan("top.luyuni.sb2.mapper")
public class Sb2Application {

    public static void main(String[] args) {
//        SpringApplication.run(Sb2Application.class, args);
        SpringApplication springApplication = new SpringApplication(Sb2Application.class);
        springApplication.addInitializers(new SecondInitializer());
        springApplication.addListeners(new SecondListener());
        springApplication.run(args);
    }

}
