package com.example.testemulti_telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuOptions extends AppCompatActivity {

    Button btnRetangulo;
    Button btnQuadrado;
    Button btnCirculo;
    Button btnTriangulo;
    Button btnLosango;
    Button btnHexagono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_options);

        btnRetangulo = (Button) findViewById(R.id.btnRetangulo);
        btnQuadrado = (Button) findViewById(R.id.btnQuadrado);
        btnCirculo = (Button) findViewById(R.id.btnCirculo);
        btnTriangulo = (Button) findViewById(R.id.btnTriangulo);
        btnLosango = (Button) findViewById(R.id.btnLosango);
        btnHexagono = (Button) findViewById(R.id.btnHexagono);

        btnRetangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CHAMAR TELA COM INTENT

                Intent tela = new Intent(menuOptions.this,Retangulo.class);

                //CHAMADA DE TELA
                startActivity(tela);
            }
        });

        btnQuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CHAMAR TELA COM INTENT

                Intent tela = new Intent(menuOptions.this,Quadrado.class);

                //CHAMADA DE TELA
                startActivity(tela);

            }
        });

        btnCirculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CHAMAR TELA COM INTENT

                Intent tela = new Intent(menuOptions.this,Circulo.class);

                //CHAMADA DE TELA
                startActivity(tela);
            }
        });

        btnTriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CHAMAR TELA COM INTENT

                Intent tela = new Intent(menuOptions.this,Triangulo.class);

                //CHAMADA DE TELA
                startActivity(tela);
            }
        });

        btnLosango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CHAMAR TELA COM INTENT

                Intent tela = new Intent(menuOptions.this,Losango.class);

                //CHAMADA DE TELA
                startActivity(tela);
            }
        });

        btnHexagono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CHAMAR TELA COM INTENT

                Intent tela = new Intent(menuOptions.this,hexagono.class);

                //CHAMADA DE TELA
                startActivity(tela);
            }
        });
    }
}