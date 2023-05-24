package io.cmartinez.helloworld;

public class Principal {
  public static void main(String[] args) {
    OperacionMatematica operacion = new OperacionMatematica();
    operacion.setOperacion("suma");
    operacion.setOperando1(10);
    operacion.setOperando2(25);
    int resultado = operacion.realizarOperacion();
    System.out.println("Resultado: " + resultado);
  }
}
