package com.egeperk.cityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.egeperk.cityapp.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //findViewById verimsiz!
        //// View Binding
        /// inflate (layout).xml ile kodu bağlamaya çalışan bişey


        Intent intent = getIntent();
        // Casting
        //Landmarks selectedLandmark = (Landmarks) intent.getSerializableExtra("landmark");

        Singleton singleton = Singleton.getInstance();
        Landmarks selectedLandmark = singleton.getSentLandmark();

        binding.tvName.setText(selectedLandmark.name);
        binding.tvCountry.setText(selectedLandmark.country);
        binding.ivImage.setImageResource(selectedLandmark.image);

    }
}