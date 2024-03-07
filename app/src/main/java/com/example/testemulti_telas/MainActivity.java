package com.example.testemulti_telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnter = (Button) findViewById(R.id.btnEnter);

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //chamar outra tela
                //usar intent

                Intent tela = new Intent(MainActivity.this,menuOptions.class);

                //CHAMADA DE TELA
                startActivity(tela);

            }
        });
    }
}