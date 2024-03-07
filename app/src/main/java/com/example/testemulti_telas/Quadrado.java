package com.example.testemulti_telas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Quadrado extends AppCompatActivity {

    Button btnCalcSquare;
    EditText baseSquare;
    EditText alturaSquare;
    TextView resultSquare;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadrado);

        btnCalcSquare = (Button) findViewById(R.id.btnCalcSquare);
        baseSquare = (EditText) findViewById(R.id.baseSquare);
        alturaSquare = (EditText) findViewById(R.id.alturaSquare);
        resultSquare = (TextView) findViewById(R.id.resultSquare);


        btnCalcSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float base = Integer.parseInt(baseSquare.getText().toString());
                float altura = Integer.parseInt(alturaSquare.getText().toString());

                if (base==altura){
                    resultSquare.setText(String.valueOf(base * altura));
                }else{

                    AlertDialog.Builder mensagem = new AlertDialog.Builder(Quadrado.this);
                    mensagem.setTitle("Erro");
                    mensagem.setMessage("As medidas passadas não caracterizam um quadrado");
                    mensagem.setNeutralButton("fechar", null);
                    mensagem.show();
                    //error.setText(String.valueOf("As medidas passadas não caracterizam um quadrado"));
                }




            }
        });
    }
}