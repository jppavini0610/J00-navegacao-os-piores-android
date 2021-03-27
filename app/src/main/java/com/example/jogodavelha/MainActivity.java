package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            this.getSupportActionBar().hide();
        }
        catch(NullPointerException e){}
        //teste commit


        Button botaoJogar = findViewById(R.id.botton_jogar);
        Button botaoCriarPartida = findViewById(R.id.button_criar);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, JogodaVelhaActivity.class));
            }
        });
//testes commit
        botaoCriarPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutActivity.class ));
            }
        });
    }
        protected void onRestart (){
            super.onRestart();
            System.out.println("onRestart");
        }

        @Override
        protected void onPause () {
            super.onPause();
            System.out.println("onPause");
        }

        @Override
        protected void onDestroy () {
            super.onDestroy();
            System.out.println("onDestroy");
        }
}