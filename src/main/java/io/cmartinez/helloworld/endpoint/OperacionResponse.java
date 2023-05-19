package io.cmartinez.helloworld.endpoint;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OperacionResponse {
  private int resultado;
  private String operacion;
  private int num1;
  private int num2;
}
