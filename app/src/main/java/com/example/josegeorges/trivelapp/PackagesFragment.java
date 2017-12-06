package com.example.josegeorges.trivelapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.josegeorges.trivelapp.ForRecyclerView.PackageAdapter;

import java.util.ArrayList;


public class PackagesFragment extends Fragment {

//    //names for the keys in the bundle
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    //variables
//    private String mParam1;
//    private String mParam2;


    private OnFragmentInteractionListener mListener;


    //needed items
    private RecyclerView recyclerView;
    private ArrayList<TripPackage> tripPackages;

    public PackagesFragment() {

    }

//    public static PackagesFragment newInstance(String param1, String param2) {
//        PackagesFragment fragment = new PackagesFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tripPackages = new ArrayList<>();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_packages, container, false);

        //linking the recyclerView
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        //setting up the recyclerView
        LinearLayoutManager myLayoutManager = new LinearLayoutManager(getActivity());
        myLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        populatePackages();
        //making sure that everything is set up first
        if (tripPackages.size() > 0 & recyclerView != null) {
            recyclerView.setAdapter(new PackageAdapter(tripPackages, (MainActivity) this.getActivity()));
        }
        recyclerView.setLayoutManager(myLayoutManager);

    }



    /*
    * This method is momentary to test the recyclerView and make sure everything is working.
    * is creating a couple of arrays that are going to create several packages and add them into an ArrayList of packages.
    * This packages are going to the adapter to inflate the layout.
    * */
    public void populatePackages(){
        tripPackages.clear();
      String[] titles = {"title1", "title2", "title3"};
      String[] descriptions = {"description1", "description2", "description3"};
      String[] prices = {"price1", "price2", "price3"};
      String[] duration = {"duration1", "duration2", "duration3"};
      String[] recommendedFor = {"recommendedFor1", "recommendedFor2", "recommendedFor3"};
      int[] imagesIds = {R.drawable.ic_flight_takeoff_black_24dp, R.drawable.ic_check_circle_black_24dp, R.drawable.ic_group_black_24dp};

      for(int i = 0; i < titles.length; i++){
          TripPackage tripPackage = new TripPackage(titles[i], descriptions[i], recommendedFor[i]
          ,duration[i], prices[i], imagesIds[i]);
          tripPackages.add(tripPackage);
      }
    }

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

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
