package com.example.josegeorges.trivelapp;

import android.content.Context;
import android.view.View;
import android.widget.TabHost;

/**
 * Created by josegeorges on 2017-12-14.
 *
 * This class will help animate the TabHost when tabs are change to make the app look nicer.
 */

public class AnimationTabListener implements TabHost.OnTabChangeListener{

    private Context context;
    private static final int ANIMATION_TIME = 240;
    private TabHost tabHost;
    private View previousView;
    private View currentView;
    private int currentTab;

    public AnimationTabListener(Context context, TabHost tabHost){
        this.context = context;
        this.tabHost = tabHost;
        previousView = tabHost.getCurrentView();
    }

    @Override
    public void onTabChanged(String s) {


    }
}
