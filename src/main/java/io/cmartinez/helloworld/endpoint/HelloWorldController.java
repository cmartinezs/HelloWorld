package io.cmartinez.helloworld.endpoint;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/greetings")
    public ResponseEntity<GreetingsResponse> greetings(){
        GreetingsResponse response = new GreetingsResponse();
        response.setGreetings("Hello World!");
        return ResponseEntity.ok(response);
    }
}
