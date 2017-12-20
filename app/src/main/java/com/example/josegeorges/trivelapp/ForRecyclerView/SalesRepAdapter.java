package com.example.josegeorges.trivelapp.ForRecyclerView;

import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.josegeorges.trivelapp.MainActivity;
import com.example.josegeorges.trivelapp.R;
import com.example.josegeorges.trivelapp.SalesRep;

import java.util.ArrayList;

/**
 * Created by josegeorges on 2017-12-20.
 */

public class SalesRepAdapter extends RecyclerView.Adapter<SalesRepViewHolder> {

    //array of salesrep going to te recyclerView
    private ArrayList<SalesRep> list;


    //activity and fragmentManager
    private MainActivity activity;
    private FragmentManager fm;

    /**
     *
     * @param list the list use to populate items in the recyclerView
     * @param activity needed to create intents from this class
     */
    public SalesRepAdapter(ArrayList<SalesRep> list, MainActivity activity) {
        this.list = list;
        this.activity = activity;
    }


    @Override
    public SalesRepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.salesrep_items, parent, false);
        SalesRepViewHolder holder = new SalesRepViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(SalesRepViewHolder holder, int position) {
        holder.getSalesRep_image().setImageResource(list.get(position).getImageID());
        holder.getSalesRep_name().setText(list.get(position).getName());
        holder.getSalesRep_phone().setImageResource(R.drawable.ic_call_black_24dp);
        holder.getSalesRep_email().setImageResource(R.drawable.ic_email_black_24dp);
        
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
