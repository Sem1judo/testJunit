package ua.com.foxminded.task1;

import ua.com.foxminded.task1.anagram.Anagrammer;

public class AnagramApp {
    public static void main(String[] args) {
        String example1 = "abcd efgh";
        String example2 = "a1bcd efg!h";
        String example3 = "I love java programming";

        Anagrammer anagrammer = new Anagrammer();

        System.out.println(anagrammer.makeAnagram(example1));
        System.out.println(anagrammer.makeAnagram(example2));
        System.out.println(anagrammer.makeAnagram(example3));
        System.out.println(anagrammer.makeAnagram("   "));



    }
}
