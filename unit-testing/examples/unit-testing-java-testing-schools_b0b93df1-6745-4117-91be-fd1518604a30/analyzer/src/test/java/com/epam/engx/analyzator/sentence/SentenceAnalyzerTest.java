package com.epam.engx.analyzator.sentence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SentenceAnalyzerTest {

    private final SentenceAnalyzer objectUnderTest = new SentenceAnalyzer();

    @Test
    void when_ThereAreNoSentences_ReturnZeroInAllResults() {
        var expectedResult = new SentenceAnalyzerResults(0, 0, 0);

        SentenceAnalyzerResults currentResult = objectUnderTest.analyze("");

        assertEquals(expectedResult, currentResult);
    }

    @Test
    void when_ThereIsOneSentenceWithNoComplexity_ReturnOneInSentenceCount() {
        var expectedResult = new SentenceAnalyzerResults(1, 0, 11);

        SentenceAnalyzerResults currentResult = objectUnderTest.analyze("Hello world.");
        assertEquals(expectedResult, currentResult);

    }


    @Test
    void when_ThereIsOneSentenceWithOutPeriod_ReturnOneInSentenceCount() {
        var expectedResult = new SentenceAnalyzerResults(1, 0, 11);

        SentenceAnalyzerResults currentResult = objectUnderTest.analyze("Hello world");
        assertEquals(expectedResult, currentResult);
    }

    @Test
    void when_ThereIsOneComplexSentence_ReturnOneComplexInSentenceCountAndSentenceCountAsTwo() {
        var expectedResult = new SentenceAnalyzerResults(2, 1, 24);

        SentenceAnalyzerResults currentResult = objectUnderTest.analyze("Hello world. My role is TEA, but I can play others");
        assertEquals(expectedResult, currentResult);
    }

    @Test
    void when_ThereAreTwoComplexSentences_ReturnTwoInComplexSentenceCount() {
        var expectedResult = new SentenceAnalyzerResults(2, 2, 31);

        SentenceAnalyzerResults currentResult = objectUnderTest.analyze("Hello world, I'm learning. My role is TEA, but I can play others");

        assertEquals(expectedResult, currentResult);
    }

    @Test
    void when_ThereAreTwoSentencesOfLengthTen_ReturnTenInSentenceAvgLength() {
        var expectedResult = new SentenceAnalyzerResults(2, 0, 10);

        SentenceAnalyzerResults currentResult = objectUnderTest.analyze("Helloworld.Nilson Nie");
        assertEquals(expectedResult, currentResult);

    }

    @Test
    void when_TheSentenceIsNull_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> objectUnderTest.analyze(null));
    }
}