package edu.cnm.deepdive.conversion;

public class Converter {

  private static final double CELSIUS_FAHRENHEIT_SCALE_FACTOR = 1.8;
  private static final int FAHRENHEIT_OFFSET_FROM_CELSIUS = 32;

  public double c2f(double celsius) {
    return CELSIUS_FAHRENHEIT_SCALE_FACTOR * celsius + FAHRENHEIT_OFFSET_FROM_CELSIUS;
  }

}
