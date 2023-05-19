package io.cmartinez.helloworld.endpoint;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperacionMatematicaController {
  @GetMapping("/operacion-matematica")
  public ResponseEntity<OperacionResponse> operacion(String operacion, int num1, int num2){
    int resultado = 0;
    if(operacion.equals("suma")){
      resultado = num1 + num2;
    } else if(operacion.equals("resta")){
      resultado = num1 - num2;
    } else if(operacion.equals("multiplicacion")){
      resultado = num1 * num2;
    } else if(operacion.equals("division")){
      resultado = num1 / num2;
    }
    OperacionResponse response = new OperacionResponse();
    response.setOperacion(operacion);
    response.setNum1(num1);
    response.setNum2(num2);
    response.setResultado(resultado);
    return ResponseEntity.ok(response);
  }
}
