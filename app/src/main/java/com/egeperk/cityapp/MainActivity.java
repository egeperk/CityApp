package com.egeperk.cityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.egeperk.cityapp.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    ArrayList<Landmarks> landmarksArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // Data

        Landmarks eiffel = new Landmarks("Eiffel Kulesi", "Fransa", R.drawable.eiffel);
        Landmarks pisa = new Landmarks("Pisa Kulesi", "İtalya", R.drawable.pisa);
        Landmarks colessium = new Landmarks("Kolezyum", "İtalya", R.drawable.colessium);
        Landmarks liberty = new Landmarks("Özgürlük Anıtı", "ABD", R.drawable.liberty);
        Landmarks machu = new Landmarks("Machu Pichu", "Peru", R.drawable.machupichu);
        Landmarks tacmahal = new Landmarks("Tac Mahal", "Hindistan", R.drawable.tacmahal);
        Landmarks christ = new Landmarks("Kurtarıcı İsa", "Brezilya", R.drawable.christ);

        landmarksArrayList.add(eiffel);
        landmarksArrayList.add(pisa);
        landmarksArrayList.add(colessium);
        landmarksArrayList.add(liberty);
        landmarksArrayList.add(machu);
        landmarksArrayList.add(tacmahal);
        landmarksArrayList.add(christ);

        // Bitmap - verimli değil / internetten çektiğin görseli bitmap'e çevireceksin / Bitmap intent ile gönderilemiyor bu yüzden Singleton kullancaz.
        Bitmap eiffelBitmap = BitmapFactory.decodeResource(getResources(),R.drawable.eiffel);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarksAdapter landmarksAdapter = new LandmarksAdapter(landmarksArrayList);
        binding.recyclerView.setAdapter(landmarksAdapter);

       /*
        //// LisTView verimsiz ---------
        //// RecyclerView verimli +++++++++

        /// Adapter - veri kaynağı ile xml ve listView birbirine bağlayan yapı / ListView 'da çok kolay

        // mapping - bişeyi bişeye dönüştürmek - arrayList içerisindeki verileri sadece isimlere dönüştürcez.

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);

        /// Liste elemanlarını tıklanabilir yapmak

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, indexList.get(position).name,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",landmarkArrayList.get(position));
                startActivity(intent);
            }
        });

        */

    }








}