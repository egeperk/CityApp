package com.egeperk.cityapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.egeperk.cityapp.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class LandmarksAdapter extends RecyclerView.Adapter<LandmarksAdapter.LandmarksHolder> {

    ArrayList<Landmarks> landmarksArrayList;

    public LandmarksAdapter(ArrayList<Landmarks> landmarksArrayList) {
        this.landmarksArrayList = landmarksArrayList;
    }

    @NonNull
    @Override
    public LandmarksHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandmarksHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandmarksHolder holder, int position) {
    holder.binding.recyclerViewTextView.setText(landmarksArrayList.get(position).name);
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(holder.itemView.getContext(),DetailsActivity.class);
            //intent.putExtra("landmark", landmarksArrayList.get(position));
            Singleton singleton = Singleton.getInstance();
            singleton.setSentLandmark(landmarksArrayList.get(position));
            holder.itemView.getContext().startActivity(intent);

        }
    });
    }

    @Override
    public int getItemCount() {
        return landmarksArrayList.size();
    }

    public class LandmarksHolder extends RecyclerView.ViewHolder {

        private RecyclerRowBinding binding;

        public LandmarksHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
