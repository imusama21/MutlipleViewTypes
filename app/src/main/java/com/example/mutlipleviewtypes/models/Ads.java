package com.example.mutlipleviewtypes.models;

public class Ads {

    private String textAds,textAdsTitle;

    public Ads(String textAds, String textAdsTitle) {
        this.textAds = textAds;
        this.textAdsTitle = textAdsTitle;
    }

    public String getTextAds() {
        return textAds;
    }

    public void setTextAds(String textAds) {
        this.textAds = textAds;
    }

    public String getTextAdsTitle() {
        return textAdsTitle;
    }

    public void setTextAdsTitle(String textAdsTitle) {
        this.textAdsTitle = textAdsTitle;
    }
}
