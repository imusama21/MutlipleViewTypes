package com.example.mutlipleviewtypes.models;

public class News {

    private String textNewsTitle,textNews;

    public News(String textNewsTitle, String textNews) {
        this.textNewsTitle = textNewsTitle;
        this.textNews = textNews;
    }

    public String getTextNewsTitle() {
        return textNewsTitle;
    }

    public void setTextNewsTitle(String textNewsTitle) {
        this.textNewsTitle = textNewsTitle;
    }

    public String getTextNews() {
        return textNews;
    }

    public void setTextNews(String textNews) {
        this.textNews = textNews;
    }
}
