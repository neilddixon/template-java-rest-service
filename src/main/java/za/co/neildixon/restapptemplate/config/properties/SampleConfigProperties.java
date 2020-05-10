package za.co.neildixon.restapptemplate.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "sample")
@Component
@Data
public class SampleConfigProperties {
    private String name;
}
