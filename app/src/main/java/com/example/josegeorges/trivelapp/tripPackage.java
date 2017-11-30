package com.example.josegeorges.trivelapp;

/**
 * Created by josegeorges on 2017-11-30.
 */


import java.util.ArrayList;

/**
 * This class will serve has a holder for the information of each package. making it easier to populate the recyclerView with each package.
 * the class will have private properties, they will be populated through the constructor and called through getters.
 */
public class tripPackage {

    //properties for the package
    private String title;
    private String description;
    private String recommendedFor;
    private String duration;
    private Double price;
    private ArrayList<Integer> images;
    private ArrayList<String> activities;

    //constructor
    public tripPackage(String title, String description, String recommendedFor, String duration,Double price,
                       ArrayList<Integer> images, ArrayList<String> activities){
        this.title = title;
        this.description = description;
        this.recommendedFor = recommendedFor;
        this.duration = duration;
        this.price = price;
        this.images = images;
        this.activities = activities;
    }

    //getters for each package
    public String getTitle() {
        return title;
    }


    public String getDescription() {
        return description;
    }


    public String getRecommendedFor() {
        return recommendedFor;
    }


    public String getDuration() {
        return duration;
    }

    public Double getPrice() {
        return price;
    }


    public ArrayList<Integer> getImages() {
        return images;
    }


    public ArrayList<String> getActivities() {
        return activities;
    }

}
