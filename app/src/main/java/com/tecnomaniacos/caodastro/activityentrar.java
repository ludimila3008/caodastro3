package com.tecnomaniacos.caodastro;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.Toolbar;





public class activityentrar extends AppCompatActivity {
    Button Confirmar;
    EditText email;
    EditText senha;
    LinearLayout linearLayout;
    RelativeLayout relativeLayout;
    Toolbar toolbar;
    FloatingActionButton floatingActionButton;


    @Overrid
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityentrar);
        Confirmar = (Button) findViewById(R.id.Confirmar);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        email = (EditText) findViewById(R.id.email);
        senha = (EditText) findViewById (R.id.senha);
        toolbar= (Toolbar) findViewById(R.id.toolbar);

        floatingActionButton= (FloatingActionButton) findViewById(R.id.floatingActionButton2);

        floatingActionButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View View) {
                Intent intent = new Intent(activityentrar.this,MainActivity1 .class);}


            public void Confirmar (View View) {
                if(email.getText().toString().equals("ONGABPA@gmail.com")) {
                    senha.getText().toString().equals(1234);
                    setContentView(R.layout.activity_perfilda_ong);
                }
                else {
                        Toast.makeText(getApplicationContext(), "Usuário ou senha errados", Toast.LENGTH_SHORT).show();}

            };
            ;;});}}















