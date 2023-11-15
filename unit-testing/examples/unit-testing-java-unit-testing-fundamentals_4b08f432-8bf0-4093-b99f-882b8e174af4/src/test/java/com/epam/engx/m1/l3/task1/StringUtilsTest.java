package com.epam.engx.m1.l3.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class StringUtilsTest {

  StringUtils stringUtils;

  @BeforeEach
  public void setup() {
    stringUtils = new StringUtils();
  }

  @Test
  public void When_TheTextDoesNotStartWithPrefix_Expect_ReturnsFalse() {

    String text = "I AM A BEAUTIFUL TEXT";
    String prefix = "YOU ARE";
    boolean textStartWithPrefix = stringUtils.startsWithIgnoreCase(text, prefix);

    Assertions.assertFalse(textStartWithPrefix);
  }

  @Test
  public void When_TheTextStartsWithPrefix_Expect_ReturnsTrue() {

    String text = "I AM A BEAUTIFUL TEXT";
    String prefix = "I AM";
    boolean textStartWithPrefix = stringUtils.startsWithIgnoreCase(text, prefix);

    Assertions.assertTrue(textStartWithPrefix);
  }

  @Test
  public void When_ThePrefixIsEmpty_Expect_ReturnsTrue() {

    String text = "I AM A BEAUTIFUL TEXT";
    String prefix = "";

    boolean textStartWithPrefix = stringUtils.startsWithIgnoreCase(text, prefix);

    Assertions.assertTrue(textStartWithPrefix);
  }


  @Test
  public void When_TheTextIsEmptyAndThePrefixIsNot_Expect_ReturnFalse() {

    String text = "";
    String prefix = "I AM";

    boolean textStartWithPrefix = stringUtils.startsWithIgnoreCase(text, prefix);

    Assertions.assertFalse(textStartWithPrefix);
  }

  @Test
  public void When_TheTextIsEmptyAndThePrefixToo_Expect_ReturnTrue() {

    String text = "";
    String prefix = "";

    boolean textStartWithPrefix = stringUtils.startsWithIgnoreCase(text, prefix);

    Assertions.assertTrue(textStartWithPrefix);
  }

  @Test
  public void When_TheTextIsNullAndThePrefixIsNot_Expect_ThrowException() {

    String text = null;
    String prefix = "";

    assertThrows(NullPointerException.class, () ->
      stringUtils.startsWithIgnoreCase(text, prefix));

  }

  @Test
  public void When_TheTextIsNotNullAndThePrefixIs_Expect_ThrowException() {

    String text = "";
    String prefix = null;

    assertThrows(NullPointerException.class, () ->
      stringUtils.startsWithIgnoreCase(text, prefix));

  }
}
