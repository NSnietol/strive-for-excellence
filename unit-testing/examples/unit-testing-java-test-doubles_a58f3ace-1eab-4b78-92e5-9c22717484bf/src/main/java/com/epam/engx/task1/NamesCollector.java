package com.epam.engx.task1;

import com.epam.engx.task1.thirdpartyjar.Logger;
import com.epam.engx.task1.thirdpartyjar.Person;

import java.util.List;
import java.util.Set;

import static java.util.Objects.requireNonNull;

public class NamesCollector {

    private final Logger logger;

    public NamesCollector(Logger logger) {
        this.logger = requireNonNull(logger);
    }

    public List<String> collectNames(Set<Person> persons) {
        var names = persons.stream()
                .map(Person::name)
                .toList();

        logger.log(names);

        return names;
    }

}
