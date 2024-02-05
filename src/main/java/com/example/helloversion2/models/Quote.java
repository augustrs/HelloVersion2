package com.example.helloversion2.models;

public class Quote {
    private String quoteText;
    private String quoteAuthor;
    private String quoteGenre;

    public Quote(String quoteText,String quoteAuthor, String quoteGenre) {
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
        this.quoteGenre = quoteGenre;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public String getQuoteGenre() {
        return quoteGenre;
    }
}
