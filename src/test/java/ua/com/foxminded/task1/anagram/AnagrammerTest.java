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
    void makeAnagramShouldReturnEmptyStringWhenInputIsEmptyString(){
        assertEquals("",anagrammer.makeAnagram(""));
    }
    @Test
    void makeAnagramShouldReturnEmptyStringWhenInputFewSpaces(){
        assertEquals("",anagrammer.makeAnagram("   "));
    }
    @Test
    void makeAnagramShouldNotReverseAnySymbolWhenInputContainsOnlyNonLetters(){
        assertEquals("1&04@$_0-*12512",anagrammer.makeAnagram("1&04@$_0-*12512"));
    }
    @Test
    void makeAnagramShouldNotReverseAnySymbolWhenInputContainsOnlyNonLettersAndSpaces(){
        assertEquals("1&04 @$_0 -*12 51 2",anagrammer.makeAnagram("1&04 @$_0 -*12 51 2"));
    }
    @Test
    void makeAnagramShouldReturnTheSameLetterWhenInputOneLetter(){
        assertEquals("a",anagrammer.makeAnagram("a"));
    }
    @Test
    void makeAnagramShouldReturnTheSameLettersWhenInputTheSameLetters(){
        assertEquals("aaaaaaaa",anagrammer.makeAnagram("aaaaaaaa"));
    }
    @Test
    void makeAnagramShouldReturnReversedWordWhenInputOneWord(){
        assertEquals("fascinating",anagrammer.makeAnagram("gnitanicsaf"));
    }
    @Test
    void makeAnagramShouldReturnReversedLettersWhenInputLettersInDifferentCases(){
        assertEquals("AaaaAaAAAaaaaaAAaaAaaAa",anagrammer.makeAnagram("aAaaAaaAAaaaaaAAAaAaaaA"));
    }
    @Test
    void makeAnagramShouldReturnReversedWordsWhenInputSeveralWords(){
        assertEquals("This is my test",anagrammer.makeAnagram("sihT si ym tset"));
        assertEquals("abcd efgh",anagrammer.makeAnagram("dcba hgfe"));
    }
    @Test
    void makeAnagramShouldReturnReversedWordsAndNotMoveSymbolsWhenInputSeveralWordsAndSymbols(){
        assertEquals("a1bcd efg!h",anagrammer.makeAnagram("d1cba hgf!e"));
    }



}
