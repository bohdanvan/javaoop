package com.bvan.javaoop.blinov.ch4.a.text;

import com.bvan.common.Args;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class Sentence {

    private final List<Word> words = new ArrayList<>();

    public Sentence() {
    }

    public Sentence append(Word word) {
        Args.notNull(word, "word");

        words.add(word);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sentence)) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(words, sentence.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(" ");
        for (Word word : words) {
            joiner.add(word.toString());
        }
        return joiner.toString() + ".";
    }
}
