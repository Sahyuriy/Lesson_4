package com.example.sah.les_4;


import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;



public class MainActivity extends MainMenu {

    private String[] place = {"1-е ", "2-е ", "3-е ", "4-е ", "5-е ", "6-е ", "7-е "};
    private String[] name = {" Ринат Ахметов",
            " Игорь Коломойский",
            " Геннадий Боголюбов",
            " Виктор Пинчук",
            " Юрий Косюк",
            " Петр Порошенко",
            " Алексей Вадатурский"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.Adapter mAdapter;
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        mAdapter = new MyAdapter(place, name);
        mRecyclerView.setAdapter(mAdapter);


    }


}