package com.halty.poemanalysis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Util {
    public static List<String> getTextArray(String text) {
        String textMod = text.replaceAll("[^А-Яа-я]", " ").trim();
        return Arrays.asList(textMod.split("\\s+"));
    }
    public static String findLongestWord(List<String> text) {
        return text.stream().max(Comparator.comparingInt(String::length)).get();
    }

    public static String findShortestWord(List<String> text) {
        return text.stream().min(Comparator.comparingInt(String::length)).get();
    }

    public static String sortText(List<String> text) {
        text.sort(Comparator.comparingInt(String::length));
        String listString = String.join(", ", text);
        return listString;
    }

    public static int findLetterAmount(List<String> text) {
        int letters = 0;
        for (String word : text) {
            letters += word.length();
        }
        return letters;
    }
}
