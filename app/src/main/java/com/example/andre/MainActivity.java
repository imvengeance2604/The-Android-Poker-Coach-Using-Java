package com.example.andre;

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

        Button ci=(Button)findViewById(R.id.ci);
        ci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencreatinf();
            }
        });
        Button ins=(Button)findViewById(R.id.bm);
        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinstr();
            }
        });
        Button ap=(Button)findViewById(R.id.am);
        ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openap();
            }
        });
        Button sp=(Button)findViewById(R.id.sp);

        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openstrtprac();
            }
        });



    }
    public void openstrtprac()
    {Intent intent=new Intent(this,strtprac.class);
        startActivity(intent);}
    public void opencreatinf()
    {Intent intent=new Intent(this,creatinf.class);
        startActivity(intent);}
    public void openinstr()
    {Intent intent=new Intent(this,instr.class);
        startActivity(intent);}
    public void openap()
    {Intent intent=new Intent(this,abtpoker.class);
        startActivity(intent);}
}