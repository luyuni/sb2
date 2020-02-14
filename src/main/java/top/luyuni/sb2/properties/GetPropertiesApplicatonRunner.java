package top.luyuni.sb2.properties;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class GetPropertiesApplicatonRunner implements ApplicationRunner, EnvironmentAware {

    private Environment environment;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(environment.getProperty("luyuni"));
        System.out.println(environment.getProperty("luyuni.age"));
        System.out.println(environment.getProperty("luyuni.path"));
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
