package com.example.mutlipleviewtypes.models;

public class Trip {
    private int image;
    private String textTrip,textTripTitle;

    public Trip(int image, String textTrip, String textTripTitle) {
        this.image = image;
        this.textTrip = textTrip;
        this.textTripTitle = textTripTitle;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTextTrip() {
        return textTrip;
    }

    public void setTextTrip(String textTrip) {
        this.textTrip = textTrip;
    }

    public String getTextTripTitle() {
        return textTripTitle;
    }

    public void setTextTripTitle(String textTripTitle) {
        this.textTripTitle = textTripTitle;
    }
}
