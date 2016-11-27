package com.example.sah.les_4;


import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SecondActivity extends MainMenu {

    Animation animation1;
    Animation animation2;
    Animation animation3;
    Animation animation4;

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView1 = (ImageView) findViewById(R.id.img1);
        imageView2 = (ImageView) findViewById(R.id.img2);
        imageView3 = (ImageView) findViewById(R.id.img3);
        imageView4 = (ImageView) findViewById(R.id.img4);

        animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        animation3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
        animation4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);


        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.startAnimation(animation1);
            }
        });


        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2.startAnimation(animation2);
            }
        });


        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView3.startAnimation(animation3);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView4.startAnimation(animation4);
            }
        });

    }


}
