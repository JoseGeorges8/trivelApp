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
                "High Blue Resort", "Now Viaje", "Great Hawk Lodge", "Dunas Resort", "White Passion", "Royal Crown", "Vida Rica", "Caribbean Cruise"};
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
                "Spend some time in this luxury resort located in the Margarita Island in Venezuela. " +
                        "With more than 3 restaurants, you get access to all the meals and snacks the whole day. " +
                        "Also, you have unlimited drinks included! (both alcoholic and non-alcoholic, exclusion applies). " +
                        "Relax and enjoy the quiet ocean on their white sand beach, with view to the island/’s lighthouse. " +
                        "This trip is perfect if you are looking to just get away of your daily routine.",
                //Description 12
                "You will feel like living a royal life staying at this luxury greek hotel. " +
                        "Located in the beautiful city of Santorini,  you are going to be able to get " +
                        "away from your responsibilities and escape to this palace of pleasure and relax. " +
                        "Start your day with a beautiful blue ocean view, and stay all day enjoying of massages, " +
                        "beautiful pools and the nice sound of silence.",
                //Description 13
                "Looking to spend the night on a quick business trip? or maybe pass the night with your partner " +
                        "while visiting London? Then this package is for you! Stay the night at Royal Crown, one " +
                        "of the most luxury hotels in London to stay, with first class restaurants, to indoor pool" +
                        " and indoor gym.",
                //Description 14
                "Enjoy of the most beautiful beaches in Cancun, Mexico and stay in one of the most luxurious hotels in Cancun." +
                        " Vida Rica is known for all the activities they provide on their near beaches, combining with" +
                        " their awesome restaurants and enjoyable night bats. For the kids, the hotel also provides many" +
                        " activities like pool recreation and many activities more! Don/’t forget to do some scuba " +
                        "diving on the cleanest beaches and ride water motorcycles!",
                //Description 15
                "Travel through the Caribbean on one of the biggest cruise in the world. " +
                        "With more than 1,000 foot long, the Caribbean Cruise carries up to 5,000 guests! " +
                        "It has all the activities your family will love to enjoy. From water slides, to" +
                        " relaxing pools, the Caribbean Cruise has everything you need to spend one of the " +
                        "best summer travels of your life! Also, if you are tired of spending the time outside " +
                        "on the sun, the Cruise has many floors with different activities each. From Casinos, to " +
                        "fancy restaurants and a theatre, Caribbean Cruise will not bored you or your family! The " +
                        "Cruise Caribbean sails from Miami, Florida and passes through the Caribbean islands, making" +
                        " stops in Puerto Rico, Dominican Republic and Cuba!",
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
        String[] activities11 = {"\u2022 Excursion to the lighthouse\n" +
                "\u2022 Yoga in the beach\n" +
                "\u2022 Aerobics at the pool area\n" +
                "\u2022 Bingo every night after exclusive night theatre show\n" +
                "\u2022 All night disco club for grown ups!\n" +
                "\u2022 Movie theatre with different functions everyday.\n"+
                "\u2022 Multiple aquatic games at the pool area.\n"+
                "\u2022 Rent of bikes.\n"+
                "\u2022 Free access to the hotel’s gym.\n"+
                "\u2022 Karaoke Thursday!\n"};
        String[] activities12 = {"\u2022 Massages\n" +
                "\u2022 Excursion through the beautiful seas outside Greece\n" +
                "\u2022 Scuba diving classes\n" +
                "\u2022 Hiking Excursion\n" +
                "\u2022 Cooking class and wine testing\n"};
        String[] activities13 = {"\u2022 Gym classes scheduled.\n" +
                "\u2022 Personal Massages.\n" +
                "\u2022 Live bands inside the hotel bar.\n" +
                "\u2022 Excursion to get to know London for one day in a bus.\n" +
                "\u2022 Room service.\n"};
        String[] activities14 = {"\u2022 Water Motorcycle rent.\n" +
                "\u2022 Pool recreation.\n" +
                "\u2022 Beach activities\n" +
                "\u2022 All night disco club for grown ups!\n" +
                "\u2022 Movie theatre with different functions everyday.\n"+
                "\u2022 Free access to the hotel’s gym\n"+
                "\u2022 Scuba diving lessons\n"+
                "\u2022 Gaming room for kids\n"};
        String[] activities15 = {"\u2022 Water Rides\n" +
                "\u2022 Theater\n" +
                "\u2022 Stores to shop\n" +
                "\u2022 Restaurants with different types of food\n" +
                "\u2022 3 stops in Puerto Rico, Dominican Republic and Cuba.\n" +
                "\u2022 Gym (may charge for usage)\n"+
                "\u2022 Night Club with different theme nights\n"+
                "\u2022 Karaoke Bar\n"+
                "\u2022 Casino.\n"+
                "\u2022 Pool Activities\n"};
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
                "5 nights and 6 days.",
                //Duration 12
                "3 nights and 4 days.",
                //Duration 13
                "1 night and 2 days.",
                //Duration 14
                "5 nights and 6 days.",
                //Duration 15
                "3 nights and 4 days.",
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
                "$1500",
                //Price 12
                "$2390",
                //Price 13
                "$999",
                //Price 14
                "$3457",
                //Price 15
                "$1765",
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
                "10.992794",
                //Longitude 12
                "36.395113",
                //Longitude 13
                "51.518482",
                //Longitude 14
                "19.083127",
                //Longitude 15
                "25.899108",
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
                "-63.930741",
                //Latitude 12
                "25.464917",
                //Latitude 13
                "-0.105745",
                //Latitude 14
                "-87.553813",
                //Latitude 15
                "-80.123943",
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
        int[] imagesIds = {R.drawable.trip1_pic1, R.drawable.trip1_pic2, R.drawable.trip1_pic3, R.drawable.trip1_pic4, R.drawable.trip1_pic5};
        int[] imagesIds2 = {R.drawable.ic_menu_camera, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds3 = {R.drawable.ic_star_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds4 = {R.drawable.ic_star_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds5 = {R.drawable.ic_star_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds6 = {R.drawable.ic_star_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds7 = {R.drawable.ic_star_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds8 = {R.drawable.ic_star_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds9 = {R.drawable.ic_star_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};
        int[] imagesIds10 = {R.drawable.trip2_pic1, R.drawable.trip2_pic2, R.drawable.trip2_pic3, R.drawable.trip2_pic4, R.drawable.trip1_pic5};
        int[] imagesIds11 = {R.drawable.trip11_pic1, R.drawable.trip11_pic2, R.drawable.trip11_pic3, R.drawable.trip11_pic4, R.drawable.trip11_pic5};
        int[] imagesIds12 = {R.drawable.trip12_pic1, R.drawable.trip12_pic2, R.drawable.trip12_pic3, R.drawable.trip12_pic4, R.drawable.trip12_pic5};
        int[] imagesIds13 = {R.drawable.trip13_pic1, R.drawable.trip13_pic2, R.drawable.trip13_pic3, R.drawable.trip13_pic4, R.drawable.trip13_pic5};
        int[] imagesIds14 = {R.drawable.trip14_pic1, R.drawable.trip14_pic2, R.drawable.trip14_pic3, R.drawable.trip14_pic4, R.drawable.trip14_pic5};
        int[] imagesIds15 = {R.drawable.trip15_pic1, R.drawable.trip15_pic2, R.drawable.trip15_pic3, R.drawable.trip15_pic4, R.drawable.trip15_pic5};
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
