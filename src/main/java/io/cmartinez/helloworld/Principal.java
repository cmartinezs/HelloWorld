package io.cmartinez.helloworld;

public class Principal {
  public static void main(String[] args) {
    OperacionMatematica operacion = new OperacionMatematica();
    operacion.setOperacion("suma");
    operacion.setOperando1(10);
    operacion.setOperando2(25);
    int resultado = operacion.realizarOperacion();
    System.out.println("Resultado: " + resultado);

    int a = 20;
    int b = 50;

    System.out.println("Operaciones básicas en Java");
    System.out.println("a + b: " + (a + b));
    System.out.println("a - b: " + (a - b));
    System.out.println("b - a: " + (b - a));
    System.out.println("a * b: " + (a * b));
    System.out.println("a / b: " + (a / b));
    System.out.println("a / b: " + ((double)a / (double)b));
    System.out.println("a % b: " + (a % b));
    System.out.println("a == b: " + (a == b));
    System.out.println("a != b: " + (a != b));
    System.out.println("a > b: " + (a > b));
    System.out.println("a < b: " + (a < b));
    System.out.println("a > = b: " + (a >= b));
    System.out.println("a < = b: " + (a <= b));
    System.out.println("a^b: " + (Math.pow(a, b)));
    System.out.println("a == b o a < = b: " + (a == b || a <= b));
    System.out.println("a != b y a < b: " + (a != b && a < b));
    System.out.println("a != b y a > b: " + (a != b && a > b));

    int c = 50;
    int d = 100;
    if(c < d){
      System.out.println(c + " es menor a " + d);
    } else {
      System.out.println(c + " no es menor a " + d);
    }

    while(c < d) {
      System.out.println(c + " es menor a " + d);
      c = c + 2;
    }

    c = 90;

    while(d == 100) {
      System.out.println(c + " es menor a " + d);
      c = c + 2;
      if(c == 100){
        break;
      }
    }

    for(int i = 0; i < 10; i++){
      System.out.println("Ciclo numero " + i);
    }

    for(int i = 1; i <= 10; i++){
      System.out.println("Ciclo numero " + i);
    }

    String texto = "Me gusta el curso de ProgWeb";
    System.out.println("Tamaño: " + texto.length());
    System.out.println("Substring: " + texto.substring(12));
    System.out.println("Substring: " + texto.substring(10, 20));
  }
}
