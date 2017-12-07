package com.example.josegeorges.trivelapp;

/**
 * Created by josegeorges on 2017-11-30.
 */


import java.util.ArrayList;

/**
 * This class will serve has a holder for the information of each package. making it easier to populate the recyclerView with each package.
 * the class will have private properties, they will be populated through the constructor and called through getters.
 */
public class TripPackage {

    //properties for the package
    private String title;
    private String description;
    private ArrayList<String[]> activities;
    private String duration;
    private String price;
    private String longitude;
    private String latitute;
    private ArrayList<int[]> imagesId;
    //constructor
    public TripPackage(String title, String description, ArrayList<String[]> activities, String duration, String price,
                       String longitude, String latitute, ArrayList<int[]> imagesId){
        this.title = title;
        this.description = description;
        this.activities = activities;
        this.duration = duration;
        this.price = price;
        this.longitude = longitude;
        this.latitute = latitute;
        this.imagesId = imagesId;
    }

    //getters and setters for each package

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String[]> getActivities() {
        return activities;
    }

    public void setActivities(ArrayList activities) {
        this.activities = activities;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitute() {
        return latitute;
    }

    public void setLatitute(String latitute) {
        this.latitute = latitute;
    }

    public ArrayList<int[]> getImagesId() {
        return imagesId;
    }

    public void setImagesId(ArrayList imagesId) {
        this.imagesId = imagesId;
    }
}
