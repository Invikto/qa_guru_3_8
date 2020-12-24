package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {

  @Test
  void positiveTest() {
    assertTrue(true);
  }

  @Test
  void negativeTest() {
    assertTrue(false, "I'm sorry :(");
  }

}
