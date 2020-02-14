package top.luyuni.sb2.startrunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
@Order(1)
public class SecondCommandlineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("start up second commandlineRunner >>>>");
    }
}
