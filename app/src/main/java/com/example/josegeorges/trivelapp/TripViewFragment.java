package com.example.josegeorges.trivelapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TextView;



/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TripViewFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TripViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TripViewFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String mParam3;

    private OnFragmentInteractionListener mListener;

    public TripViewFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TripViewFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TripViewFragment newInstance(String param1, String param2, String param3) {
        TripViewFragment fragment = new TripViewFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putString(ARG_PARAM3, param3);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString("title");
            mParam2 = getArguments().getString("description");
            mParam3 = getArguments().getString("price");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tripview, container, false);

        FloatingActionButton fab = getActivity().findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "The trip " + mParam1 + " was added to your wishlist.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        fab.show();

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

        spec = host.newTabSpec("Contact");
        spec.setContent(R.id.contact);
        spec.setIndicator("Contact");
        host.addTab(spec);

        Button email = (Button) view.findViewById(R.id.email);
        Button map = (Button) view.findViewById(R.id.map);
        Button phone = (Button) view.findViewById(R.id.call);
        Button web = (Button) view.findViewById(R.id.web);
        Button cal = (Button) view.findViewById(R.id.calendar);

        TextView title = view.findViewById(R.id.title);
        TextView description = view.findViewById(R.id.descriptionText);
        TextView price = view.findViewById(R.id.price);

        title.setText(mParam1);
        description.setText(mParam2);
        price.setText(mParam3);



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
