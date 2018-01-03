package com.example.josegeorges.trivelapp;

import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.github.clans.fab.FloatingActionButton;
import com.mikepenz.aboutlibraries.Libs;
import com.mikepenz.aboutlibraries.LibsBuilder;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        PackagesFragment.OnFragmentInteractionListener,
        TripViewFragment.OnFragmentInteractionListener,
        MyWishListFragment.OnFragmentInteractionListener,
        TripImageFragment.OnFragmentInteractionListener{

    //for managing fragments
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //We add the WishList fragment right away so that the user can add packages to it without having to access it
        //  at least one time
        fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.content, new MyWishListFragment(), "MyWish").addToBackStack("MyWish").commit();
        //starting fragment
        fm.beginTransaction().replace(R.id.content, new AboutUsFragment()).commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        fm = getSupportFragmentManager();
        if (id == R.id.nav_packages) {
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.content, new PackagesFragment());
            transaction.commit();
        } else if (id == R.id.nav_wish_list) {
            //making sure that we always use the "MyWish" MyWishListFragment tagged
            FragmentTransaction transaction = fm.beginTransaction();
            MyWishListFragment fragment = (MyWishListFragment) fm.findFragmentByTag("MyWish");
            if(fragment != null){
                transaction.replace(R.id.content, fragment)
                        .addToBackStack("MyWish");
            }else{
                transaction.replace(R.id.content, new MyWishListFragment(), "MyWish")
                        .addToBackStack("MyWish");
            }

            transaction.commit();
        } else if (id == R.id.nav_about_us) {
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.content, new AboutUsFragment());
            transaction.commit();
        } else if (id == R.id.nav_credits) {
            new LibsBuilder()
                    .withLibraries("floatingactionbutton", "circleimageview", "pageindicatorview", "logolicense")
                    .withAutoDetect(false)
                    .withLicenseShown(true)
                    .withVersionShown(true)
                    .withActivityTitle("Credits")
                    .withActivityStyle(Libs.ActivityStyle.LIGHT_DARK_TOOLBAR)
                    .start(this);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    /**
     * This method comes from the TripViewFragment's interface OnFragmentInteractionListener.
     *  It is used to pass the package used inside the TripViewFragment, to the WishList's ArrayList that's used
     *  to populate the RecyclerView in it.
     *
     *  The main idea is that when the person presses the AddToWishList button, the package is passed in here, and
     *  from here the fragments addToArrayList method is called
     *
     * @param tripPackage the package we want to add to the WishList
     */
    @Override
    public void onFragmentInteraction(TripPackage tripPackage, FloatingActionButton fab) {
        MyWishListFragment receiver = (MyWishListFragment) fm.findFragmentByTag("MyWish");
        //making sure the fragment does exist.
        if(receiver != null)
            receiver.addToArrayList(tripPackage, fab);

        //DEBUGGING PURPOSES
        Log.d("JOSE", "Receiving listener, sending " + tripPackage.getTitle() + " to " + receiver.toString());
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
