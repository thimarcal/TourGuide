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
public class HollywoodFragment extends Fragment {

    private List<VisitPlace> mListedPlaces;
    private RecyclerView mRecyclerView;

    public HollywoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_hs, container, false);

        mRecyclerView = view.findViewById(R.id.hs_recycleview);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        PlaceAdapter adapter = new PlaceAdapter();
        mListedPlaces = Utils.getHollywoodStudioPlaces(getContext());
        adapter.setPlaces(mListedPlaces);

        mRecyclerView.setAdapter(adapter);

        return view;
    }

}
