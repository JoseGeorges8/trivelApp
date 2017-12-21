package com.example.josegeorges.trivelapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.josegeorges.trivelapp.ForRecyclerView.PackageAdapter;
import com.example.josegeorges.trivelapp.ForRecyclerView.SalesRepAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AboutUsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AboutUsFragment extends Fragment {

    //needed items
    private RecyclerView recyclerView;
    private ArrayList<SalesRep> salesReps;

    public AboutUsFragment() {
        // Required empty public constructor
    }


    public static AboutUsFragment newInstance(String param1, String param2) {
        AboutUsFragment fragment = new AboutUsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
        salesReps = new ArrayList<>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_us2, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.aboutUs_recyclerView);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        //setting up the layoutManager
        LinearLayoutManager myLayoutManager = new LinearLayoutManager(getActivity());
        myLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //populating packages
        populatePackages();
        //making sure that everything is set up first
        if (salesReps.size() > 0 & recyclerView != null) {
            recyclerView.setAdapter(new SalesRepAdapter(salesReps, (MainActivity) this.getActivity()));
        }
        recyclerView.setLayoutManager(myLayoutManager);

    }

    public void populatePackages(){
        String[] names = {"Jose Georges", "Nick Stajduhar"};
        String[] emails = {"georges.elboutros@gmail.com", "nick@gmail.com"};
        String[] phones = {"2262022111", "222222222"};
        int[] imagesID = {R.drawable.jose, R.drawable.nick};
        for(int i = 0; i < names.length; i++){
            SalesRep salesRep = new SalesRep(names[i], emails[i], phones[i], imagesID[i]);
            salesReps.add(salesRep);
        }
    }

}
