package com.tecnomaniacos.caodastro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Button;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;



public class activityentrar extends AppCompatActivity {
    Button Cancelar;
    Button Confirmar;

    EditText email;
    EditText senha;
    LinearLayout linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityentrar);
        Confirmar = (Button) findViewById(R.id.Confirmar);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        Cancelar = (Button) findViewById(R.id.Cancelar);
        email = (EditText) findViewById(R.id.email);
        senha = (EditText) findViewById (R.id.senha);



    }


    }



