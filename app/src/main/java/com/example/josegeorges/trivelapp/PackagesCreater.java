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
                "High Blue Resort", "Now Viaje", "Great Hawk Lodge", "Dunas Resort", "White Passion", "Royal Crown", "Vida Rica", "Caribbean Cruise", "Wonders"
                , "Exotica", "Royal Palace"};
        //description for each object
        String[] descriptions = {"Lossy Villa is a beautiful all inclusive resort. While here take the chance to visit" +
                "one of our 4 bars. As well as try one of the 3 on site pools. Swim up to the bar and watch the sunset over the" +
                " ocean, while enjoying a cold drink from one of our swim up bars",
                //Description 2
                "Come visit this beautiful tropical resort. It is the perfect honeymoon or family location with its magnificent pools" +
                        " and views. Visit many of the children play areas as well as the bars for the adults. There Puerto Viana" +
                        " Resort",
                //Description 3
                "Amazing tropical destination perfect for your next vacation. Every room has a perfect view of the ocean or the forest," +
                        "no matter what you cant go wrong. Just sit back and relax while we take care of everything with our all inclusive deals.",
                //Description 4
                "Stay in this beautiful resort full of rich history. Experience the historic area, top it off by staying in an old plantation" +
                        " which has been transformed into our rustic resort. Experience all the land has to offer as well as the other attractions.",
                //Description 5
                "Come experience this breathtaking water themed all inclusive resort. Visit our water park or one of our 4 pools. There are so many" +
                        " family friendly options as well as the multiple bars located by the pools for all the adults to enjoy.",
                //Description 6
                "Enjoy an all nature resort that filters all their water and uses wind to generate power. " +
                        "Discover the untold beauty presented when staying here. Once you experience it you will" +
                        " never want to leave.",
                //Description 7
                "This is the perfect destination for women. Glitter Canyon Resort is an all inclusive spa." +
                        " There is something for everyone here. We have different packages for everyone. This os the perfect" +
                        " honeymoon destination or just to get away from the kids.",
                //Description 8
                "Come fall in love with our all inclusive beach resort. Grab a drink from one of our 5 bars," +
                        " bring it to the beach and sit in one of our many luxury beach recliners. " +
                        "Spend the day lounging on the beach, enjoying drinks and enjoying the beautiful sunset over the water",
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
                "Wonders is one of the most luxury hotels in the world. Located underwater, " +
                        "Wonders offers their guests a stay they/’ll never forget. Eat and sleep while " +
                        "watching the relaxing waves and creatures of the deep ocean. It is perfect for a " +
                        "honey moon or just a simple trip with your partner!",
                //Description 17
                "Spend your family vacations in this amazing island resort. Exotica holds up to 6,000" +
                        " guests and its known for its unlimited activities. with our package, you get all" +
                        " in food and drinks! Kids will love the kids area in this resort where they have all " +
                        "the recreational activities you can imagine! ",
                //Description 18
                "Amazing resort for business trips. This lovely resort in the Margarita Island, Venezuela," +
                        " offers a golf court to spend some time on! you will also have 1st class rooms, amazing" +
                        " massages, a beautiful beach and a luxury pool! this package is recommended for golf " +
                        "lovers ",
                //Description 19
                "description19",
                //Description 20
                "description20"};
        //activities for each object
        String[] activities = {"\u2022 Snorkeling\n" +
                "\u2022 Tour ancient ruins\n" +
                "\u2022 Visit amazing Dinosaur Park\n" +
                "\u2022 Visit ancient pyramids\n" +
                "\u2022 Take a tour of the town and visit local shops\n"};
        String[] activities2 = {"\u2022 Bar hopping by the beach\n" +
                "\u2022 Historical tour of the city\n" +
                "\u2022 Bird Watching\n" +
                "\u2022 Romantic boat tour\n" +
                "\u2022 Local experience\n"};
        String[] activities3 = {"\u2022 Visit locals on a city tour\n" +
                "\u2022 Catamaran boat tours\n" +
                "\u2022 Visit the aquarium\n" +
                "\u2022 Visit ancient ruins\n" +
                "\u2022 Nightclubbing\n"};
        String[] activities4 = {"\u2022 Plantation Tour\n" +
                "\u2022 Party on Alcohol St.\n" +
                "\u2022 Steam boat ride\n" +
                "\u2022 Segway Tour\n" +
                "\u2022 Old City Tour\n"};
        String[] activities5 = {"\u2022 Water Park\n" +
                "\u2022 Beach Tours\n" +
                "\u2022 Outdoor movie\n" +
                "\u2022 Rent a classic car\n" +
                "\u2022 Swim with the dolphins\n"};
        String[] activities6 = {"\u2022 Helicopter Tour\n" +
                "\u2022 Day at the amusement park\n" +
                "\u2022 Music festival\n" +
                "\u2022 MAD National Park\n"};
        String[] activities7 = {"\u2022 Visit a casino\n" +
                "\u2022 Watch a show\n" +
                "\u2022 Tour the city\n" +
                "\u2022 Visit the Canyon\n" +
                "\u2022 Go to a drive-in\n"};
        String[] activities8 = {"\u2022 Swimming in the ocean\n" +
                "\u2022 Tour the town\n" +
                "\u2022 Shop in markets\n" +
                "\u2022 Snorkeling\n" +
                "\u2022 Boat Tour\n"};
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
        String[] activities16 = {"\u2022 Scuba diving lessons.\n" +
                "\u2022 Room Service.\n" +
                "\u2022 Restaurants.\n" +
                "\u2022 Bars."};
        String[] activities17 = {"\u2022 Scuba diving lessons\n" +
                "\u2022 Water Motorcycle Renting\n" +
                "\u2022 Restaurants all over the island\n" +
                "\u2022 Bars all over the island\n" +
                "\u2022 Night Shows\n" +
                "\u2022 Food theme on each restaurant per day\n"+
                "\u2022 Water rides\n"+
                "\u2022 Bike renting\n"+
                "\u2022 Casino.\n"+
                "\u2022 Pool Activities\n"};
        String[] activities18 = {"\u2022 Scuba diving lessons\n" +
                "\u2022 Water Motorcycle Renting\n" +
                "\u2022 Fancy Restaurants\n" +
                "\u2022 Night Bar with Karaoke nights\n" +
                "\u2022 Night Shows\n" +
                "\u2022 Golf Court\n"};
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
        String[] duration = {"4 Nights and 5 Days",
                //Duration 2
                "3 Nights and 4 Days",
                //Duration 3
                "4 Nights and 5 Days",
                //Duration 4
                "2 Nights and 3 Days",
                //Duration 5
                "3 Nights and 4 Days",
                //Duration 6
                "4 Nights and 5 Days",
                //Duration 7
                "6 Nights and 7 Days",
                //Duration 8
                "5 Nights and 6 Days",
                //Duration 9
                "4 Nights and 5 Days",
                //Duration 10
                "2 Nights and 3 Days",
                //Duration 11
                "5 Nights and 6 Days.",
                //Duration 12
                "3 Nights and 4 Days.",
                //Duration 13
                "1 Night and 2 Days.",
                //Duration 14
                "5 Nights and 6 Days.",
                //Duration 15
                "3 Nights and 4 Days.",
                //Duration 16
                "2 nights and 3 days.",
                //Duration 17
                "5 nights and 6 days.",
                //Duration 18
                "4 nights and 5 days.",
                //Duration 19
                "19",
                //Duration 20
                "20"};
        //prices for each object
        String[] prices = {"$5000",
                //Price 2
                "$3299",
                //Price 3
                "$4500",
                //Price 4
                "$2000",
                //Price 5
                "$3599",
                //Price 6
                "$4200",
                //Price 7
                "$7899",
                //Price 8
                "$4699",
                //Price 9
                "$2599",
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
                "$5890",
                //Price 17
                "$3464",
                //Price 18
                "$4897",
                //Price 19
                "19",
                //Price 20
                "20"};
        //location for each object
        String[] longitude = {"-106.402266",
                //Longitude 2
                "-67.156323",
                //Longitude 3
                "-68.412316",
                //Longitude 4
                "-81.925049",
                //Longitude 5
                "-90.062742",
                //Longitude 6
                "-80.196226",
                //Longitude 7
                "-115.174484",
                //Longitude 8
                "-77.928686",
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
                "1.259133",
                //Longitude 17
                "19.724641",
                //Longitude 18
                "11.129415",
                //Longitude 19
                "",
                //Longitude 20
                ""};
        String[] latitute = {"23.186051",
                //Latitude 2
                "18.437631",
                //Latitude 3
                "18.680727",
                //Latitude 4
                "26.422927",
                //Latitude 5
                "29.948396",
                //Latitude 6
                "25.753462",
                //Latitude 7
                "36.118485",
                //Latitude 8
                "24.895402",
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
                "103.811248",
                //Latitude 17
                "-79.795893",
                //Latitude 18
                "-63.918236",
                //Latitude 19
                "",
                //Latitude 20
                ""};
        //array of images id for each object
        int[] imagesIds = {R.drawable.trip1_pic1, R.drawable.trip1_pic2, R.drawable.trip1_pic3, R.drawable.trip1_pic4, R.drawable.trip1_pic5};
        int[] imagesIds2 = {R.drawable.trip2_pic1, R.drawable.trip2_pic2, R.drawable.trip2_pic3, R.drawable.trip2_pic4, R.drawable.trip2_pic5};
        int[] imagesIds3 = {R.drawable.trip3_pic1, R.drawable.trip3_pic2, R.drawable.trip3_pic3, R.drawable.trip3_pic4, R.drawable.trip3_pic5};
        int[] imagesIds4 = {R.drawable.trip4_pic1, R.drawable.trip4_pic2, R.drawable.trip4_pic3, R.drawable.trip4_pic4, R.drawable.trip4_pic5};
        int[] imagesIds5 = {R.drawable.trip5_pic1, R.drawable.trip5_pic2, R.drawable.trip5_pic3, R.drawable.trip5_pic4, R.drawable.trip5_pic5};
        int[] imagesIds6 = {R.drawable.trip6_pic1, R.drawable.trip6_pic2, R.drawable.trip6_pic3, R.drawable.trip6_pic4, R.drawable.trip6_pic5};
        int[] imagesIds7 = {R.drawable.trip7_pic1, R.drawable.trip7_pic2, R.drawable.trip7_pic3, R.drawable.trip7_pic4, R.drawable.trip7_pic5};
        int[] imagesIds8 = {R.drawable.trip2_pic1, R.drawable.trip2_pic2, R.drawable.trip2_pic3, R.drawable.trip2_pic4, R.drawable.trip2_pic5};
        int[] imagesIds9 = {R.drawable.trip2_pic1, R.drawable.trip2_pic2, R.drawable.trip2_pic3, R.drawable.trip2_pic4, R.drawable.trip2_pic5};
        int[] imagesIds10 = {R.drawable.trip10_pic1, R.drawable.trip10_pic2, R.drawable.trip10_pic3, R.drawable.trip10_pic4, R.drawable.trip1_pic5};
        int[] imagesIds11 = {R.drawable.trip11_pic1, R.drawable.trip11_pic2, R.drawable.trip11_pic3, R.drawable.trip11_pic4, R.drawable.trip11_pic5};
        int[] imagesIds12 = {R.drawable.trip12_pic1, R.drawable.trip12_pic2, R.drawable.trip12_pic3, R.drawable.trip12_pic4, R.drawable.trip12_pic5};
        int[] imagesIds13 = {R.drawable.trip13_pic1, R.drawable.trip13_pic2, R.drawable.trip13_pic3, R.drawable.trip13_pic4, R.drawable.trip13_pic5};
        int[] imagesIds14 = {R.drawable.trip14_pic1, R.drawable.trip14_pic2, R.drawable.trip14_pic3, R.drawable.trip14_pic4, R.drawable.trip14_pic5};
        int[] imagesIds15 = {R.drawable.trip15_pic1, R.drawable.trip15_pic2, R.drawable.trip15_pic3, R.drawable.trip15_pic4, R.drawable.trip15_pic5};
        int[] imagesIds16 = {R.drawable.trip16_pic1, R.drawable.trip16_pic2, R.drawable.trip16_pic3, R.drawable.trip16_pic4, R.drawable.trip16_pic5};
        int[] imagesIds17 = {R.drawable.trip17_pic1, R.drawable.trip17_pic2, R.drawable.trip17_pic3, R.drawable.trip17_pic4, R.drawable.trip17_pic5};
        int[] imagesIds18 = {R.drawable.trip18_pic1, R.drawable.trip18_pic2, R.drawable.trip18_pic3, R.drawable.trip18_pic4, R.drawable.trip18_pic5};
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
