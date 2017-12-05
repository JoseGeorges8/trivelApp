package com.example.josegeorges.trivelapp.ForRecyclerView;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.josegeorges.trivelapp.MainActivity;
import com.example.josegeorges.trivelapp.R;
import com.example.josegeorges.trivelapp.TripPackage;
import com.example.josegeorges.trivelapp.TripViewFragment;

import java.util.ArrayList;

/**
 * Created by josegeorges on 2017-11-30.
 */
/**
 * The adapter will be in charge of populating the recyclerView with the information needed
 * */
public class PackageAdapter extends RecyclerView.Adapter<PackageViewHolder> {

    //array of packages going to te recyclerView
    private ArrayList<TripPackage> list;

    //activity and fragmentManager
    private MainActivity activity;
    private FragmentManager fm;


    //constructor
    public PackageAdapter(ArrayList<TripPackage> list, MainActivity activity) {
        this.list = list;
        this.activity = activity;
    }

    @Override
    public PackageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.packages_items, parent, false);
        PackageViewHolder holder = new PackageViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(PackageViewHolder holder, final int position) {
        holder.getPackageIcon().setImageResource(list.get(position).getImageID());
        holder.getPackageTitle().setText(list.get(position).getTitle());
        holder.getPackageDescription().setText(list.get(position).getDescription());
        holder.getPackagePrice().setText(list.get(position).getPrice());

         /*
        * I made a setOnClickListener for the relativeLayout to simulate when an item is pressed. I made it this way
        * because we only need to press the item just once and this way makes it easy.
        *
        * UPDATE: I took the onClickListener from the PackageViewHolder and added it here. functionality works the same but now
        * it makes it easier to work with the array of objects and pass the primitive data type to the TripViewFragment
        * */
        holder.getTripPackage().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("JOSE", list.get(position).getTitle() + " was pressed");
                Bundle bundle = new Bundle();
                bundle.putString("title", list.get(position).getTitle());
                bundle.putString("description", list.get(position).getDescription());
                bundle.putString("price", list.get(position).getPrice());
                fm = activity.getSupportFragmentManager();
                FragmentTransaction transaction = fm.beginTransaction();
                TripViewFragment tempFragment = new TripViewFragment();
                tempFragment.setArguments(bundle);
                transaction.replace(R.id.content, tempFragment);
                transaction.commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
