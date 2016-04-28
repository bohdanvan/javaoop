package com.bvan.javaoop.blinov.ch4.a.text;

/**
 * @author bvanchuhov
 */
public class TextRunner {

    public static void main(String[] args) {
        Sentence header = new Sentence()
                .append(new Word("Info"))
                .append(new Word("about"))
                .append(new Word("Java"));

        Text text = new Text(header);
        text.append(new Sentence()
                .append(new Word("Java"))
                .append(new Word("is"))
                .append(new Word("OOP"))
                .append(new Word("programming"))
                .append(new Word("language"))
        );
        text.append(new Sentence()
                .append(new Word("Java"))
                .append(new Word("is"))
                .append(new Word("used"))
                .append(new Word("in"))
                .append(new Word("huge"))
                .append(new Word("projects"))
        );

        System.out.println(text);
    }
}
