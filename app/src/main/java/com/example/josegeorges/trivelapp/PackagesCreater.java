package com.example.josegeorges.trivelapp;

import java.util.ArrayList;

/**
 * Created by josegeorges on 2017-12-27.

 This class will help to hold every package

 */
public class PackagesCreater {

    /*
    * This method is creating a couple of arrays that are going to create several packages and
     * add them into an ArrayList of packages.
    * This packages are going to the adapter to inflate the layout.
    *
    * */
    public static ArrayList<TripPackage> populatePackages(ArrayList<TripPackage> tripPackages){
        tripPackages.clear();
        //title for each object
        String[] titles = {"Lossy Villa", "title2", "title3"};
        //description for each object
        String[] descriptions = {"Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown " +
                "printer took a galley of type and scrambled it to make a type specimen book. It has survived not only " +
                "five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was " +
                "popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more " +
                "recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                "description2", "description3"};
        //activities for each object
        String[] activities = {"\u2022 See a movie at the drive-in.\n" +
                "\u2022 Walk on the boardwalk and listen to the boards creak under your feet.\n" +
                "\u2022 Blow bubbles.\n" +
                "\u2022 Play tag, hopscotch, or one of your favorite childhood games.\n" +
                "\u2022 Ride a roller coaster.\n" +
                "\u2022 Play miniature golf.\n" +
                "\u2022 Win a prize at the fair.\n" +
                "\u2022 Catch fireflies at night.", "activity2", "activity3"};
        ArrayList<String[]> arrayListActivities = new ArrayList<>();
        arrayListActivities.add(activities);
        arrayListActivities.add(activities);
        arrayListActivities.add(activities);
        //duration for each object
        String[] duration = {"5 Days", "duration2", "duration3"};
        //prices for each object
        String[] prices = {"$5000", "price2", "price3"};
        //location for each object
        String[] longitude = {"121.4737", "2424", "646"};
        String[] latitute = {"31.2304", "554", "323"};
        //array of images id for each object
        int[] imagesIds = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5};
        int[] imagesIds2 = {R.drawable.ic_menu_camera, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds3 = {R.drawable.ic_star_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};

        ArrayList<int[]> arrayListimagesIds = new ArrayList<>();
        arrayListimagesIds.add(imagesIds);
        arrayListimagesIds.add(imagesIds2);
        arrayListimagesIds.add(imagesIds3);


        for(int i = 0; i < titles.length; i++){
            TripPackage tripPackage = new TripPackage(titles[i], descriptions[i], arrayListActivities.get(i)
                    ,duration[i], prices[i], longitude[i], latitute[i], arrayListimagesIds.get(i));
            tripPackages.add(tripPackage);
        }

        return tripPackages;
    }

}
