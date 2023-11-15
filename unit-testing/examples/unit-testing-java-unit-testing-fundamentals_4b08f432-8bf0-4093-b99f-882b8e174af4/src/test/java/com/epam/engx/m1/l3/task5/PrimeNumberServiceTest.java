package com.epam.engx.m1.l3.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberServiceTest {
  private final PrimeNumberService primeNumberService = new PrimeNumberService();
  private final int MAX_ALREADY_LOADED_NUMBER = 250000;

  @Test
  public void When_theNumberPrimeAndIsInCached_Expect_ReturnTrue() {
    int number = 7;
    assertTrue(primeNumberService.isPrime(number));
  }

  @Test
  public void When_theNumberIsNotPrimeAndIsInCached_Expect_ReturnFalse() {
    int number = 12;
    assertFalse(primeNumberService.isPrime(number));
  }

  @Test
  public void When_theNumberIsPrimeAndIsNotInCached_Expect_ReturnTrue() {
    int number = MAX_ALREADY_LOADED_NUMBER + 13;
    assertTrue(primeNumberService.isPrime(number));
  }

  @Test
  public void When_theNumberIsNotPrimeAndIsNotInCached_Expect_ReturnFalse() {
    int number = MAX_ALREADY_LOADED_NUMBER + 9;
    assertFalse(primeNumberService.isPrime(number));
  }

  @Test
  public void When_theNumberIsNegative_Expect_ThrowException() {
    int number = -10;
    assertThrows(ArrayIndexOutOfBoundsException.class, () ->
      primeNumberService.isPrime(number));
  }

}
