package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText e1 = (EditText) findViewById(R.id.nomb);
        EditText e2 = (EditText) findViewById(R.id.cel);
        EditText e3 = (EditText) findViewById(R.id.mail);
        EditText e4 = (EditText) findViewById(R.id.pass);
        EditText e5 = (EditText) findViewById(R.id.men);


        Button b =(Button) findViewById(R.id.bt1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                e3.setText("");
                e4.setText("");
                e5.setText("");

                Toast.makeText(getApplicationContext(),"Mensaje Enviado",Toast.LENGTH_LONG).show();

            }
        });
    }
}