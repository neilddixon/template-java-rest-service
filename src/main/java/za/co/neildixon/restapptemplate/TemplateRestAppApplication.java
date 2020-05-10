package za.co.neildixon.restapptemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class TemplateRestAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateRestAppApplication.class, args);
    }

}
