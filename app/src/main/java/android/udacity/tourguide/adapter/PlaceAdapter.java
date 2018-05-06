package android.udacity.tourguide.adapter;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.udacity.tourguide.R;
import android.udacity.tourguide.data.VisitPlace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder> {

    private List<VisitPlace> mPlaces;

    public void setPlaces(List<VisitPlace> places) {
        mPlaces = places;
    }
    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View placeView = inflater.inflate(R.layout.place_item, parent, false);
        return new PlaceViewHolder(placeView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        holder.mPlaceImageIV.setImageResource(mPlaces.get(position).getPlaceImgResource());
        holder.mPlaceNameTV.setText(mPlaces.get(position).getPlaceName());
        holder.mPlaceDescTV.setText(mPlaces.get(position).getPlaceDescription());
    }

    @Override
    public int getItemCount() {
        if (null != mPlaces) {
            return mPlaces.size();
        }
        return 0;
    }

    class PlaceViewHolder extends RecyclerView.ViewHolder{

        private ImageView mPlaceImageIV;
        private TextView mPlaceNameTV;
        private TextView mPlaceDescTV;

        public PlaceViewHolder(View itemView) {
            super(itemView);

            mPlaceImageIV = itemView.findViewById(R.id.placeImage);
            mPlaceNameTV = itemView.findViewById(R.id.place_name);
            mPlaceDescTV = itemView.findViewById(R.id.place_description);
        }


    }
}
