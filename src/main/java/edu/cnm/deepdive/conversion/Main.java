package edu.cnm.deepdive.conversion;

public class Main {

  public static void main(String[] args) {
    Converter converter = new Converter();
    for (String arg : args) {
      double celsius = Double.parseDouble(arg);
      double fahrenheit = converter.c2f(celsius);
      System.out.printf("Celsius = %6.2f; Fahrenheit = %6.2f%n", celsius, fahrenheit);
    }
  }

}
