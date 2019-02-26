package com.example.kamilazoldyek.ui_list_cards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<Item>mList = new ArrayList<>();
        mList.add(new Item("Anna", R.drawable.bg_3, R.drawable.profile_f1, 15 ));
        mList.add(new Item("Clara", R.drawable.bg_9, R.drawable.profile_f2, 12 ));
        mList.add(new Item("Regina", R.drawable.bg_5, R.drawable.profile_f3, 45 ));
        mList.add(new Item("Clarice", R.drawable.bg_6, R.drawable.profile_f4, 7 ));
        mList.add(new Item("Jonathan", R.drawable.bg_7, R.drawable.profile_m10, 9 ));
        mList.add(new Item("Henry", R.drawable.bg_8, R.drawable.profile_m6, 47 ));
        mList.add(new Item("April", R.drawable.bg_9, R.drawable.profile_f5, 89 ));
        mList.add(new Item("Luanna", R.drawable.bg_4, R.drawable.profile_f7, 12 ));
        mList.add(new Item("Julien", R.drawable.bg_3, R.drawable.profile_m11, 78 ));
        mList.add(new Item("Mark", R.drawable.bg_5, R.drawable.profile_m12, 63 ));
        mList.add(new Item("Karen", R.drawable.bg_6, R.drawable.profile_f_8, 88 ));
        mList.add(new Item("Lisa", R.drawable.bg_7, R.drawable.profile_f9, 76 ));
        mList.add(new Item("Johanne", R.drawable.bg_8, R.drawable.profile_f13, 17 ));

        Adapter adapter = new Adapter(this, mList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));






    }



}
