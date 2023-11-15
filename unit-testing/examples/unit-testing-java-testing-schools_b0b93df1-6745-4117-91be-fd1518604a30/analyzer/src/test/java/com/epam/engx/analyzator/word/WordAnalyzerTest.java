package com.epam.engx.analyzator.word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WordAnalyzerTest {
    private final WordAnalyzer objectUnderTest = new WordAnalyzer();

    @Test
    public void when_theTextIsNull_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> objectUnderTest.analyze(null));
    }
    @Test
    public void when_theTextIsEmpty_ReturnZeroInAllResults() {
        var expectedResult = new WordAnalyzerResults(0, 0);

        WordAnalyzerResults currentResult = objectUnderTest.analyze("");
        
        assertEquals(expectedResult, currentResult);
    }

    @Test
    public void when_theTextHasNoWords_ReturnZeroInAllResults() {
        var expectedResult = new WordAnalyzerResults(0, 0);

        WordAnalyzerResults currentResult = objectUnderTest.analyze("    ");
        assertEquals(expectedResult, currentResult);
    }

    @Test
    public void when_theTextHasOneWord_ReturnOneInWordCountAndWordLength() {
        var expectedResult = new WordAnalyzerResults(1, 5);

        WordAnalyzerResults currentResult= objectUnderTest.analyze("Hello   ");
        assertEquals(expectedResult, currentResult);
    }
    @Test
    public void when_theTextHasMoreThanOneWord_ReturnWordCountAndWordLength() {
        var expectedResult = new WordAnalyzerResults(5, 4.6);

        WordAnalyzerResults currentResult= objectUnderTest.analyze("Hello world from Unit Tests");
        assertEquals(expectedResult, currentResult);
    }

}