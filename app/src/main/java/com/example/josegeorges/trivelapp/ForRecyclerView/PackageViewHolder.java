package com.example.josegeorges.trivelapp.ForRecyclerView;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.josegeorges.trivelapp.MainActivity;
import com.example.josegeorges.trivelapp.PackagesFragment;
import com.example.josegeorges.trivelapp.R;
import com.example.josegeorges.trivelapp.TripPackage;
import com.example.josegeorges.trivelapp.tripviewFragment;



/**
 * Created by josegeorges on 2017-11-30.
 */

/**
 * This class will serve has a holder for all the views that are going into the adapter.
 * This way, we don't need to call it everytime, which will improve performance
 * */
public class PackageViewHolder extends RecyclerView.ViewHolder {

    FragmentManager fm;

    //views
    private ImageView packageIcon;
    private TextView packageTitle;
    private TextView packagePrice;
    private TextView packageDescription;

    private RelativeLayout tripPackage;


    public PackageViewHolder(View itemView, final MainActivity activity) {
        super(itemView);
        packageIcon = (ImageView) itemView.findViewById(R.id.package_icon);
        packageTitle = (TextView) itemView.findViewById(R.id.package_title);
        packagePrice = (TextView) itemView.findViewById(R.id.package_price);
        packageDescription = (TextView) itemView.findViewById(R.id.package_description);

        /*
        * I made a setOnClickListener for the relativeLayout to simulate when an item is pressed. I made it this way
        * because we only need to press the item just once and this way makes it easy.
        * */
        tripPackage = (RelativeLayout) itemView.findViewById(R.id.tripPackage);
        tripPackage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(packageTitle != null){
                   Log.d("JOSE", packageTitle.getText().toString() + " was pressed");
                   fm = activity.getSupportFragmentManager();
                   FragmentTransaction transaction = fm.beginTransaction();
                   transaction.replace(R.id.content, new tripviewFragment());
                   transaction.commit();
                }
            }
        });
    }



    public ImageView getPackageIcon() {
        return packageIcon;
    }


    public TextView getPackageTitle() {
        return packageTitle;
    }


    public TextView getPackagePrice() {
        return packagePrice;
    }

    public TextView getPackageDescription() {
        return packageDescription;
    }

}
