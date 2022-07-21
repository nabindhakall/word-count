package com.tlglearning.wordcount;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class WordCounter {

  private final Map<String, Integer> counts;

  public WordCounter(String text) {
    String[] words = splitWords(text);
    counts = Collections.unmodifiableMap(countWords(words));

  }

  Map<String, Integer> countWords(String[] words) {
    Map<String, Integer> counts = new HashMap<>();
    for (String word : words) {

      if (!counts.containsKey(word)) {
        counts.put(word, 1);

      } else {
        int previousCount = counts.get(word);
        counts.put(word, previousCount + 1);
      }
    }

    String[] splitWords; (String text)
    return text
        .toLowerCase()
        .split("[\\W_]+");


  }
}