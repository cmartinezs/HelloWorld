package io.cmartinez.helloworld.endpoint;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
  @GetMapping("/hello-world")
  public String helloWorld() {
    return "Hello World!";
  }

  @GetMapping("/greetings")
  public ResponseEntity<GreetingsResponse> greetings(@RequestParam(required = false) String name) {
    if(name == null){
      name = "World";
    }
    GreetingsResponse response = new GreetingsResponse();
    response.setGreetings("Hello " + name + "!");
    return ResponseEntity.ok(response);
  }
}
