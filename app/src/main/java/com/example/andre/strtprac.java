package com.example.andre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class strtprac extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strtprac);
        Button bm = (Button) findViewById(R.id.bm);
        Button am = (Button) findViewById(R.id.am);
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbm();
            }
        });
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openam();
            }
        });

    }
    public void openbm()
    {
        Intent intent=new Intent(this,begnr.class);
        startActivity(intent);}
    public void openam()
    {
        Intent intent=new Intent(this,advcd.class);
        startActivity(intent);}
}