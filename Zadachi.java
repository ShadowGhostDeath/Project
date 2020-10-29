package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class Zadachi extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zadachi);
        Button buttonZ = (Button)findViewById(R.id.button7);
        buttonZ.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Intent intentZ;
        intentZ = new Intent(this, MainActivity2.class);
        startActivity(intentZ);
    }
}