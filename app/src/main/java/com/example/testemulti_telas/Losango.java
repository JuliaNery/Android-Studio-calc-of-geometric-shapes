package com.example.testemulti_telas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Losango extends AppCompatActivity {

    Button btnCalcLosan;
    EditText diag1;
    EditText diag2;
    TextView resultLosan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_losango);

        btnCalcLosan = (Button) findViewById(R.id.btnCalcLosan);
        diag1 = (EditText) findViewById(R.id.diag1);
        diag2 = (EditText) findViewById(R.id.diag2);
        resultLosan = (TextView) findViewById(R.id.resultLosan);

        btnCalcLosan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float diago1;
                float diago2;

                diago1 = Integer.parseInt(diag1.getText().toString());
                diago2 = Integer.parseInt(diag2.getText().toString());


                resultLosan.setText(String.valueOf((diago1*diago2)/2));
            }
        });



    }
}