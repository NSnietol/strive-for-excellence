package com.epam.engx.task2;

import com.epam.engx.task2.thirdpartyjar.Flower;
import com.epam.engx.task5.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FlowerFinderTest {

    private FlowerFinder flowerFinder;


    @Test
    void findByColor_givenColor_returnsListOfFlowers() {
        flowerFinder = new FlowerFinder(new FakeFlowerRepository());
        List<Flower> whiteFlowers = flowerFinder.findByColor("White");


        List<String> expectedFlowerNames = List.of("Rose", "Freesia");

        assertTrue(whiteFlowers
                .stream()
                .map(Flower::name)
                .allMatch(flower -> expectedFlowerNames.contains(flower)));

    }

    @Test
    void findByColor_givenNoExistingColor_returnsEmptyListOfFlowers() {
        flowerFinder = new FlowerFinder(new FakeFlowerRepository());
        List<Flower> flowers = flowerFinder.findByColor("Brown");
        assertTrue(flowers.isEmpty());
    }

    @Test
    void when_TheFlowerRepositoryIsNull_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, ()->new FlowerFinder(null));
    }
}