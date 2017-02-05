package com.tecnomaniacos.caodastro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Button;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;


public class formularioPais extends AppCompatActivity {
    TextView textView3;
    ImageView imageView2;
    EditText editText;
    TextView textView4;
    TextView textView5;
    TextView texView6;
    EditText editText3;
    EditText editText2;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_pais);
        textView3 = (TextView)  findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        texView6 =(TextView) findViewById(R.id.textView6);
        editText =(EditText) findViewById(R.id.editText);
        editText2 =(EditText) findViewById(R.id.editText2);
        editText3 =(EditText) findViewById(R.id.editText3);
        imageView2 =(ImageView)findViewById(R.id.imageView2);
        button5 =(Button) findViewById(R.id.button5);}

    public void button5 (View View) {
        if (editText.getText().toString().equals("Maria")) {
            editText2.getText().toString().equals("91111-1111");
            editText3.getText().toString().equals("11.111-111");
            setContentView(R.layout.content_perfildospais);
        }
        else { Toast.makeText(getApplicationContext(), "Campo Obrigatório", Toast.LENGTH_SHORT).show();{
        }





        }
    }
}



