package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class Risunki extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_risunki);
        Button buttonR = (Button)findViewById(R.id.button8);
        buttonR.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Intent intentR;
        intentR = new Intent(this, MainActivity2.class);
        startActivity(intentR);
    }
}