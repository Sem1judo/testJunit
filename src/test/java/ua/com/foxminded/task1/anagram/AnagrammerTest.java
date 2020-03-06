package ua.com.foxminded.task1.anagram;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AnagrammerTest {

    Anagrammer anagrammer;

    private static final String EXAMPLE1 = "abcd efgh";
    private static final String EXAMPLE2 = "a1bcd efg!h";
    private static final String EXAMPLE3 = "I love java programming";

    private static final String CLUE = "should return anagrams";

    private static final String EXPECTED1 = "dcba hgfe";
    private static final String EXPECTED2 = "d1cba hgf!e";
    private static final String EXPECTED3 = "I evol avaj gnimmargorp";

    @BeforeEach
    void init() {
        anagrammer = new Anagrammer();
    }

    // Test have to reverse letters in sentence all specific symbol ought to stay in the same place
    @Test
    @DisplayName("Testing words reversing")
    void makeAnagram() {

        String actual1 = anagrammer.makeAnagram(EXAMPLE1);
        String actual2 = anagrammer.makeAnagram(EXAMPLE2);
        String actual3 = anagrammer.makeAnagram(EXAMPLE3);

        assertAll(
                () -> assertEquals(EXPECTED1, actual1, CLUE),
                () -> assertEquals(EXPECTED2, actual2, CLUE),
                () -> assertEquals(EXPECTED3, actual3, CLUE)
        );
    }
}
