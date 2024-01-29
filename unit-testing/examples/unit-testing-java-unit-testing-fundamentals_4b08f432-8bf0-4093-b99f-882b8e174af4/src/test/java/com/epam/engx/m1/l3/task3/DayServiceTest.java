package com.epam.engx.m1.l3.task3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DayServiceTest {
  DayService dayService = new DayService();

  @ParameterizedTest
  @ValueSource(ints = {1, 2})
  public void When_TheDateIsWeekday_Expect_ReturnFalse(int dayOfMonth) {
    LocalDate date = LocalDate.of(2023, 2, dayOfMonth);
    boolean result = dayService.isTodayWorkingDay(date);
    assertTrue(result);
  }


  @ParameterizedTest
  @ValueSource(ints = {6, 7, 8, 9, 10})
  public void When_TheDateIsWeekday_Expect_ReturnTrue(int dayOfMonth) {
    LocalDate date = LocalDate.of(2023, 2, dayOfMonth);
    boolean result = dayService.isTodayWorkingDay(date);
    assertTrue(result);
  }
}
