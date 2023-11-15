package com.epam.engx.task2;

import com.epam.engx.task2.thirdpartyjar.Flower;
import com.epam.engx.task2.thirdpartyjar.FlowerRepository;

import java.util.List;
import java.util.Set;

public class FakeFlowerRepository implements FlowerRepository {
    @Override
    public List<Flower> findAllFlowers() {
        return List.of(
                new Flower(1, "Rose", Set.of("Blue", "White")),
                new Flower(2, "Lily", Set.of("Yellow")),
                new Flower(3, "Orchid", Set.of("Red", "Purple")),
                new Flower(4, "Tulip", Set.of("Grey", "Blue")),
                new Flower(5, "Freesia", Set.of("Yellow", "White"))
        );
    }
}
