package com.tecnomaniacos.caodastro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import static com.tecnomaniacos.caodastro.R.*;
import static com.tecnomaniacos.caodastro.R.id.button;

public class activity2 extends AppCompatActivity {
    public RelativeLayout relativeLayout;
    ImageView  imageView3;
    ImageView  imagemcrianca;
    Button     Buttoncriancas;
    Button     Buttoncaes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.content_activity2);
        imageView3= (ImageView) findViewById(R.id.imageView);
        relativeLayout = (RelativeLayout) findViewById(R.id.content_activity2);
        imagemcrianca= (ImageView) findViewById(id.imageView2);
        Buttoncaes = (Button) findViewById(R.id.button3);
        Buttoncriancas= (Button) findViewById(R.id.button4);
        Buttoncriancas = (Button) findViewById(R.id.button4);
        Buttoncriancas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity2.this,formularioPais .class);
                startActivity(intent);


                Buttoncaes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    Intent intent = new Intent(activity2.this,formularioOng .class);
                        startActivity(intent);

            }
        });}});}}


