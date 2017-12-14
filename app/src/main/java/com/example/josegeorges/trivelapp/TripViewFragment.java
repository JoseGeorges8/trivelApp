package com.example.josegeorges.trivelapp;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.CalendarContract;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;




/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TripViewFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TripViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TripViewFragment extends Fragment {



    private FloatingActionMenu menuRed;

    private com.github.clans.fab.FloatingActionButton fab1;
    private com.github.clans.fab.FloatingActionButton fab2;
    private com.github.clans.fab.FloatingActionButton fab3;


    private List<FloatingActionMenu> menus = new ArrayList<>();
    private Handler mUiHandler = new Handler();

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

        menuRed = (com.github.clans.fab.FloatingActionMenu) view.findViewById(R.id.menu_red);

        fab1 = (com.github.clans.fab.FloatingActionButton) view.findViewById(R.id.fab1);
        fab2 = (com.github.clans.fab.FloatingActionButton) view.findViewById(R.id.fab2);
        fab3 = (com.github.clans.fab.FloatingActionButton) view.findViewById(R.id.fab3);

        fab1.setLabelText("Add " + title + " to wishlist");
        fab2.setLabelText("Map");
        fab3.setLabelText("Add trip to your Calendar");


        /**
         * This section will be for the onClickListeners for the 3 mini fab buttons
         *
         * fab1 = Whishlist
         * fab2 = Location (map)
         * fab3 = Add to calender
         */
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TripPackage temp = new TripPackage(title, description, activities, duration, price, longitude, latitude, imagesId);
                onFabButtonPressed(temp);

                if (menuRed.isOpened()) {
                            Toast.makeText(getActivity(), title + " was added to the wishlist", Toast.LENGTH_SHORT).show();
                        }

                        menuRed.toggle(true);
            }






        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + latitude + "," + longitude + "(" + title + ")");
                Log.d("nick", gmmIntentUri.toString());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //For Calender
                String eventTitle = "Upcoming Trip";
                long startMillis = 0;
                long endMillis = 0;
                Calendar beginTime = Calendar.getInstance();
                beginTime.set(2017,9,14,7,30);
                startMillis = beginTime.getTimeInMillis();
                Calendar endTime = Calendar.getInstance();
                endTime.set(2017,9,14,9,30);
                endMillis = endTime.getTimeInMillis();


                Intent intent = new Intent(Intent.ACTION_INSERT);
                intent.setData(CalendarContract.Events.CONTENT_URI);
                intent.putExtra(CalendarContract.Events.TITLE, eventTitle);
                intent.putExtra(CalendarContract.Events.EVENT_LOCATION, title);
                intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, startMillis);
                intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endMillis);
                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(intent);
                }

            }
        });

        menuRed.setClosedOnTouchOutside(true);
        menuRed.hideMenuButton(false);


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


        TextView titleText = view.findViewById(R.id.titleText);
        TextView descriptionText = view.findViewById(R.id.descriptionText);
        TextView priceText = view.findViewById(R.id.priceText);
        TextView actText = view.findViewById(R.id.actText);
        TextView durText = view.findViewById(R.id.durText);

        titleText.setText(title);
        descriptionText.setText(description);
        priceText.setText("Price of Trip: " + price);
        durText.setText("Duration of trip: " + duration);

        StringBuilder builder = new StringBuilder();
        for(String s : activities) {
            builder.append(s);
        }
        String str = builder.toString();
        actText.setText(str);




        return view;
    }

    //When the activity is created the fab button is added and animated into the apps fragment
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        menus.add(menuRed);


        int delay = 400;
        for (final FloatingActionMenu menu : menus) {
            mUiHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    menu.showMenuButton(true);
                }
            }, delay);
            delay += 150;
        }



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
                case 3: return TripImageFragment.newInstance(imagesId[3]);
                case 4: return TripImageFragment.newInstance(imagesId[4]);
                default: return TripImageFragment.newInstance(imagesId[0]);
            }
        }

        public  int getCount(){
            return 5;
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
