package com.bvan.javaoop.blinov.ch4.a.text;

import com.bvan.common.Args;
import com.bvan.common.Joiner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class Sentence {

    private List<Word> words = new ArrayList<>();

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
        return Joiner.join(" ", words) + ".";
    }
}
