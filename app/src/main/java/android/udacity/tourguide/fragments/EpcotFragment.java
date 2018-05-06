package android.udacity.tourguide.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.udacity.tourguide.R;
import android.udacity.tourguide.Utils;
import android.udacity.tourguide.adapter.PlaceAdapter;
import android.udacity.tourguide.data.VisitPlace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class EpcotFragment extends Fragment {

    private List<VisitPlace> mListedPlaces;
    private RecyclerView mRecyclerView;

    public EpcotFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_epcot, container, false);

        mRecyclerView = view.findViewById(R.id.epcot_recycleview);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        PlaceAdapter adapter = new PlaceAdapter();
        mListedPlaces = Utils.getEpcotCenterPlaces(getContext());
        adapter.setPlaces(mListedPlaces);

        mRecyclerView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return view;


    }

}
