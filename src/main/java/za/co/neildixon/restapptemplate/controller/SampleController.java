package za.co.neildixon.restapptemplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.neildixon.restapptemplate.controller.dto.PingResponse;

@RestController
@RequestMapping(path = "/sample")
public class SampleController {

    @GetMapping("/ping")
    public PingResponse ping(){
        return new PingResponse("pong");
    }
}
