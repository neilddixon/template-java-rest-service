package za.co.neildixon.restapptemplate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.co.neildixon.restapptemplate.config.properties.SampleConfigProperties;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TemplateRestAppApplicationTests {

    @Autowired
    SampleConfigProperties sampleConfigProperties;

    @Test
    void contextLoads() {
    }

    @Test
    void samplePropertyIsLoaded() {
        assertEquals("MySample", sampleConfigProperties.getName());
    }

}
