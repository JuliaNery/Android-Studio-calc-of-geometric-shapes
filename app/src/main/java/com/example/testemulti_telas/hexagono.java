package com.example.testemulti_telas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hexagono extends AppCompatActivity {
    Button btnCalcHex;
    EditText baseHex;
    EditText alturaHex;
    TextView resultHex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexagono);

        btnCalcHex = (Button) findViewById(R.id.btnCalcHex);
        baseHex = (EditText) findViewById(R.id.baseHex);
        alturaHex = (EditText) findViewById(R.id.alturaHex);
        resultHex = (TextView) findViewById(R.id.resultHex);

        btnCalcHex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float base = Integer.parseInt(baseHex.getText().toString());
                float altura = Integer.parseInt(alturaHex.getText().toString());
                float result;

                result = ((6*base)*altura)/2;
                resultHex.setText(String.valueOf(result));
            }
        });

    }
}