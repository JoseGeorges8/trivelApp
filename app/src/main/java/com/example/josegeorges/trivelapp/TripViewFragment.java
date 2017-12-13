package com.example.josegeorges.trivelapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TabHost;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TripViewFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TripViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TripViewFragment extends Fragment {

    //keys for the bundle
    public static final String TITLE = "title";
    public static final String DESCRIPTION = "description";
    public static final String ACTIVITIES = "activities";
    public static final String DURATION = "duration";
    public static final String PRICE = "price";
    public static final String LONGITUDE = "longitude";
    public static final String LATITUDE = "latitude";
    public static final String IMAGES_ID = "images";


    // TODO: Rename and change types of parameters
    private String title;
    private String description;
    private String[] activities;
    private String duration;
    private String price;
    private String longitude;
    private String latitude;
    private int[] imagesId;

    private OnFragmentInteractionListener mListener;

    public TripViewFragment() {

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param list ArrayList of tripPackages.
     * @param position to know which item that was pressed in the recyclerView.
     * @return A new instance of fragment TripViewFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TripViewFragment newInstance(ArrayList<TripPackage> list, int position) {
        TripViewFragment fragment = new TripViewFragment();
        Bundle bundle = new Bundle();
        bundle.putString(TITLE, list.get(position).getTitle());
        bundle.putString(DESCRIPTION, list.get(position).getDescription());
        bundle.putStringArray(ACTIVITIES, list.get(position).getActivities());
        bundle.putString(DURATION, list.get(position).getDuration());
        bundle.putString(PRICE, list.get(position).getPrice());
        bundle.putString(LONGITUDE, list.get(position).getLongitude());
        bundle.putString(LATITUDE, list.get(position).getLatitute());
        bundle.putIntArray(IMAGES_ID, list.get(position).getImagesId());
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            title = getArguments().getString(TITLE);
            description = getArguments().getString(DESCRIPTION);
            activities = getArguments().getStringArray(ACTIVITIES);
            duration = getArguments().getString(DURATION);
            price = getArguments().getString(PRICE);
            longitude = getArguments().getString(LONGITUDE);
            latitude = getArguments().getString(LATITUDE);
            imagesId = getArguments().getIntArray(IMAGES_ID);
            Log.d("JOSE", title + " was pressed and I received it in tripViewFragment");

        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tripview, container, false);

        /**
         * Adding the viewPager and setting the adapter
         */
        CustomAdapter adapter = new CustomAdapter(getChildFragmentManager()); //getChildFragmentManager
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.tripView_viewPager);
        viewPager.setAdapter(adapter);

        TabHost host = view.findViewById(R.id.tabHost);
        host.setup();

        TabHost.TabSpec spec = host.newTabSpec("Description");
        spec.setContent(R.id.description);
        spec.setIndicator("Description");
        host.addTab(spec);

        spec = host.newTabSpec("Activities");
        spec.setContent(R.id.activities);
        spec.setIndicator("Activities");
        host.addTab(spec);

        spec = host.newTabSpec("Contact");
        spec.setContent(R.id.contact);
        spec.setIndicator("Contact");
        host.addTab(spec);

        Button email = (Button) view.findViewById(R.id.email);
        Button map = (Button) view.findViewById(R.id.map);
        Button phone = (Button) view.findViewById(R.id.call);
        Button web = (Button) view.findViewById(R.id.web);
        Button cal = (Button) view.findViewById(R.id.calendar);


        /**
         * The fab button will work as an add to favorites button.
         */
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, title + " added to your favorites", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();

                TripPackage temp = new TripPackage(title, description, activities, duration, price, longitude, latitude, imagesId);
                onFabButtonPressed(temp);
            }
        });

        return view;
    }

    /**
     * @author josegeorges
     * Create a custom Adapter for the view pager.
     *
     * it will be populated with the images of each package.
     */
    public class CustomAdapter extends FragmentPagerAdapter {

        public CustomAdapter(FragmentManager fm){
            super(fm);

        }


        //position tells the program what fragment we are currently on/displaying
        public Fragment getItem(int position){
            switch (position){ //notice we don't use breaks on each case, due to the return statement on each.
                case 0: return TripImageFragment.newInstance(imagesId[0]);
                case 1: return TripImageFragment.newInstance(imagesId[1]);
                case 2: return TripImageFragment.newInstance(imagesId[2]);
                default: return TripImageFragment.newInstance(imagesId[0]);
            }
        }

        public  int getCount(){
            return 3;
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
        void onFragmentInteraction(TripPackage tripPackage);
    }

    public void onFabButtonPressed(TripPackage tripPackage) {
        if (mListener != null) {
            mListener.onFragmentInteraction(tripPackage);
        }
    }
}
