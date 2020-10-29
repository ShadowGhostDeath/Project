package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this::onClick);
        Button buttonRis = (Button)findViewById(R.id.button3);
        buttonRis.setOnClickListener(this::onClick1);
        Button buttonOb = (Button)findViewById(R.id.button4);
        buttonOb.setOnClickListener(this::onClick2);
        Button buttonZadac = (Button)findViewById(R.id.button5);
        buttonZadac.setOnClickListener(this::onClick3);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClick1(View view){
        Intent intent1;
        intent1 = new Intent(this, Risunki.class);
        startActivity(intent1);
    }

    public void onClick2(View view){
        Intent intent2;
        intent2 = new Intent(this, Oborudovanie.class);
        startActivity(intent2);
    }

    public void onClick3(View view){
        Intent intent3;
        intent3 = new Intent(this, Zadachi.class);
        startActivity(intent3);
    }
}