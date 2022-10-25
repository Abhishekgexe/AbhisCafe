package com.example.abhiscafe.models;

public class FeaturedVerModel {
    int image;
    String name;
    String desciption;
    String rating;
    String timing;

    public FeaturedVerModel(int image, String duble_cheese_pizza, String name, String description, String rating, String timing) {
        this.image = image;
        this.name = name;
        this.desciption = desciption;
        this.rating = rating;
        this.timing = timing;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }
}
