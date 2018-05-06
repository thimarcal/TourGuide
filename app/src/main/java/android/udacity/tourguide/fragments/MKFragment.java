package android.udacity.tourguide.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.udacity.tourguide.Utils;
import android.udacity.tourguide.adapter.PlaceAdapter;
import android.udacity.tourguide.data.VisitPlace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.udacity.tourguide.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MKFragment extends Fragment {

    private List<VisitPlace> mListedPlaces;
    private RecyclerView mRecyclerView;

    public MKFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mk, container, false);

        mRecyclerView = view.findViewById(R.id.mk_recycleview);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        PlaceAdapter adapter = new PlaceAdapter();
        mListedPlaces = Utils.getMagicKingdomPlaces(getContext());
        adapter.setPlaces(mListedPlaces);

        mRecyclerView.setAdapter(adapter);

        return view;
    }

}
