package com.tecnomaniacos.caodastro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class perfildospais extends AppCompatActivity {
    Toolbar toolbarperfilpais;
    TextView textViewnumerotelefone;
    TextView textViewcep;
    TextView textViewnumerocep;
    Button cadastrocrianças;
    ImageView imageView4;
    TextView textViewnome;
    TextView textViewtelefone;
    ImageView imageViewautismo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfildospais);
        textViewnumerotelefone= (TextView) findViewById(R.id.textViewnumerotelefone);
        textViewcep=(TextView)findViewById(R.id.textViewcep);
        textViewnumerocep=(TextView)findViewById(R.id.textViewnumerocep);
        textViewtelefone=(TextView)findViewById(R.id.textViewtelefone);
        textViewnome=(TextView)findViewById(R.id.textViewnome);
        cadastrocrianças=(Button)findViewById(R.id.buttoncadastrocrianças);
        imageViewautismo=(ImageView)findViewById(R.id.imageViewautismo);
        toolbarperfilpais=(Toolbar)findViewById(R.id.toolbarperfilpais);
        imageView4=(ImageView)findViewById(R.id.imageView4);





    }}
