package com.example.testemulti_telas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Retangulo extends AppCompatActivity {
    Button btnCalc;
    EditText baseRet;
    EditText alturaRet;
    TextView resultRet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retangulo);
        baseRet = findViewById(R.id.baseRet);
        alturaRet = findViewById(R.id.alturaRet);
        resultRet = findViewById(R.id.resultRet);
        btnCalc = (Button) findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float base = Integer.parseInt(baseRet.getText().toString());
                float altura = Integer.parseInt(alturaRet.getText().toString());

                if (base==altura){
                    AlertDialog.Builder mensagem = new AlertDialog.Builder(Retangulo.this);
                    mensagem.setTitle("Erro");
                    mensagem.setMessage("As medidas passadas não caracterizam um Retangulo");
                    mensagem.setNeutralButton("fechar", null);
                    mensagem.show();
                }else{
                    resultRet.setText(String.valueOf(base * altura));
                }

            }
        });


    }



    }