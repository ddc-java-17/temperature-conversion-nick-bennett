package edu.cnm.deepdive.conversion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ConverterTest {

  public static final double TOLERANCE = 0.001;

  @ParameterizedTest
  @CsvSource(value = {
      "celsius, expected fahrenheit",
      "0, 32",
      "100, 212",
      "-40, -40",
      "14, 57.2",
      "90.5, 194.9"
  }, useHeadersInDisplayName = true)
  void c2f(double celsius, double expected) {
    Converter converter = new Converter();
    assertEquals(expected, converter.c2f(celsius), TOLERANCE);
  }

}