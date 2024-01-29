package com.epam.engx.task5;


import com.epam.engx.task5.thirdpartyjar.Book;
import com.epam.engx.task5.thirdpartyjar.BookService;
import com.epam.engx.task5.thirdpartyjar.Person;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class LibraryTest {

    private static final Book book = new Book(2, "Book 2");
    private static final Person person = new Person(1,"Nilson");

    @Test
    void rentBook_givenBookAndPerson_shouldRentBookAndAddPerson() {

        //Mock type
        BookService mockBookService = mock(BookService.class);
        when(mockBookService.reachedLimitOfBooks(person)).thenReturn(false);
        Library  myLocalLibrary = new Library(mockBookService);

        myLocalLibrary.rentBook(book,person);


        verify(mockBookService).reachedLimitOfBooks(person);
        verify(mockBookService).getAllPersons();
        verify(mockBookService).rent(book,person);
    }

    @Test
    void rentBook_givenPersonHasReachedLimitOfBooks_shouldNotRentTheBook() {

        //Mock type
        BookService mockBookService = mock(BookService.class);
        when(mockBookService.reachedLimitOfBooks(person)).thenReturn(true);
        Library  myLocalLibrary = new Library(mockBookService);

        myLocalLibrary.rentBook(book,person);


        verify(mockBookService).reachedLimitOfBooks(person);
        verify(mockBookService,never()).getAllPersons();
        verify(mockBookService,never()).rent(book,person);
    }
    @Test
    void when_TheBookServiceIsNull_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, ()->new Library(null));
    }

}