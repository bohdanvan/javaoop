package com.bvan.javaoop.blinov.ch4.a.text;

import com.bvan.common.Args;

import java.util.Objects;

/**
 * @author bvanchuhov
 */
public final class Word {

    private final String content;

    public Word(String content) {
        this.content = Args.notNull(content, "content");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;
        Word word = (Word) o;
        return Objects.equals(content, word.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }

    @Override
    public String toString() {
        return content;
    }
}
