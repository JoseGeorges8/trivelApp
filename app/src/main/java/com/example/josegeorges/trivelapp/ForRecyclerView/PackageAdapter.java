package com.example.josegeorges.trivelapp.ForRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.josegeorges.trivelapp.R;
import com.example.josegeorges.trivelapp.TripPackage;

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

    //constructor
    public PackageAdapter(ArrayList<TripPackage> list) {
        this.list = list;
    }

    @Override
    public PackageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.packages_items, parent, false);
        PackageViewHolder holder = new PackageViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(PackageViewHolder holder, int position) {
        holder.getPackageIcon().setImageResource(list.get(position).getImageID());
        holder.getPackageTitle().setText(list.get(position).getTitle());
        holder.getPackageDescription().setText(list.get(position).getDescription());
        holder.getPackagePrice().setText(list.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
