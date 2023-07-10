package com.examples.equalsHashcode;

public class ReportCard {
    private double ratingScore;

    public ReportCard(){
        this.ratingScore= Math.random()+1;

    }

    public double getRatingScore() {
        return ratingScore;
    }

    public void setRatingScore(double ratingScore) {
        this.ratingScore = ratingScore;
    }
}
