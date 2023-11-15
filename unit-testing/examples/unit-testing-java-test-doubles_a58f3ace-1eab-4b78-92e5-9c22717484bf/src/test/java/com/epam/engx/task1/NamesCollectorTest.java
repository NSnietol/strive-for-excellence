package com.epam.engx.task1;

import com.epam.engx.task1.thirdpartyjar.Logger;
import com.epam.engx.task1.thirdpartyjar.Person;
import com.epam.engx.task4.thirdpartyjar.CarService;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class NamesCollectorTest {

    private NamesCollector namesCollector;
    // Dummy
    private Logger logger  = mock(Logger.class);

    @Test
    void collectNames_givenSetOfPersons_returnsListOfNames() {
        List<String> expectNames = List.of("Nilson", "Senen", "Ana");
        //Fake
        Set<Person> setOfPersons = getFakeListOfPersons();
        namesCollector = new NamesCollector(logger);

        List<String> names = namesCollector.collectNames(setOfPersons);

        assertTrue(names.containsAll(expectNames));
        assertTrue(names.size() == 3);
        verify(logger).log(names);
    }

    @Test
    void collectNames_givenEmptySetOfPersons_returnsListOfNamesEmpty() {

        //Fake
        Set<Person> setOfPersons = getEmptySetOfPersons();
        namesCollector = new NamesCollector(logger);

        List<String> names = namesCollector.collectNames(setOfPersons);

        assertTrue(names.isEmpty());
        verify(logger).log(names);
    }

    private Set<Person> getEmptySetOfPersons() {
        return Set.of();
    }

    @Test
    void collectNames_givenNullSetOfPersons_throwNullPointerException() {
        //Fake
        Set<Person> setOfPersons = getNullSetOfPersons();
        namesCollector = new NamesCollector(logger);

        assertThrows(NullPointerException.class, () -> namesCollector.collectNames(setOfPersons));

    }

    private Set<Person> getNullSetOfPersons() {
        return null;
    }

    private Set<Person> getFakeListOfPersons() {
        return Set.of(
                new Person(1, "Nilson"),
                new Person(2, "Senen"),
                new Person(3, "Ana")
        );

    }

}