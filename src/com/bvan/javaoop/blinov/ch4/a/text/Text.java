package com.bvan.javaoop.blinov.ch4.a.text;

import com.bvan.common.Args;
import com.bvan.common.Joiner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class Text {

    private final Sentence header;
    private List<Sentence> sentences = new ArrayList<>();

    public Text(Sentence header) {
        this.header = Args.notNull(header, "header");
    }

    public Sentence getHeader() {
        return header;
    }

    public Text append(Sentence sentence) {
        Args.notNull(sentence, "sentence");

        sentences.add(sentence);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;
        Text text = (Text) o;
        return Objects.equals(header, text.header) &&
                Objects.equals(sentences, text.sentences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, sentences);
    }

    @Override
    public String toString() {
        return header.toString() + '\n' +
                Joiner.join(" ", sentences);
    }
}
