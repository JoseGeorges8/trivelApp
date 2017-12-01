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
    private String recommendedFor;
    private String duration;
    private String price;
    private int imageId;

    //constructor
    public TripPackage(String title, String description, String recommendedFor, String duration, String price,
                      int imageId){
        this.title = title;
        this.description = description;
        this.recommendedFor = recommendedFor;
        this.duration = duration;
        this.price = price;
        this.imageId = imageId;
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

    public String getPrice() {
        return price;
    }


    public int getImageID() {
        return imageId;
    }
}
