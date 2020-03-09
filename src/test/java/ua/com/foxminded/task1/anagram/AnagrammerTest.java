package ua.com.foxminded.task1.anagram;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AnagrammerTest {

    Anagrammer anagrammer;

    @BeforeEach
    void init() {
        anagrammer = new Anagrammer();
    }

    @Test
    void makeAnagramShouldThrowExceptionWhenInputIsNull() {
        assertThrows(NullPointerException.class, () -> anagrammer.makeAnagram(null));
    }

    @Test
    void makeAnagramShouldReturnEmptyStringWhenInputIsEmptyString() {
        String expected = "";
        String actual = anagrammer.makeAnagram("");
        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldNotReverseAnySymbolWhenInputContainsOnlyNonLetters() {
        String expected = "1&04@$_0-*12512";
        String actual = anagrammer.makeAnagram("1&04@$_0-*12512");
        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldNotReverseAnySymbolWhenInputContainsOnlyNonLettersAndSpaces() {
        String expected = "1&04@$_0-*12512";
        String actual = anagrammer.makeAnagram("1&04@$_0-*12512");
        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldReturnTheSameLetterWhenInputOneLetter() {
        String expected = "a";
        String actual = anagrammer.makeAnagram("a");
        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldReturnTheSameLettersWhenInputTheSameLetters() {
        String expected = "aaaaaaaa";
        String actual = anagrammer.makeAnagram("aaaaaaaa");
        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldReturnReversedWordWhenInputOneWord() {
        String expected = "gnitanicsaf";
        String actual = anagrammer.makeAnagram("fascinating");
        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldReturnReversedLettersWhenInputLettersInDifferentCases() {
        String expected = "AaaaAaAAAaaaaaAAaaAaaAa";
        String actual = anagrammer.makeAnagram("aAaaAaaAAaaaaaAAAaAaaaA");
        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldReturnReversedWordsWhenInputSeveralWords() {
        String expected = "abcd efgh";
        String actual = anagrammer.makeAnagram("dcba hgfe");
        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramShouldReturnReversedWordsAndNotMoveSymbolsWhenInputSeveralWordsAndSymbols() {
        String expected = "a1bcd efg!h";
        String actual = anagrammer.makeAnagram("d1cba hgf!e");
        assertEquals(expected, actual);
    }
}
