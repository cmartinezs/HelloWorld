package io.cmartinez.helloworld;

public class OperacionMatematica {
  private String operacion;
  private int operando1;
  private int operando2;

  public void setOperacion(String nombre){
    operacion = nombre;
  }

  public void setOperando1(int a){
    operando1 = a;
  }

  public void setOperando2(int b){
    operando2 = b;
  }

  public int realizarOperacion(){
    int resultado = 0;
    if(operacion.equals("suma")){
      resultado = operando1 + operando2;
    }

    if(operacion.equals("resta")){
      resultado = operando1 - operando2;
    }

    if(operacion.equals("multiplicacion")){
      resultado = operando1 * operando2;
    }

    if(operacion.equals("division")){
      resultado = operando1 / operando2;
    }
    return resultado;
  }
}
