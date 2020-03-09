package ua.com.foxminded.task1.anagram;

import java.util.ArrayDeque;
import java.util.Deque;

public class Anagrammer {

    private final static String DELIMITER = " ";

    public String makeAnagram(String sentence) {
        String[] words = sentence.split(DELIMITER);
        StringBuilder anagramBuilder = new StringBuilder();

        for (String word : words) {
            anagramBuilder.append(reverseWords(word)).append(DELIMITER);
        }

        return anagramBuilder.toString().trim();
    }

    private String reverseWords(String word) {
        Deque<Character> letters = new ArrayDeque<>();

        for (char c : word.toCharArray())
            if (Character.isLetter(c))
                letters.push(c);

        StringBuilder reversedWord = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c))
                reversedWord.append(letters.pop());
            else
                reversedWord.append(c);
        }
        return reversedWord.toString();
    }

}
