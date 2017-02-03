package com.tecnomaniacos.caodastro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ImageView;

import static com.tecnomaniacos.caodastro.R.id.button;
import static com.tecnomaniacos.caodastro.R.id.button1;


public class MainActivity1 extends AppCompatActivity{

    public RelativeLayout relativeLayout;
    ImageView caodastro2;
    Button button1;
    Button button2;


    @Overrid
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        caodastro2 = (ImageView) findViewById(R.id.imageView);
        relativeLayout = (RelativeLayout) findViewById(R.id.content_main1);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity1.this, activity2.class);
                startActivity(intent);


                button1 = (Button) findViewById(R.id.button1);
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity1.this,activityentrar .class);
                        startActivity(intent);


                }}); }});}}