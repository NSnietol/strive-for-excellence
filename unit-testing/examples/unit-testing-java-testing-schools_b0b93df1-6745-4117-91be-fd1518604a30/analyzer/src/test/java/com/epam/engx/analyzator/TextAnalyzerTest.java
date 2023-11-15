package com.epam.engx.analyzator;


import com.epam.engx.analyzator.sentence.SentenceAnalyzer;
import com.epam.engx.analyzator.sentence.SentenceAnalyzerResults;
import com.epam.engx.analyzator.word.WordAnalyzer;
import com.epam.engx.analyzator.word.WordAnalyzerResults;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class TextAnalyzerTest {

    @Test
    public void when_TextAnalyzerIsNull_ThrowsNullPointerException() {
        WordAnalyzer wordAnalyzer = new WordAnalyzer();

        assertThrows(NullPointerException.class, () ->
                new TextAnalyzer(wordAnalyzer, null).analyze(""));
    }

    @Test
    public void when_WordAnalyzerIsNull_ThrowsNullPointerException() {

        SentenceAnalyzer sentenceAnalyzer = new SentenceAnalyzer();

        assertThrows(NullPointerException.class, () ->
                new TextAnalyzer(null, sentenceAnalyzer).analyze(""));
    }

    @Test
    public void when_AnalyzingText_ReturnExpectedValues() {
        var textToAnalyze = "Hello world";

        var expectedWordResults = new WordAnalyzerResults(2, 5);
        var expectedSentenceResults = new SentenceAnalyzerResults(1, 11, 0);

        var expectedResult = new TextAnalyzerResults(expectedWordResults, expectedSentenceResults);

        WordAnalyzer wordAnalyzer = new WordAnalyzer();
        SentenceAnalyzer sentenceAnalyzer = new SentenceAnalyzer();



        TextAnalyzer textAnalyzer = new TextAnalyzer(wordAnalyzer, sentenceAnalyzer);

        TextAnalyzerResults currentResult = textAnalyzer.analyze(textToAnalyze);
        assertEquals(expectedResult, currentResult);
    }
}