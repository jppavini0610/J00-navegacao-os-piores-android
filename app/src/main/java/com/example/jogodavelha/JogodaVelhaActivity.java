package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class JogodaVelhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogoda_velha);

        try {
            this.getSupportActionBar().hide();
        }
        catch(NullPointerException e){}
    }

    //tested commit
//xx
}