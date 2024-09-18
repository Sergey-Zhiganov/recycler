package com.example.recycleview;

public class Place {
    private String title;
    private String description;
    private String location;
    private float rating;
    private int imageResource;

    public Place(String title, String description, String location, float rating, int imageResource) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.rating = rating;
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public float getRating() {
        return rating;
    }

    public int getImageResource() {
        return imageResource;
    }
}
