package top.luyuni.sb2.startrunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class FirstCommandlineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("start up first commandlineRunner >>>>");
    }
}
