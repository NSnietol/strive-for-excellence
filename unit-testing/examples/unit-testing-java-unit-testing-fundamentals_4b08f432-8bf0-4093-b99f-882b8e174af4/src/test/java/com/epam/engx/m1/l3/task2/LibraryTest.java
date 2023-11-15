package com.epam.engx.m1.l3.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

  @Test
  void When_ValidBookNameIsAdded_Expect_SaveIt() {
    Library library = new Library();
    String bookName = "BookName";

    library.addBook(bookName);

    assertTrue(library.hasBook(bookName));
  }

  @Test
  void When_BookNameIsNullWhileAdding_Expect_SaveIt() {
    Library library = new Library();
    String bookName = null;

    library.addBook(bookName);

    assertTrue(library.hasBook(bookName));
  }

  @Test
  void When_BookNameIsEmptyWhileAdding_Expect_SaveIt() {
    Library library = new Library();
    String bookName = "";

    library.addBook(bookName);

    assertTrue(library.hasBook(bookName));
  }


  @Test
  void When_RemoveExistingBook_Expect_NoSeeItAgain() {
    Library library = new Library();
    String bookName = "NAME";
    library.addBook(bookName);
    library.removeBook(bookName);
    assertFalse(library.hasBook(bookName));

  }

  @Test
  void When_RemoveUnExistingBook_Expect_NotToThrowException() {
    Library library = new Library();
    String bookName = "";
    assertDoesNotThrow(() -> library.removeBook(bookName));
  }


  @Test
  void When_RetrieveUnExistingBook_Expect_NotToFindIt() {
    Library library = new Library();
    String bookName = "";
    assertFalse(library.hasBook(bookName));
  }
}
