package ua.com.foxminded.task1.anagram;

import java.util.ArrayDeque;
import java.util.Deque;

public class Anagrammer {

    private final static String DELIMITER = " ";
    private final static String NOT_SPACE_CHAR_REGEX = ".*\\w.*";

    public String makeAnagram(String sentence) {
        StringBuilder anagramBuilder = new StringBuilder();
        String anagram;

        if (sentence.matches( NOT_SPACE_CHAR_REGEX)) {
            String[] words = sentence.split(DELIMITER);

            for (String word : words) {
                anagramBuilder.append(reverseWords(word)).append(DELIMITER);
            }
            anagram = anagramBuilder.toString().trim();
        } else {
            anagram = anagramBuilder.append(sentence).toString();
        }
        return anagram;
    }

    private String reverseWords(String word) {
        Deque<Character> letters = new ArrayDeque<>();

        for (char letter : word.toCharArray())
            if (Character.isLetter(letter)) {
                letters.push(letter);
            }

        StringBuilder reversedWord = new StringBuilder();
        for (char letter : word.toCharArray()) {
            if (Character.isLetter(letter))
                reversedWord.append(letters.pop());
            else {
                reversedWord.append(letter);
            }
        }
        return reversedWord.toString();
    }

}
