package com.pallefire.b_34glidelibraryexam1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    //f19513751c28f88e2bb99b92a9a07807

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= (ImageView) findViewById(R.id.image1);
        Glide.with(this).load("https://en.wikipedia.org/wiki/Flag_of_India#/media/File:Flag_of_India.svg").
            //here the below line is extra it shows bydefault this images untill the image downloade from the server
                   placeholder(R.mipmap.ic_launcher).crossFade().
                into(imageView);
    }
}
