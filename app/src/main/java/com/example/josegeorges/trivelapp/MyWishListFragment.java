package com.example.josegeorges.trivelapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.josegeorges.trivelapp.ForRecyclerView.PackageAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MyWishListFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MyWishListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyWishListFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    //needed items
    private FragmentManager fm;
    private Button goToPackagesButton;
    private TextView isEmptyTextView;
    private RecyclerView recyclerView;
    private ArrayList<TripPackage> tripPackages;

    public MyWishListFragment() {
        // Required empty public constructor
    }

    public void addToArrayList(TripPackage tripPackage){
        boolean contained = false;
        for (int i = 0; i < tripPackages.size(); i++){
            if(tripPackage.getTitle() == tripPackages.get(i).getTitle())
                contained = true;
        }
        if(contained)
            Log.d("JOSE", "Already in arrayList, should remove it instead");
        else {
            tripPackages.add(tripPackage);
            Log.d("JOSE", "added " + tripPackage.getTitle() + " to the arrayList, size: " + tripPackages.size());
        }

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MyWishListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MyWishListFragment newInstance(String param1, String param2) {
        MyWishListFragment fragment = new MyWishListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        tripPackages = new ArrayList<>();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_wish_list, container, false);

        //linking the views
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        isEmptyTextView = (TextView) view.findViewById(R.id.isEmpty_TextView);
        goToPackagesButton = (Button) view.findViewById(R.id.goToPackages_button);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //setting up the recyclerView
        LinearLayoutManager myLayoutManager = new LinearLayoutManager(getActivity());
        myLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        //POPULATE PACKAGES METHOD GOES HERE

        //if the tripPackages ArrayList is empty, then we show a text view saying that there are no packages yet.

            goToPackagesButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    fm = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = fm.beginTransaction();
                    transaction.replace(R.id.content, new PackagesFragment());
                    transaction.commit();
                }
            });

        recyclerView.setAdapter(new PackageAdapter(tripPackages, (MainActivity) this.getActivity()));
        recyclerView.setLayoutManager(myLayoutManager);

    }




    // TODO: Rename method, update argument and hook method into UI event
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