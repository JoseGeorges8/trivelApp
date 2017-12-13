package com.example.josegeorges.trivelapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TripImageFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TripImageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TripImageFragment extends Fragment {
    //key for the bundle
    private static final String IMAGE = "image";
    //variable receiving the image
    private int image;

    private OnFragmentInteractionListener mListener;

    public TripImageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param image image to populate the imageView with.
     * @return A new instance of fragment TripImageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TripImageFragment newInstance(int image) {
        TripImageFragment fragment = new TripImageFragment();
        Bundle args = new Bundle();
        args.putInt(IMAGE, image);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            image = getArguments().getInt(IMAGE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_trip_image, container, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(image);


        return view;
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
