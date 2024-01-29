package com.epam.engx.task3;

import com.epam.engx.task3.thirdpartyjar.Gift;
import com.epam.engx.task3.thirdpartyjar.GiftRepository;
import com.epam.engx.task3.thirdpartyjar.Person;
import com.epam.engx.task3.thirdpartyjar.Type;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class BirthdayGiftSelectorTest {

    //Stub
    private GiftRepository stubGiftRepository = new StubGiftRepository();

    @Test
    void selectGift_givenChildAge_returnsChildGift() {
        Person fakeChild = getChild();
        BirthdayGiftSelector birthdayGiftSelector = new BirthdayGiftSelector(stubGiftRepository);

        Optional<Gift> gift = birthdayGiftSelector.selectGift(fakeChild);
        assertFalse(gift.isEmpty());
        assertTrue(gift.get().type() == Type.FOR_CHILD);

    }

    @Test
    void selectGift_givenTeenagerAge_returnsTeenagerGift() {
        Person fakeTeenager = getFakeTeenager();
        BirthdayGiftSelector birthdayGiftSelector = new BirthdayGiftSelector(stubGiftRepository);

        Optional<Gift> gift = birthdayGiftSelector.selectGift(fakeTeenager);
        assertFalse(gift.isEmpty());
        assertTrue(gift.get().type() == Type.FOR_TEENAGER);
    }

    @Test
    void selectGift_givenAdultAge_returnsAdultGift() {
        Person fakeTeenager = getFakeAdult();

        //Spy
        GiftRepository spyGiftRepository = spy(GiftRepository.class);
        when(spyGiftRepository.findGiftsByType(any(Type.class))).thenReturn(new ArrayList<>());

        BirthdayGiftSelector birthdayGiftSelector = new BirthdayGiftSelector(spyGiftRepository);

        Optional<Gift> gift = birthdayGiftSelector.selectGift(fakeTeenager);
        assertTrue(gift.isEmpty());
    }

    private Person getChild() {
        // Fake
        return new Person(1, "Nilson", 10);
    }

    private Person getFakeTeenager() {
        // Fake
        return new Person(2, "Lili", 15);
    }

    private Person getFakeAdult() {
        // Fake
        return new Person(3, "Martha", 35);
    }

}