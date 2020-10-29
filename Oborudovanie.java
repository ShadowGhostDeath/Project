package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class Oborudovanie extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oborudovanie);
        Button buttonO = (Button)findViewById(R.id.button6);
        buttonO.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Intent intentO;
        intentO = new Intent(this, MainActivity2.class);
        startActivity(intentO);
    }
}