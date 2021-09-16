package com.example.mutlipleviewtypes.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mutlipleviewtypes.R;
import com.example.mutlipleviewtypes.adapter.TripsAdapter;
import com.example.mutlipleviewtypes.models.Ads;
import com.example.mutlipleviewtypes.models.Items;
import com.example.mutlipleviewtypes.models.News;
import com.example.mutlipleviewtypes.models.Trip;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Items> items;
    private TripsAdapter tripsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        items = new ArrayList<>();

        Trip trip1 = new Trip(R.drawable.nature1,"Croatia","Summer 2020 - 30 Days");
        items.add(new Items(0,trip1));

        Ads ads1 = new Ads("An advertisement (often shortened to advert or ad) is the promotion of a product, brand or service to a viewership in order to attract interest, engagement and sales. Advertisements come in many forms, from copy to interactive video, and have evolved to become a crucial feature of the app marketplace.","We Are the Top Service Provider");
        items.add(new Items(1,ads1));

        News news1 = new News("An advertisement (often shortened to advert or ad) is the promotion of a product, brand or service to a viewership in order to attract interest, engagement and sales. Advertisements come in many forms, from copy to interactive video, and have evolved to become a crucial feature of the app marketplace.","We Are the Top Service Provider");
        items.add(new Items(2,news1));

        Trip trip2 = new Trip(R.drawable.nature2,"Croatia","Summer 2020 - 30 Days");
        items.add(new Items(0,trip2));

        Ads ads2 = new Ads("An advertisement (often shortened to advert or ad) is the promotion of a product, brand or service to a viewership in order to attract interest, engagement and sales. Advertisements come in many forms, from copy to interactive video, and have evolved to become a crucial feature of the app marketplace.","We Are the Top Service Provider");
        items.add(new Items(1,ads2));

        News news2 = new News("An advertisement (often shortened to advert or ad) is the promotion of a product, brand or service to a viewership in order to attract interest, engagement and sales. Advertisements come in many forms, from copy to interactive video, and have evolved to become a crucial feature of the app marketplace.","We Are the Top Service Provider");
        items.add(new Items(2,news2));

        Trip trip3 = new Trip(R.drawable.nature3,"Croatia","Summer 2020 - 30 Days");
        items.add(new Items(0,trip3));

        Ads ads3 = new Ads("An advertisement (often shortened to advert or ad) is the promotion of a product, brand or service to a viewership in order to attract interest, engagement and sales. Advertisements come in many forms, from copy to interactive video, and have evolved to become a crucial feature of the app marketplace.","We Are the Top Service Provider");
        items.add(new Items(1,ads3));

        News news3 = new News("An advertisement (often shortened to advert or ad) is the promotion of a product, brand or service to a viewership in order to attract interest, engagement and sales. Advertisements come in many forms, from copy to interactive video, and have evolved to become a crucial feature of the app marketplace.","We Are the Top Service Provider");
        items.add(new Items(2,news3));

        Trip trip4 = new Trip(R.drawable.nature4,"Croatia","Summer 2020 - 30 Days");
        items.add(new Items(0,trip4));

        Ads ads4 = new Ads("An advertisement (often shortened to advert or ad) is the promotion of a product, brand or service to a viewership in order to attract interest, engagement and sales. Advertisements come in many forms, from copy to interactive video, and have evolved to become a crucial feature of the app marketplace.","We Are the Top Service Provider");
        items.add(new Items(1,ads4));

        News news4 = new News("An advertisement (often shortened to advert or ad) is the promotion of a product, brand or service to a viewership in order to attract interest, engagement and sales. Advertisements come in many forms, from copy to interactive video, and have evolved to become a crucial feature of the app marketplace.","We Are the Top Service Provider");
        items.add(new Items(2,news4));

        Trip trip5 = new Trip(R.drawable.nature5,"Croatia","Summer 2020 - 30 Days");
        items.add(new Items(0,trip5));

        Ads ads5 = new Ads("An advertisement (often shortened to advert or ad) is the promotion of a product, brand or service to a viewership in order to attract interest, engagement and sales. Advertisements come in many forms, from copy to interactive video, and have evolved to become a crucial feature of the app marketplace.","We Are the Top Service Provider");
        items.add(new Items(1,ads5));

        News news5 = new News("An advertisement (often shortened to advert or ad) is the promotion of a product, brand or service to a viewership in order to attract interest, engagement and sales. Advertisements come in many forms, from copy to interactive video, and have evolved to become a crucial feature of the app marketplace.","We Are the Top Service Provider");
        items.add(new Items(2,news5));

        tripsAdapter = new TripsAdapter(items);
        recyclerView.setAdapter(tripsAdapter);

    }
}