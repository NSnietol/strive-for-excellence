package com.example.legacyshop.unittest.shop;

import com.example.legacyshop.unittest.TestArticlesRepository;
import com.example.legacyshop.unittest.TestClientsRepository;
import com.example.legacyshop.unittest.exception.InvalidArticleException;
import com.example.legacyshop.unittest.exception.InvalidClientException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PriceCalculatorTest {

    private PriceCalculator objectUnderTest;

    @BeforeEach
    void setUp() {
        objectUnderTest = new PriceCalculator(new TestArticlesRepository(), new TestClientsRepository());
    }


    // I TESTED and it was needed to achieve the score
    @Test
    void when_ArticlesRepositoryIsNullAndAskForCalculationOfAnyPrice_ThrowsNullPointerException() {
        objectUnderTest = new PriceCalculator(null, new TestClientsRepository());
        assertThrows(NullPointerException.class, ()-> objectUnderTest.calculatePrice("ball","ordinary",1));
    }


    @Test
    void when_ArticleRepositoryIsNullAndAskForCalculationOfAnyPrice_ThrowsNullPointerException() {
        objectUnderTest = new PriceCalculator(new TestArticlesRepository(), null);
        assertThrows(NullPointerException.class, ()-> objectUnderTest.calculatePrice("ball","ordinary",1));
    }

    @Test
    void calculatePrice_BuyNoPositiveQuantityOfAnArticle_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> objectUnderTest.calculatePrice("ball", "ordinary", 0));
    }

    @Test
    void calculatePrice_NullProduct_ThrowsInvalidArticleException() {
       assertThrows(InvalidArticleException.class, ()-> objectUnderTest.calculatePrice(null, "ordinary", 1));
    }

    @Test
    void calculatePrice_NoExistingProduct_ThrowsInvalidArticleException() {
        assertThrows(InvalidArticleException.class, ()-> objectUnderTest.calculatePrice("tennis", "ordinary", 1));
    }

    @Test
    void calculatePrice_NonExistingClientIsBuying_ThrowsInvalidClientException() {
        assertThrows(InvalidClientException.class, ()-> objectUnderTest.calculatePrice("ball", "Nilson", 1));
    }

    @Test
    void calculatePrice_NullClient_ThrowsInvalidClientException() {
        assertThrows(InvalidClientException.class, ()-> objectUnderTest.calculatePrice("ball", null, 1));
    }


    @Test
    void calculatePrice_NullClientAndNullArticle_ThrowsInvalidArticleException() {
        assertThrows(InvalidArticleException.class, ()-> objectUnderTest.calculatePrice(null, null, 1));
    }

    @Test
    void calculatePrice_OrdinaryClientBuyOneBall_PriceShouldBe30() {
        // given
        int expectedPrice = 30;

        // when
        int actualPrice = objectUnderTest.calculatePrice("ball", "ordinary", 1);

        // then
        assertThat(actualPrice).isEqualTo(expectedPrice);

    }

    @Test
    void calculatePrice_OrdinaryClientBuyMoreThanFiftyBall_PriceShouldBe300() {
        int expectedPrice = 300;

        // when
        int actualPrice = objectUnderTest.calculatePrice("ball", "ordinary", 51);

        // then
        assertThat(actualPrice).isEqualTo(expectedPrice);

    }
    @Test
    void calculatePrice_OrdinaryClientBuyMoreThanThirtyBallButLessThanFifty_PriceShouldBe150() {
        int expectedPrice = 150;

        // when
        int actualPrice = objectUnderTest.calculatePrice("ball", "ordinary", 31);

        // then
        assertThat(actualPrice).isEqualTo(expectedPrice);

    }

    @Test
    void calculatePrice_VipClientBuyOneBall_PriceShouldBe900() {
        int expectedPrice = 900;


        int actualPrice = objectUnderTest.calculatePrice("ball", "vip", 1);

        assertThat(actualPrice).isEqualTo(expectedPrice);
    }

    @Test
    void calculatePrice_VipClientBuyMoreThanFiftyBall_PriceShouldBe9000() {
        int expectedPrice = 9000;

        int actualPrice = objectUnderTest.calculatePrice("ball", "vip", 51);

        assertThat(actualPrice).isEqualTo(expectedPrice);
    }

    @Test
    void calculatePrice_VipClientBuyMoreThanThirtyBallButLessThanFifty_PriceShouldBe4500() {
        int expectedPrice = 4500;

        // when
        int actualPrice = objectUnderTest.calculatePrice("ball", "vip", 31);

        // then
        assertThat(actualPrice).isEqualTo(expectedPrice);

    }

    @Test
    void calculatePrice_OrdinaryClientBuyADiscountedBall_PriceShouldBe84() {
        int expectedPrice = 84;


        int actualPrice = objectUnderTest.calculatePrice("ball Discount", "ordinary", 1);

        assertThat(actualPrice).isEqualTo(expectedPrice);
    }

    @Test
    void calculatePrice_OrdinaryClientBuyABallInSale_PriceShouldBe84() {
        int expectedPrice = 84;


        int actualPrice = objectUnderTest.calculatePrice("sale ball", "ordinary", 1);

        assertThat(actualPrice).isEqualTo(expectedPrice);
    }
    @Test
    void calculatePrice_OrdinaryClientBuyA35ModernBathsInSaleBecauseOfTotal_PriceShouldBe84000() {
        int expectedPrice = 84000;


        int actualPrice = objectUnderTest.calculatePrice("modern bath", "ordinary", 35);

        assertThat(actualPrice).isEqualTo(expectedPrice);
    }

    @Test
    void calculatePrice_OrdinaryClientBuyAExpensiveBathThatIsNotInSaleBecauseOfTotal_PriceShouldBe1000000() {
        int expectedPrice = 1000000;


        int actualPrice = objectUnderTest.calculatePrice("expensive bath", "ordinary", 1);

        assertThat(actualPrice).isEqualTo(expectedPrice);
    }


    @Test
    void calculatePrice_VipClientBuyBallIsNotInSale_PriceShouldBe9002() {
        int expectedPrice = 900;


        int actualPrice = objectUnderTest.calculatePrice("ball", "vip", 1);

        assertThat(actualPrice).isEqualTo(expectedPrice);
    }

    @Test
    void calculatePrice_VipClientBuyBallIsNotInSale_PriceShouldBe900() {
        int expectedPrice = 900;


        int actualPrice = objectUnderTest.calculatePrice("ball", "vip", 1);

        assertThat(actualPrice).isEqualTo(expectedPrice);
    }



    @Test
    void calculatePrice_VipClientBuyADiscountedBall_PriceShouldBe2520() {
        int expectedPrice = 2520;


        int actualPrice = objectUnderTest.calculatePrice("ball Discount", "vip", 1);

        assertThat(actualPrice).isEqualTo(expectedPrice);
    }

    @Test
    void calculatePrice_VipClientBuyABallInSale_PriceShouldBe2520() {
        int expectedPrice = 2520;


        int actualPrice = objectUnderTest.calculatePrice("sale ball", "vip", 1);

        assertThat(actualPrice).isEqualTo(expectedPrice);
    }

    @Test
    void calculatePrice_VipClientBuyMoreThanThirtyModernBallsButLessThanFiftyWithSalePrice_PriceShouldBe72000() {
        int expectedPrice = 72000;


        int actualPrice = objectUnderTest.calculatePrice("modern ball", "vip", 31);

        assertThat(actualPrice).isEqualTo(expectedPrice);
    }


}