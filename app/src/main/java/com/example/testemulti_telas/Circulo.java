package com.example.testemulti_telas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Circulo extends AppCompatActivity {

    EditText raio;
    Button btnCalcCirc;
    TextView resultCirc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        btnCalcCirc = (Button) findViewById(R.id.btnCalcCirc);
        raio = (EditText) findViewById(R.id.raio);
        resultCirc = (TextView) findViewById(R.id.resultCirc);

        btnCalcCirc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float r = Float.parseFloat(raio.getText().toString());

                resultCirc.setText(String.valueOf(3.14*(r*r)));
            }
        });
    }
}