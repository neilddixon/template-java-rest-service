package za.co.neildixon.restapptemplate.controller.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class PingResponse {
    private String message;

    @JsonCreator
    public PingResponse(@JsonProperty("message") String message) {
        this.message = message;
    }
}
