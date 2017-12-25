package com.example.josegeorges.trivelapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.josegeorges.trivelapp.ForRecyclerView.PackageAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
This fragment will be showing the current Packages Trivel offers
 */
public class PackagesFragment extends Fragment {


    private OnFragmentInteractionListener mListener;


    //needed items
    private RecyclerView recyclerView;
    private ArrayList<TripPackage> tripPackages;

    public PackagesFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tripPackages = new ArrayList<>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //inflating the view
        View view = inflater.inflate(R.layout.fragment_packages, container, false);
        getActivity().setTitle(R.string.our_packages);
        //linking the recyclerView
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



        //setting up the layoutManager
        LinearLayoutManager myLayoutManager = new LinearLayoutManager(getActivity());
        myLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //Setting up the Divider
        RecyclerViewDivider itemDecoration = new RecyclerViewDivider(recyclerView.getContext(), R.drawable.recycler_divider);
        //populating packages
        populatePackages();
        //making sure that everything is set up first
        if (tripPackages.size() > 0 & recyclerView != null) {
            recyclerView.setAdapter(new PackageAdapter(tripPackages, (MainActivity) this.getActivity()));
        }
        recyclerView.setLayoutManager(myLayoutManager);
        recyclerView.addItemDecoration(itemDecoration);
    }



    /*
    * This method is momentary to test the recyclerView and make sure everything is working.
    * is creating a couple of arrays that are going to create several packages and add them into an ArrayList of packages.
    * This packages are going to the adapter to inflate the layout.
    *
    * //TODO: externalize this method to have its on class that populates Packages.
    * */
    public void populatePackages(){
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
    }

    /*

The code below comes with the Fragment to create interaction between Fragments
    it is not being used but left it in case of need for future usage.

     */

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
