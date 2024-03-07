package com.example.testemulti_telas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Triangulo extends AppCompatActivity {

    Button btnCalcTriang;
    EditText alturaTriang;
    EditText baseTriang;
    TextView resultTriang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        btnCalcTriang = (Button) findViewById(R.id.btnCalcTrinag);
        alturaTriang = (EditText) findViewById(R.id.alturaTriang);
        baseTriang = (EditText) findViewById(R.id.baseTring);
        resultTriang = (TextView) findViewById(R.id.resultTriang);

        btnCalcTriang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float base = Integer.parseInt(baseTriang.getText().toString());
                float altura = Integer.parseInt(alturaTriang.getText().toString());

                resultTriang.setText(String.valueOf((base * altura)/2));


            }
        });


    }
}