package com.example.recycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder> {

    private List<Place> placeList;
    private Context context;

    public PlaceAdapter(Context context, List<Place> placeList) {
        this.context = context;
        this.placeList = placeList;
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_card, parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        Place place = placeList.get(position);
        holder.titleView.setText(place.getTitle());
        holder.descriptionView.setText(place.getDescription());
        holder.imageView.setImageResource(place.getImageResource());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("title", place.getTitle());
            intent.putExtra("description", place.getDescription());
            intent.putExtra("location", place.getLocation());
            intent.putExtra("rating", place.getRating());
            intent.putExtra("imageResource", place.getImageResource());
            context.startActivity(intent);
        });
    }


    @Override
    public int getItemCount() {
        return placeList.size();
    }

    public static class PlaceViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView titleView, descriptionView;

        public PlaceViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            titleView = itemView.findViewById(R.id.titleView);
            descriptionView = itemView.findViewById(R.id.descriptionView);
        }
    }
}
