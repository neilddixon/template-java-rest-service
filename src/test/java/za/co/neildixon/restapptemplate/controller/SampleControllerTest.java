package za.co.neildixon.restapptemplate.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import za.co.neildixon.restapptemplate.controller.dto.PingResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
class SampleControllerTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void shouldGetPingResponse(){
        PingResponse pingResponse = testRestTemplate.getForObject("/sample/ping", PingResponse.class);

        assertEquals("pong", pingResponse.getMessage());

    }

}
