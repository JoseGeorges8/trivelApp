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
        String[] titles = {"Lossy Villa", "Puerto Viana Resort", "Now Dominicano Resort",
                "Blue Sway Resort", "Water Bay Resort", "Free Wind Water", "Glitter Canyon Resort",
                "High Blue Resort", "Now Viaje", "Great Hawk Lodge"};
        //description for each object
        String[] descriptions = {"Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown " +
                "printer took a galley of type and scrambled it to make a type specimen book. It has survived not only " +
                "five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was " +
                "popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more " +
                "recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                //Description 2
                "description2",
                //Description 3
                "description3",
                //Description 4
                "description4",
                //Description 5
                "description5",
                //Description 6
                "description6",
                //Description 7
                "description7",
                //Description 8
                "description8",
                //Description 9
                "description9",
                //Description 10
                "Great Hawk Lodge is a great family location with a huge indoor water park. By coming to our resort have all the family time " +
                        "you need by hanging out in our arcade, going on a safari, riding rides in our water park, and going to dinner in one of our" +
                        " 5 resturants. There's something for everyone in the family to do and a great way to get your family off those phones and out in the water." +
                        " Book Today",
                //Description 11
                "description11",
                //Description 12
                "description12",
                //Description 13
                "description13",
                //Description 14
                "description14",
                //Description 15
                "description15",
                //Description 16
                "description16",
                //Description 17
                "description17",
                //Description 18
                "description18",
                //Description 19
                "description19",
                //Description 20
                "description20"};
        //activities for each object
        String[] activities = {"\u2022 See a movie at the drive-in.\n" +
                "\u2022 Walk on the boardwalk and listen to the boards creak under your feet.\n" +
                "\u2022 Blow bubbles.\n" +
                "\u2022 Play tag, hopscotch, or one of your favorite childhood games.\n" +
                "\u2022 Ride a roller coaster.\n" +
                "\u2022 Play miniature golf.\n" +
                "\u2022 Win a prize at the fair.\n" +
                "\u2022 Catch fireflies at night."};
        String[] activities2 = {"2"};
        String[] activities3 = {"3"};
        String[] activities4 = {"3"};
        String[] activities5 = {"3"};
        String[] activities6 = {"3"};
        String[] activities7 = {"3"};
        String[] activities8 = {"3"};
        String[] activities9 = {"3"};
        String[] activities10 = {"\u2022 Ride rides\n" +
                "\u2022 Huge Water Park\n" +
                "\u2022 Amazing Arcade\n" +
                "\u2022 Safari Adventure\n" +
                "\u2022 Variety of Restaurants\n" +
                "\u2022 Play miniature golf.\n"};
        String[] activities11 = {"3"};
        String[] activities12 = {"3"};
        String[] activities13 = {"3"};
        String[] activities14 = {"3"};
        String[] activities15 = {"3"};
        String[] activities16 = {"3"};
        String[] activities17 = {"3"};
        String[] activities18 = {"3"};
        String[] activities19 = {"3"};
        String[] activities20 = {"3"};


        ArrayList<String[]> arrayListActivities = new ArrayList<>();
        arrayListActivities.add(activities);
        arrayListActivities.add(activities2);
        arrayListActivities.add(activities3);
        arrayListActivities.add(activities4);
        arrayListActivities.add(activities5);
        arrayListActivities.add(activities6);
        arrayListActivities.add(activities7);
        arrayListActivities.add(activities8);
        arrayListActivities.add(activities9);
        arrayListActivities.add(activities10);
        arrayListActivities.add(activities11);
        arrayListActivities.add(activities12);
        arrayListActivities.add(activities13);
        arrayListActivities.add(activities14);
        arrayListActivities.add(activities15);
        arrayListActivities.add(activities16);
        arrayListActivities.add(activities17);
        arrayListActivities.add(activities18);
        arrayListActivities.add(activities19);
        arrayListActivities.add(activities20);

        //duration for each object
        String[] duration = {"5 Days",
                //Duration 2
                "duration2",
                //Duration 3
                "duration3",
                //Duration 4
                "4",
                //Duration 5
                "5",
                //Duration 6
                "6",
                //Duration 7
                "7",
                //Duration 8
                "8",
                //Duration 9
                "9",
                //Duration 10
                "3 Days",
                //Duration 11
                "11",
                //Duration 12
                "12",
                //Duration 13
                "13",
                //Duration 14
                "14",
                //Duration 15
                "15",
                //Duration 16
                "16",
                //Duration 17
                "17",
                //Duration 18
                "18",
                //Duration 19
                "19",
                //Duration 20
                "20"};
        //prices for each object
        String[] prices = {"$5000",
                //Price 2
                "price2",
                //Price 3
                "price3",
                //Price 4
                "4",
                //Price 5
                "5",
                //Price 6
                "6",
                //Price 7
                "6",
                //Price 8
                "8",
                //Price 9
                "9",
                //Price 10
                "$2616",
                //Price 11
                "11",
                //Price 12
                "12",
                //Price 13
                "13",
                //Price 14
                "14",
                //Price 15
                "15",
                //Price 16
                "16",
                //Price 17
                "17",
                //Price 18
                "18",
                //Price 19
                "19",
                //Price 20
                "20"};
        //location for each object
        String[] longitude = {"121.4737",
                //Longitude 2
                "2424",
                //Longitude 3
                "646",
                //Longitude 4
                "4",
                //Longitude 5
                "5",
                //Longitude 6
                "6",
                //Longitude 7
                "7",
                //Longitude 8
                "8",
                //Longitude 9
                "9",
                //Longitude 10
                "-89.771905",
                //Longitude 11
                "",
                //Longitude 12
                "2424",
                //Longitude 13
                "646",
                //Longitude 14
                "",
                //Longitude 15
                "",
                //Longitude 16
                "",
                //Longitude 17
                "",
                //Longitude 18
                "",
                //Longitude 19
                "",
                //Longitude 20
                ""};
        String[] latitute = {"31.2304",
                //Latitude 2
                "554",
                //Latitude 3
                "323",
                //Latitude 4
                "4",
                //Latitude 5
                "5",
                //Latitude 6
                "6",
                //Latitude 7
                "7",
                //Latitude 8
                "8",
                //Latitude 9
                "9",
                //Latitude 10
                "43.569993",
                //Latitude 11
                "31.2304",
                //Latitude 12
                "554",
                //Latitude 13
                "323",
                //Latitude 14
                "",
                //Latitude 15
                "",
                //Latitude 16
                "",
                //Latitude 17
                "",
                //Latitude 18
                "",
                //Latitude 19
                "",
                //Latitude 20
                ""};
        //array of images id for each object
        int[] imagesIds = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5};
        int[] imagesIds2 = {R.drawable.ic_menu_camera, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds3 = {R.drawable.ic_star_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds4 = {R.drawable.ic_star_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds5 = {R.drawable.ic_star_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds6 = {R.drawable.ic_star_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds7 = {R.drawable.ic_star_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds8 = {R.drawable.ic_star_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds9 = {R.drawable.ic_star_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds10 = {R.drawable.ic_star_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds11 = {};
        int[] imagesIds12 = {};
        int[] imagesIds13 = {};
        int[] imagesIds14 = {};
        int[] imagesIds15 = {};
        int[] imagesIds16 = {};
        int[] imagesIds17 = {};
        int[] imagesIds18 = {};
        int[] imagesIds19 = {};
        int[] imagesIds20 = {};



        ArrayList<int[]> arrayListimagesIds = new ArrayList<>();
        arrayListimagesIds.add(imagesIds);
        arrayListimagesIds.add(imagesIds2);
        arrayListimagesIds.add(imagesIds3);
        arrayListimagesIds.add(imagesIds4);
        arrayListimagesIds.add(imagesIds5);
        arrayListimagesIds.add(imagesIds6);
        arrayListimagesIds.add(imagesIds7);
        arrayListimagesIds.add(imagesIds8);
        arrayListimagesIds.add(imagesIds9);
        arrayListimagesIds.add(imagesIds10);
        arrayListimagesIds.add(imagesIds11);
        arrayListimagesIds.add(imagesIds12);
        arrayListimagesIds.add(imagesIds13);
        arrayListimagesIds.add(imagesIds14);
        arrayListimagesIds.add(imagesIds15);
        arrayListimagesIds.add(imagesIds16);
        arrayListimagesIds.add(imagesIds17);
        arrayListimagesIds.add(imagesIds18);
        arrayListimagesIds.add(imagesIds19);
        arrayListimagesIds.add(imagesIds20);




        for(int i = 0; i < titles.length; i++){
            TripPackage tripPackage = new TripPackage(titles[i], descriptions[i], arrayListActivities.get(i)
                    ,duration[i], prices[i], longitude[i], latitute[i], arrayListimagesIds.get(i));
            tripPackages.add(tripPackage);
        }

        return tripPackages;
    }

}
