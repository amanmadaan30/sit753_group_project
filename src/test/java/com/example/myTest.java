package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

  // Test for the add method
  @Test
  public void testAdd() {
    App app = new App();
    int result = app.add(5, 3);
    assertEquals(8, result, "The add method should return the sum of two numbers");
  }
}
