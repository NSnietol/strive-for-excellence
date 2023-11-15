package com.epam.engx.task3;

import com.epam.engx.task3.thirdpartyjar.Gift;
import com.epam.engx.task3.thirdpartyjar.GiftRepository;
import com.epam.engx.task3.thirdpartyjar.Type;

import java.util.List;

public class StubGiftRepository implements GiftRepository {
    @Override
    public List<Gift> findGiftsByType(Type type) {
        return switch (type) {
            case FOR_CHILD -> List.of(new Gift(1, "Toy", Type.FOR_CHILD));
            case FOR_TEENAGER -> List.of(new Gift(2, "Toy", Type.FOR_TEENAGER));
            case FOR_ADULT -> List.of(new Gift(3, "Toy", Type.FOR_ADULT));
            default -> List.of();
        };
    }
}
