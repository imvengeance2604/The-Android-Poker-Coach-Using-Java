package com.example.andre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class advcd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advcd);
        String crds[]={"ca","c2","c3","c4","c5","c6","c7","c8","c9","ct","cj","cq","ck",
                "da","d2","d3","d4","d5","d6","d7","d8","d9","dt","dj","dq","dk",
                "ha","h2","h3","h4","h5","h6","h7","h8","h9","ht","hj","hq","hk",
                "sa","s2","s3","s4","s5","s6","s7","s8","s9","st","sj","sq","sk"};
        Random rand = new Random();
        ImageView i1=(ImageView) findViewById(R.id.i1);
        ImageView i2=(ImageView) findViewById(R.id.i2);
        ImageView i3=(ImageView) findViewById(R.id.i3);
        ImageView i4=(ImageView) findViewById(R.id.i4);
        ImageView i5=(ImageView) findViewById(R.id.i5);
        ImageView i6=(ImageView) findViewById(R.id.i6);
        ImageView i7=(ImageView) findViewById(R.id.i7);
        ImageView i8=(ImageView) findViewById(R.id.i8);
        ImageView i9=(ImageView) findViewById(R.id.i9);
        ImageView i10=(ImageView) findViewById(R.id.i10);
        ImageView h1=(ImageView) findViewById(R.id.h1);
        ImageView h2=(ImageView) findViewById(R.id.h2);
        ImageView h3=(ImageView) findViewById(R.id.h3);
        ImageView h4=(ImageView) findViewById(R.id.h4);
        ImageView h5=(ImageView) findViewById(R.id.h5);
        Random randNum = new Random();
        Set<Integer> s = new LinkedHashSet<Integer>();
        while (s.size() <= 14) {
            s.add(randNum.nextInt(51)+1);
        }
        List<Integer> list = new ArrayList<Integer>(s);

        int x,x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,x15;
        x1 = list.get(0);
        x2 = list.get(1);
        x3 = list.get(2);
        x4 = list.get(3);
        x5 = list.get(4);
        x6 = list.get(5);
        x7 = list.get(6);
        x8 = list.get(7);
        x9 = list.get(8);
        x10 = list.get(9);
        x11 = list.get(10);
        x12 = list.get(11);
        x13 = list.get(12);
        x14 = list.get(13);
        x15 = list.get(14);

        x = x1;
        i1.setTranslationX(-500);
        if(x1==12)
        {i1.setImageResource(R.drawable.ca);}
        else if(x1==0)
        {i1.setImageResource(R.drawable.c2);}
        else if(x1==1)
        {i1.setImageResource(R.drawable.c3);}
        else if(x1==2)
        {i1.setImageResource(R.drawable.c4);}
        else if(x1==3)
        {i1.setImageResource(R.drawable.c5);}
        else if(x1==4)
        {i1.setImageResource(R.drawable.c6);}
        else if(x1==5)
        {i1.setImageResource(R.drawable.c7);}
        else if(x1==6)
        {i1.setImageResource(R.drawable.c8);}
        else if(x1==7)
        {i1.setImageResource(R.drawable.c9);}
        else if(x1==8)
        {i1.setImageResource(R.drawable.ct);}
        else if(x1==9)
        {i1.setImageResource(R.drawable.cj);}
        else if(x1==10)
        {i1.setImageResource(R.drawable.cq);}
        else if(x1==11)
        {i1.setImageResource(R.drawable.ck);}
        else if(x1==25)
        {i1.setImageResource(R.drawable.da);}
        else if(x1==13)
        {i1.setImageResource(R.drawable.d2);}
        else if(x1==14)
        {i1.setImageResource(R.drawable.d3);}
        else if(x1==15)
        {i1.setImageResource(R.drawable.d4);}
        else if(x1==16)
        {i1.setImageResource(R.drawable.d5);}
        else if(x1==17)
        {i1.setImageResource(R.drawable.d6);}
        else if(x1==18)
        {i1.setImageResource(R.drawable.d7);}
        else if(x1==19)
        {i1.setImageResource(R.drawable.d8);}
        else if(x1==20)
        {i1.setImageResource(R.drawable.d9);}
        else if(x1==21)
        {i1.setImageResource(R.drawable.dt);}
        else if(x1==22)
        {i1.setImageResource(R.drawable.dj);}
        else if(x1==23)
        {i1.setImageResource(R.drawable.dq);}
        else if(x1==24)
        {i1.setImageResource(R.drawable.dk);}
        else if(x1==38)
        {i1.setImageResource(R.drawable.ha);}
        else if(x1==26)
        {i1.setImageResource(R.drawable.h2);}
        else if(x1==27)
        {i1.setImageResource(R.drawable.h3);}
        else if(x1==28)
        {i1.setImageResource(R.drawable.h4);}
        else if(x1==29)
        {i1.setImageResource(R.drawable.h5);}
        else if(x1==30)
        {i1.setImageResource(R.drawable.h6);}
        else if(x1==31)
        {i1.setImageResource(R.drawable.h7);}
        else if(x1==32)
        {i1.setImageResource(R.drawable.h8);}
        else if(x1==33)
        {i1.setImageResource(R.drawable.h9);}
        else if(x1==34)
        {i1.setImageResource(R.drawable.ht);}
        else if(x1==35)
        {i1.setImageResource(R.drawable.hj);}
        else if(x1==36)
        {i1.setImageResource(R.drawable.hq);}
        else if(x1==37)
        {i1.setImageResource(R.drawable.hk);}
        else if(x1==51)
        {i1.setImageResource(R.drawable.sa);}
        else if(x1==39)
        {i1.setImageResource(R.drawable.s2);}
        else if(x1==40)
        {i1.setImageResource(R.drawable.s3);}
        else if(x1==41)
        {i1.setImageResource(R.drawable.s4);}
        else if(x1==42)
        {i1.setImageResource(R.drawable.s5);}
        else if(x1==43)
        {i1.setImageResource(R.drawable.s6);}
        else if(x1==44)
        {i1.setImageResource(R.drawable.s7);}
        else if(x1==45)
        {i1.setImageResource(R.drawable.s8);}
        else if(x1==46)
        {i1.setImageResource(R.drawable.s9);}
        else if(x1==47)
        {i1.setImageResource(R.drawable.st);}
        else if(x1==48)
        {i1.setImageResource(R.drawable.sj);}
        else if(x1==49)
        {i1.setImageResource(R.drawable.sq);}
        else if(x1==50)
        {i1.setImageResource(R.drawable.sk);}

        i1.animate().translationXBy(500).setDuration(100);



        x1=x2;
        i2.setTranslationX(-500);
        if(x1==12)
        {i2.setImageResource(R.drawable.ca);}
        else if(x1==0)
        {i2.setImageResource(R.drawable.c2);}
        else if(x1==1)
        {i2.setImageResource(R.drawable.c3);}
        else if(x1==2)
        {i2.setImageResource(R.drawable.c4);}
        else if(x1==3)
        {i2.setImageResource(R.drawable.c5);}
        else if(x1==4)
        {i2.setImageResource(R.drawable.c6);}
        else if(x1==5)
        {i2.setImageResource(R.drawable.c7);}
        else if(x1==6)
        {i2.setImageResource(R.drawable.c8);}
        else if(x1==7)
        {i2.setImageResource(R.drawable.c9);}
        else if(x1==8)
        {i2.setImageResource(R.drawable.ct);}
        else if(x1==9)
        {i2.setImageResource(R.drawable.cj);}
        else if(x1==10)
        {i2.setImageResource(R.drawable.cq);}
        else if(x1==11)
        {i2.setImageResource(R.drawable.ck);}
        else if(x1==25)
        {i2.setImageResource(R.drawable.da);}
        else if(x1==13)
        {i2.setImageResource(R.drawable.d2);}
        else if(x1==14)
        {i2.setImageResource(R.drawable.d3);}
        else if(x1==15)
        {i2.setImageResource(R.drawable.d4);}
        else if(x1==16)
        {i2.setImageResource(R.drawable.d5);}
        else if(x1==17)
        {i2.setImageResource(R.drawable.d6);}
        else if(x1==18)
        {i2.setImageResource(R.drawable.d7);}
        else if(x1==19)
        {i2.setImageResource(R.drawable.d8);}
        else if(x1==20)
        {i2.setImageResource(R.drawable.d9);}
        else if(x1==21)
        {i2.setImageResource(R.drawable.dt);}
        else if(x1==22)
        {i2.setImageResource(R.drawable.dj);}
        else if(x1==23)
        {i2.setImageResource(R.drawable.dq);}
        else if(x1==24)
        {i2.setImageResource(R.drawable.dk);}
        else if(x1==38)
        {i2.setImageResource(R.drawable.ha);}
        else if(x1==26)
        {i2.setImageResource(R.drawable.h2);}
        else if(x1==27)
        {i2.setImageResource(R.drawable.h3);}
        else if(x1==28)
        {i2.setImageResource(R.drawable.h4);}
        else if(x1==29)
        {i2.setImageResource(R.drawable.h5);}
        else if(x1==30)
        {i2.setImageResource(R.drawable.h6);}
        else if(x1==31)
        {i2.setImageResource(R.drawable.h7);}
        else if(x1==32)
        {i2.setImageResource(R.drawable.h8);}
        else if(x1==33)
        {i2.setImageResource(R.drawable.h9);}
        else if(x1==34)
        {i2.setImageResource(R.drawable.ht);}
        else if(x1==35)
        {i2.setImageResource(R.drawable.hj);}
        else if(x1==36)
        {i2.setImageResource(R.drawable.hq);}
        else if(x1==37)
        {i2.setImageResource(R.drawable.hk);}
        else if(x1==51)
        {i2.setImageResource(R.drawable.sa);}
        else if(x1==39)
        {i2.setImageResource(R.drawable.s2);}
        else if(x1==40)
        {i2.setImageResource(R.drawable.s3);}
        else if(x1==41)
        {i2.setImageResource(R.drawable.s4);}
        else if(x1==42)
        {i2.setImageResource(R.drawable.s5);}
        else if(x1==43)
        {i2.setImageResource(R.drawable.s6);}
        else if(x1==44)
        {i2.setImageResource(R.drawable.s7);}
        else if(x1==45)
        {i2.setImageResource(R.drawable.s8);}
        else if(x1==46)
        {i2.setImageResource(R.drawable.s9);}
        else if(x1==47)
        {i2.setImageResource(R.drawable.st);}
        else if(x1==48)
        {i2.setImageResource(R.drawable.sj);}
        else if(x1==49)
        {i2.setImageResource(R.drawable.sq);}
        else if(x1==50)
        {i2.setImageResource(R.drawable.sk);}

        i2.animate().translationXBy(500).setDuration(200);

        x1=x3;
        i3.setTranslationY(-1000);
        if(x1==12)
        {i3.setImageResource(R.drawable.ca);}
        else if(x1==0)
        {i3.setImageResource(R.drawable.c2);}
        else if(x1==1)
        {i3.setImageResource(R.drawable.c3);}
        else if(x1==2)
        {i3.setImageResource(R.drawable.c4);}
        else if(x1==3)
        {i3.setImageResource(R.drawable.c5);}
        else if(x1==4)
        {i3.setImageResource(R.drawable.c6);}
        else if(x1==5)
        {i3.setImageResource(R.drawable.c7);}
        else if(x1==6)
        {i3.setImageResource(R.drawable.c8);}
        else if(x1==7)
        {i3.setImageResource(R.drawable.c9);}
        else if(x1==8)
        {i3.setImageResource(R.drawable.ct);}
        else if(x1==9)
        {i3.setImageResource(R.drawable.cj);}
        else if(x1==10)
        {i3.setImageResource(R.drawable.cq);}
        else if(x1==11)
        {i3.setImageResource(R.drawable.ck);}
        else if(x1==25)
        {i3.setImageResource(R.drawable.da);}
        else if(x1==13)
        {i3.setImageResource(R.drawable.d2);}
        else if(x1==14)
        {i3.setImageResource(R.drawable.d3);}
        else if(x1==15)
        {i3.setImageResource(R.drawable.d4);}
        else if(x1==16)
        {i3.setImageResource(R.drawable.d5);}
        else if(x1==17)
        {i3.setImageResource(R.drawable.d6);}
        else if(x1==18)
        {i3.setImageResource(R.drawable.d7);}
        else if(x1==19)
        {i3.setImageResource(R.drawable.d8);}
        else if(x1==20)
        {i3.setImageResource(R.drawable.d9);}
        else if(x1==21)
        {i3.setImageResource(R.drawable.dt);}
        else if(x1==22)
        {i3.setImageResource(R.drawable.dj);}
        else if(x1==23)
        {i3.setImageResource(R.drawable.dq);}
        else if(x1==24)
        {i3.setImageResource(R.drawable.dk);}
        else if(x1==38)
        {i3.setImageResource(R.drawable.ha);}
        else if(x1==26)
        {i3.setImageResource(R.drawable.h2);}
        else if(x1==27)
        {i3.setImageResource(R.drawable.h3);}
        else if(x1==28)
        {i3.setImageResource(R.drawable.h4);}
        else if(x1==29)
        {i3.setImageResource(R.drawable.h5);}
        else if(x1==30)
        {i3.setImageResource(R.drawable.h6);}
        else if(x1==31)
        {i3.setImageResource(R.drawable.h7);}
        else if(x1==32)
        {i3.setImageResource(R.drawable.h8);}
        else if(x1==33)
        {i3.setImageResource(R.drawable.h9);}
        else if(x1==34)
        {i3.setImageResource(R.drawable.ht);}
        else if(x1==35)
        {i3.setImageResource(R.drawable.hj);}
        else if(x1==36)
        {i3.setImageResource(R.drawable.hq);}
        else if(x1==37)
        {i3.setImageResource(R.drawable.hk);}
        else if(x1==51)
        {i3.setImageResource(R.drawable.sa);}
        else if(x1==39)
        {i3.setImageResource(R.drawable.s2);}
        else if(x1==40)
        {i3.setImageResource(R.drawable.s3);}
        else if(x1==41)
        {i3.setImageResource(R.drawable.s4);}
        else if(x1==42)
        {i3.setImageResource(R.drawable.s5);}
        else if(x1==43)
        {i3.setImageResource(R.drawable.s6);}
        else if(x1==44)
        {i3.setImageResource(R.drawable.s7);}
        else if(x1==45)
        {i3.setImageResource(R.drawable.s8);}
        else if(x1==46)
        {i3.setImageResource(R.drawable.s9);}
        else if(x1==47)
        {i3.setImageResource(R.drawable.st);}
        else if(x1==48)
        {i3.setImageResource(R.drawable.sj);}
        else if(x1==49)
        {i3.setImageResource(R.drawable.sq);}
        else if(x1==50)
        {i3.setImageResource(R.drawable.sk);}

        i3.animate().translationYBy(1000).setDuration(300);

        x1=x4;

        i4.setTranslationY(-1000);
        if(x1==12)
        {i4.setImageResource(R.drawable.ca);}
        else if(x1==0)
        {i4.setImageResource(R.drawable.c2);}
        else if(x1==1)
        {i4.setImageResource(R.drawable.c3);}
        else if(x1==2)
        {i4.setImageResource(R.drawable.c4);}
        else if(x1==3)
        {i4.setImageResource(R.drawable.c5);}
        else if(x1==4)
        {i4.setImageResource(R.drawable.c6);}
        else if(x1==5)
        {i4.setImageResource(R.drawable.c7);}
        else if(x1==6)
        {i4.setImageResource(R.drawable.c8);}
        else if(x1==7)
        {i4.setImageResource(R.drawable.c9);}
        else if(x1==8)
        {i4.setImageResource(R.drawable.ct);}
        else if(x1==9)
        {i4.setImageResource(R.drawable.cj);}
        else if(x1==10)
        {i4.setImageResource(R.drawable.cq);}
        else if(x1==11)
        {i4.setImageResource(R.drawable.ck);}
        else if(x1==25)
        {i4.setImageResource(R.drawable.da);}
        else if(x1==13)
        {i4.setImageResource(R.drawable.d2);}
        else if(x1==14)
        {i4.setImageResource(R.drawable.d3);}
        else if(x1==15)
        {i4.setImageResource(R.drawable.d4);}
        else if(x1==16)
        {i4.setImageResource(R.drawable.d5);}
        else if(x1==17)
        {i4.setImageResource(R.drawable.d6);}
        else if(x1==18)
        {i4.setImageResource(R.drawable.d7);}
        else if(x1==19)
        {i4.setImageResource(R.drawable.d8);}
        else if(x1==20)
        {i4.setImageResource(R.drawable.d9);}
        else if(x1==21)
        {i4.setImageResource(R.drawable.dt);}
        else if(x1==22)
        {i4.setImageResource(R.drawable.dj);}
        else if(x1==23)
        {i4.setImageResource(R.drawable.dq);}
        else if(x1==24)
        {i4.setImageResource(R.drawable.dk);}
        else if(x1==38)
        {i4.setImageResource(R.drawable.ha);}
        else if(x1==26)
        {i4.setImageResource(R.drawable.h2);}
        else if(x1==27)
        {i4.setImageResource(R.drawable.h3);}
        else if(x1==28)
        {i4.setImageResource(R.drawable.h4);}
        else if(x1==29)
        {i4.setImageResource(R.drawable.h5);}
        else if(x1==30)
        {i4.setImageResource(R.drawable.h6);}
        else if(x1==31)
        {i4.setImageResource(R.drawable.h7);}
        else if(x1==32)
        {i4.setImageResource(R.drawable.h8);}
        else if(x1==33)
        {i4.setImageResource(R.drawable.h9);}
        else if(x1==34)
        {i4.setImageResource(R.drawable.ht);}
        else if(x1==35)
        {i4.setImageResource(R.drawable.hj);}
        else if(x1==36)
        {i4.setImageResource(R.drawable.hq);}
        else if(x1==37)
        {i4.setImageResource(R.drawable.hk);}
        else if(x1==51)
        {i4.setImageResource(R.drawable.sa);}
        else if(x1==39)
        {i4.setImageResource(R.drawable.s2);}
        else if(x1==40)
        {i4.setImageResource(R.drawable.s3);}
        else if(x1==41)
        {i4.setImageResource(R.drawable.s4);}
        else if(x1==42)
        {i4.setImageResource(R.drawable.s5);}
        else if(x1==43)
        {i4.setImageResource(R.drawable.s6);}
        else if(x1==44)
        {i4.setImageResource(R.drawable.s7);}
        else if(x1==45)
        {i4.setImageResource(R.drawable.s8);}
        else if(x1==46)
        {i4.setImageResource(R.drawable.s9);}
        else if(x1==47)
        {i4.setImageResource(R.drawable.st);}
        else if(x1==48)
        {i4.setImageResource(R.drawable.sj);}
        else if(x1==49)
        {i4.setImageResource(R.drawable.sq);}
        else if(x1==50)
        {i4.setImageResource(R.drawable.sk);}

        i4.animate().translationYBy(1000).setDuration(400);

        x1=x5;

        i5.setTranslationY(-1000);
        if(x1==12)
        {i5.setImageResource(R.drawable.ca);}
        else if(x1==0)
        {i5.setImageResource(R.drawable.c2);}
        else if(x1==1)
        {i5.setImageResource(R.drawable.c3);}
        else if(x1==2)
        {i5.setImageResource(R.drawable.c4);}
        else if(x1==3)
        {i5.setImageResource(R.drawable.c5);}
        else if(x1==4)
        {i5.setImageResource(R.drawable.c6);}
        else if(x1==5)
        {i5.setImageResource(R.drawable.c7);}
        else if(x1==6)
        {i5.setImageResource(R.drawable.c8);}
        else if(x1==7)
        {i5.setImageResource(R.drawable.c9);}
        else if(x1==8)
        {i5.setImageResource(R.drawable.ct);}
        else if(x1==9)
        {i5.setImageResource(R.drawable.cj);}
        else if(x1==10)
        {i5.setImageResource(R.drawable.cq);}
        else if(x1==11)
        {i5.setImageResource(R.drawable.ck);}
        else if(x1==25)
        {i5.setImageResource(R.drawable.da);}
        else if(x1==13)
        {i5.setImageResource(R.drawable.d2);}
        else if(x1==14)
        {i5.setImageResource(R.drawable.d3);}
        else if(x1==15)
        {i5.setImageResource(R.drawable.d4);}
        else if(x1==16)
        {i5.setImageResource(R.drawable.d5);}
        else if(x1==17)
        {i5.setImageResource(R.drawable.d6);}
        else if(x1==18)
        {i5.setImageResource(R.drawable.d7);}
        else if(x1==19)
        {i5.setImageResource(R.drawable.d8);}
        else if(x1==20)
        {i5.setImageResource(R.drawable.d9);}
        else if(x1==21)
        {i5.setImageResource(R.drawable.dt);}
        else if(x1==22)
        {i5.setImageResource(R.drawable.dj);}
        else if(x1==23)
        {i5.setImageResource(R.drawable.dq);}
        else if(x1==24)
        {i5.setImageResource(R.drawable.dk);}
        else if(x1==38)
        {i5.setImageResource(R.drawable.ha);}
        else if(x1==26)
        {i5.setImageResource(R.drawable.h2);}
        else if(x1==27)
        {i5.setImageResource(R.drawable.h3);}
        else if(x1==28)
        {i5.setImageResource(R.drawable.h4);}
        else if(x1==29)
        {i5.setImageResource(R.drawable.h5);}
        else if(x1==30)
        {i5.setImageResource(R.drawable.h6);}
        else if(x1==31)
        {i5.setImageResource(R.drawable.h7);}
        else if(x1==32)
        {i5.setImageResource(R.drawable.h8);}
        else if(x1==33)
        {i5.setImageResource(R.drawable.h9);}
        else if(x1==34)
        {i5.setImageResource(R.drawable.ht);}
        else if(x1==35)
        {i5.setImageResource(R.drawable.hj);}
        else if(x1==36)
        {i5.setImageResource(R.drawable.hq);}
        else if(x1==37)
        {i5.setImageResource(R.drawable.hk);}
        else if(x1==51)
        {i5.setImageResource(R.drawable.sa);}
        else if(x1==39)
        {i5.setImageResource(R.drawable.s2);}
        else if(x1==40)
        {i5.setImageResource(R.drawable.s3);}
        else if(x1==41)
        {i5.setImageResource(R.drawable.s4);}
        else if(x1==42)
        {i5.setImageResource(R.drawable.s5);}
        else if(x1==43)
        {i5.setImageResource(R.drawable.s6);}
        else if(x1==44)
        {i5.setImageResource(R.drawable.s7);}
        else if(x1==45)
        {i5.setImageResource(R.drawable.s8);}
        else if(x1==46)
        {i5.setImageResource(R.drawable.s9);}
        else if(x1==47)
        {i5.setImageResource(R.drawable.st);}
        else if(x1==48)
        {i5.setImageResource(R.drawable.sj);}
        else if(x1==49)
        {i5.setImageResource(R.drawable.sq);}
        else if(x1==50)
        {i5.setImageResource(R.drawable.sk);}

        i5.animate().translationYBy(1000).setDuration(500);

        x1=x6;
        i6.setTranslationY(-1000);
        if(x1==12)
        {i6.setImageResource(R.drawable.ca);}
        else if(x1==0)
        {i6.setImageResource(R.drawable.c2);}
        else if(x1==1)
        {i6.setImageResource(R.drawable.c3);}
        else if(x1==2)
        {i6.setImageResource(R.drawable.c4);}
        else if(x1==3)
        {i6.setImageResource(R.drawable.c5);}
        else if(x1==4)
        {i6.setImageResource(R.drawable.c6);}
        else if(x1==5)
        {i6.setImageResource(R.drawable.c7);}
        else if(x1==6)
        {i6.setImageResource(R.drawable.c8);}
        else if(x1==7)
        {i6.setImageResource(R.drawable.c9);}
        else if(x1==8)
        {i6.setImageResource(R.drawable.ct);}
        else if(x1==9)
        {i6.setImageResource(R.drawable.cj);}
        else if(x1==10)
        {i6.setImageResource(R.drawable.cq);}
        else if(x1==11)
        {i6.setImageResource(R.drawable.ck);}
        else if(x1==25)
        {i6.setImageResource(R.drawable.da);}
        else if(x1==13)
        {i6.setImageResource(R.drawable.d2);}
        else if(x1==14)
        {i6.setImageResource(R.drawable.d3);}
        else if(x1==15)
        {i6.setImageResource(R.drawable.d4);}
        else if(x1==16)
        {i6.setImageResource(R.drawable.d5);}
        else if(x1==17)
        {i6.setImageResource(R.drawable.d6);}
        else if(x1==18)
        {i6.setImageResource(R.drawable.d7);}
        else if(x1==19)
        {i6.setImageResource(R.drawable.d8);}
        else if(x1==20)
        {i6.setImageResource(R.drawable.d9);}
        else if(x1==21)
        {i6.setImageResource(R.drawable.dt);}
        else if(x1==22)
        {i6.setImageResource(R.drawable.dj);}
        else if(x1==23)
        {i6.setImageResource(R.drawable.dq);}
        else if(x1==24)
        {i6.setImageResource(R.drawable.dk);}
        else if(x1==38)
        {i6.setImageResource(R.drawable.ha);}
        else if(x1==26)
        {i6.setImageResource(R.drawable.h2);}
        else if(x1==27)
        {i6.setImageResource(R.drawable.h3);}
        else if(x1==28)
        {i6.setImageResource(R.drawable.h4);}
        else if(x1==29)
        {i6.setImageResource(R.drawable.h5);}
        else if(x1==30)
        {i6.setImageResource(R.drawable.h6);}
        else if(x1==31)
        {i6.setImageResource(R.drawable.h7);}
        else if(x1==32)
        {i6.setImageResource(R.drawable.h8);}
        else if(x1==33)
        {i6.setImageResource(R.drawable.h9);}
        else if(x1==34)
        {i6.setImageResource(R.drawable.ht);}
        else if(x1==35)
        {i6.setImageResource(R.drawable.hj);}
        else if(x1==36)
        {i6.setImageResource(R.drawable.hq);}
        else if(x1==37)
        {i6.setImageResource(R.drawable.hk);}
        else if(x1==51)
        {i6.setImageResource(R.drawable.sa);}
        else if(x1==39)
        {i6.setImageResource(R.drawable.s2);}
        else if(x1==40)
        {i6.setImageResource(R.drawable.s3);}
        else if(x1==41)
        {i6.setImageResource(R.drawable.s4);}
        else if(x1==42)
        {i6.setImageResource(R.drawable.s5);}
        else if(x1==43)
        {i6.setImageResource(R.drawable.s6);}
        else if(x1==44)
        {i6.setImageResource(R.drawable.s7);}
        else if(x1==45)
        {i6.setImageResource(R.drawable.s8);}
        else if(x1==46)
        {i6.setImageResource(R.drawable.s9);}
        else if(x1==47)
        {i6.setImageResource(R.drawable.st);}
        else if(x1==48)
        {i6.setImageResource(R.drawable.sj);}
        else if(x1==49)
        {i6.setImageResource(R.drawable.sq);}
        else if(x1==50)
        {i6.setImageResource(R.drawable.sk);}

        i6.animate().translationYBy(1000).setDuration(600);

        x1=x7;
        i7.setTranslationY(-1000);
        if(x1==12)
        {i7.setImageResource(R.drawable.ca);}
        else if(x1==0)
        {i7.setImageResource(R.drawable.c2);}
        else if(x1==1)
        {i7.setImageResource(R.drawable.c3);}
        else if(x1==2)
        {i7.setImageResource(R.drawable.c4);}
        else if(x1==3)
        {i7.setImageResource(R.drawable.c5);}
        else if(x1==4)
        {i7.setImageResource(R.drawable.c6);}
        else if(x1==5)
        {i7.setImageResource(R.drawable.c7);}
        else if(x1==6)
        {i7.setImageResource(R.drawable.c8);}
        else if(x1==7)
        {i7.setImageResource(R.drawable.c9);}
        else if(x1==8)
        {i7.setImageResource(R.drawable.ct);}
        else if(x1==9)
        {i7.setImageResource(R.drawable.cj);}
        else if(x1==10)
        {i7.setImageResource(R.drawable.cq);}
        else if(x1==11)
        {i7.setImageResource(R.drawable.ck);}
        else if(x1==25)
        {i7.setImageResource(R.drawable.da);}
        else if(x1==13)
        {i7.setImageResource(R.drawable.d2);}
        else if(x1==14)
        {i7.setImageResource(R.drawable.d3);}
        else if(x1==15)
        {i7.setImageResource(R.drawable.d4);}
        else if(x1==16)
        {i7.setImageResource(R.drawable.d5);}
        else if(x1==17)
        {i7.setImageResource(R.drawable.d6);}
        else if(x1==18)
        {i7.setImageResource(R.drawable.d7);}
        else if(x1==19)
        {i7.setImageResource(R.drawable.d8);}
        else if(x1==20)
        {i7.setImageResource(R.drawable.d9);}
        else if(x1==21)
        {i7.setImageResource(R.drawable.dt);}
        else if(x1==22)
        {i7.setImageResource(R.drawable.dj);}
        else if(x1==23)
        {i7.setImageResource(R.drawable.dq);}
        else if(x1==24)
        {i7.setImageResource(R.drawable.dk);}
        else if(x1==38)
        {i7.setImageResource(R.drawable.ha);}
        else if(x1==26)
        {i7.setImageResource(R.drawable.h2);}
        else if(x1==27)
        {i7.setImageResource(R.drawable.h3);}
        else if(x1==28)
        {i7.setImageResource(R.drawable.h4);}
        else if(x1==29)
        {i7.setImageResource(R.drawable.h5);}
        else if(x1==30)
        {i7.setImageResource(R.drawable.h6);}
        else if(x1==31)
        {i7.setImageResource(R.drawable.h7);}
        else if(x1==32)
        {i7.setImageResource(R.drawable.h8);}
        else if(x1==33)
        {i7.setImageResource(R.drawable.h9);}
        else if(x1==34)
        {i7.setImageResource(R.drawable.ht);}
        else if(x1==35)
        {i7.setImageResource(R.drawable.hj);}
        else if(x1==36)
        {i7.setImageResource(R.drawable.hq);}
        else if(x1==37)
        {i7.setImageResource(R.drawable.hk);}
        else if(x1==51)
        {i7.setImageResource(R.drawable.sa);}
        else if(x1==39)
        {i7.setImageResource(R.drawable.s2);}
        else if(x1==40)
        {i7.setImageResource(R.drawable.s3);}
        else if(x1==41)
        {i7.setImageResource(R.drawable.s4);}
        else if(x1==42)
        {i7.setImageResource(R.drawable.s5);}
        else if(x1==43)
        {i7.setImageResource(R.drawable.s6);}
        else if(x1==44)
        {i7.setImageResource(R.drawable.s7);}
        else if(x1==45)
        {i7.setImageResource(R.drawable.s8);}
        else if(x1==46)
        {i7.setImageResource(R.drawable.s9);}
        else if(x1==47)
        {i7.setImageResource(R.drawable.st);}
        else if(x1==48)
        {i7.setImageResource(R.drawable.sj);}
        else if(x1==49)
        {i7.setImageResource(R.drawable.sq);}
        else if(x1==50)
        {i7.setImageResource(R.drawable.sk);}

        i7.animate().translationYBy(1000).setDuration(700);

        x1=x8;
        i8.setTranslationY(-1000);
        if(x1==12)
        {i8.setImageResource(R.drawable.ca);}
        else if(x1==0)
        {i8.setImageResource(R.drawable.c2);}
        else if(x1==1)
        {i8.setImageResource(R.drawable.c3);}
        else if(x1==2)
        {i8.setImageResource(R.drawable.c4);}
        else if(x1==3)
        {i8.setImageResource(R.drawable.c5);}
        else if(x1==4)
        {i8.setImageResource(R.drawable.c6);}
        else if(x1==5)
        {i8.setImageResource(R.drawable.c7);}
        else if(x1==6)
        {i8.setImageResource(R.drawable.c8);}
        else if(x1==7)
        {i8.setImageResource(R.drawable.c9);}
        else if(x1==8)
        {i8.setImageResource(R.drawable.ct);}
        else if(x1==9)
        {i8.setImageResource(R.drawable.cj);}
        else if(x1==10)
        {i8.setImageResource(R.drawable.cq);}
        else if(x1==11)
        {i8.setImageResource(R.drawable.ck);}
        else if(x1==25)
        {i8.setImageResource(R.drawable.da);}
        else if(x1==13)
        {i8.setImageResource(R.drawable.d2);}
        else if(x1==14)
        {i8.setImageResource(R.drawable.d3);}
        else if(x1==15)
        {i8.setImageResource(R.drawable.d4);}
        else if(x1==16)
        {i8.setImageResource(R.drawable.d5);}
        else if(x1==17)
        {i8.setImageResource(R.drawable.d6);}
        else if(x1==18)
        {i8.setImageResource(R.drawable.d7);}
        else if(x1==19)
        {i8.setImageResource(R.drawable.d8);}
        else if(x1==20)
        {i8.setImageResource(R.drawable.d9);}
        else if(x1==21)
        {i8.setImageResource(R.drawable.dt);}
        else if(x1==22)
        {i8.setImageResource(R.drawable.dj);}
        else if(x1==23)
        {i8.setImageResource(R.drawable.dq);}
        else if(x1==24)
        {i8.setImageResource(R.drawable.dk);}
        else if(x1==38)
        {i8.setImageResource(R.drawable.ha);}
        else if(x1==26)
        {i8.setImageResource(R.drawable.h2);}
        else if(x1==27)
        {i8.setImageResource(R.drawable.h3);}
        else if(x1==28)
        {i8.setImageResource(R.drawable.h4);}
        else if(x1==29)
        {i8.setImageResource(R.drawable.h5);}
        else if(x1==30)
        {i8.setImageResource(R.drawable.h6);}
        else if(x1==31)
        {i8.setImageResource(R.drawable.h7);}
        else if(x1==32)
        {i8.setImageResource(R.drawable.h8);}
        else if(x1==33)
        {i8.setImageResource(R.drawable.h9);}
        else if(x1==34)
        {i8.setImageResource(R.drawable.ht);}
        else if(x1==35)
        {i8.setImageResource(R.drawable.hj);}
        else if(x1==36)
        {i8.setImageResource(R.drawable.hq);}
        else if(x1==37)
        {i8.setImageResource(R.drawable.hk);}
        else if(x1==51)
        {i8.setImageResource(R.drawable.sa);}
        else if(x1==39)
        {i8.setImageResource(R.drawable.s2);}
        else if(x1==40)
        {i8.setImageResource(R.drawable.s3);}
        else if(x1==41)
        {i8.setImageResource(R.drawable.s4);}
        else if(x1==42)
        {i8.setImageResource(R.drawable.s5);}
        else if(x1==43)
        {i8.setImageResource(R.drawable.s6);}
        else if(x1==44)
        {i8.setImageResource(R.drawable.s7);}
        else if(x1==45)
        {i8.setImageResource(R.drawable.s8);}
        else if(x1==46)
        {i8.setImageResource(R.drawable.s9);}
        else if(x1==47)
        {i8.setImageResource(R.drawable.st);}
        else if(x1==48)
        {i8.setImageResource(R.drawable.sj);}
        else if(x1==49)
        {i8.setImageResource(R.drawable.sq);}
        else if(x1==50)
        {i8.setImageResource(R.drawable.sk);}

        i8.animate().translationYBy(1000).setDuration(800);


        x1=x9;
        i9.setTranslationX(-1000);
        if(x1==12)
        {i9.setImageResource(R.drawable.ca);}
        else if(x1==0)
        {i9.setImageResource(R.drawable.c2);}
        else if(x1==1)
        {i9.setImageResource(R.drawable.c3);}
        else if(x1==2)
        {i9.setImageResource(R.drawable.c4);}
        else if(x1==3)
        {i9.setImageResource(R.drawable.c5);}
        else if(x1==4)
        {i9.setImageResource(R.drawable.c6);}
        else if(x1==5)
        {i9.setImageResource(R.drawable.c7);}
        else if(x1==6)
        {i9.setImageResource(R.drawable.c8);}
        else if(x1==7)
        {i9.setImageResource(R.drawable.c9);}
        else if(x1==8)
        {i9.setImageResource(R.drawable.ct);}
        else if(x1==9)
        {i9.setImageResource(R.drawable.cj);}
        else if(x1==10)
        {i9.setImageResource(R.drawable.cq);}
        else if(x1==11)
        {i9.setImageResource(R.drawable.ck);}
        else if(x1==25)
        {i9.setImageResource(R.drawable.da);}
        else if(x1==13)
        {i9.setImageResource(R.drawable.d2);}
        else if(x1==14)
        {i9.setImageResource(R.drawable.d3);}
        else if(x1==15)
        {i9.setImageResource(R.drawable.d4);}
        else if(x1==16)
        {i9.setImageResource(R.drawable.d5);}
        else if(x1==17)
        {i9.setImageResource(R.drawable.d6);}
        else if(x1==18)
        {i9.setImageResource(R.drawable.d7);}
        else if(x1==19)
        {i9.setImageResource(R.drawable.d8);}
        else if(x1==20)
        {i9.setImageResource(R.drawable.d9);}
        else if(x1==21)
        {i9.setImageResource(R.drawable.dt);}
        else if(x1==22)
        {i9.setImageResource(R.drawable.dj);}
        else if(x1==23)
        {i9.setImageResource(R.drawable.dq);}
        else if(x1==24)
        {i9.setImageResource(R.drawable.dk);}
        else if(x1==38)
        {i9.setImageResource(R.drawable.ha);}
        else if(x1==26)
        {i9.setImageResource(R.drawable.h2);}
        else if(x1==27)
        {i9.setImageResource(R.drawable.h3);}
        else if(x1==28)
        {i9.setImageResource(R.drawable.h4);}
        else if(x1==29)
        {i9.setImageResource(R.drawable.h5);}
        else if(x1==30)
        {i9.setImageResource(R.drawable.h6);}
        else if(x1==31)
        {i9.setImageResource(R.drawable.h7);}
        else if(x1==32)
        {i9.setImageResource(R.drawable.h8);}
        else if(x1==33)
        {i9.setImageResource(R.drawable.h9);}
        else if(x1==34)
        {i9.setImageResource(R.drawable.ht);}
        else if(x1==35)
        {i9.setImageResource(R.drawable.hj);}
        else if(x1==36)
        {i9.setImageResource(R.drawable.hq);}
        else if(x1==37)
        {i9.setImageResource(R.drawable.hk);}
        else if(x1==51)
        {i9.setImageResource(R.drawable.sa);}
        else if(x1==39)
        {i9.setImageResource(R.drawable.s2);}
        else if(x1==40)
        {i9.setImageResource(R.drawable.s3);}
        else if(x1==41)
        {i9.setImageResource(R.drawable.s4);}
        else if(x1==42)
        {i9.setImageResource(R.drawable.s5);}
        else if(x1==43)
        {i9.setImageResource(R.drawable.s6);}
        else if(x1==44)
        {i9.setImageResource(R.drawable.s7);}
        else if(x1==45)
        {i9.setImageResource(R.drawable.s8);}
        else if(x1==46)
        {i9.setImageResource(R.drawable.s9);}
        else if(x1==47)
        {i9.setImageResource(R.drawable.st);}
        else if(x1==48)
        {i9.setImageResource(R.drawable.sj);}
        else if(x1==49)
        {i9.setImageResource(R.drawable.sq);}
        else if(x1==50)
        {i9.setImageResource(R.drawable.sk);}

        i9.animate().translationXBy(1000).setDuration(900);


        x1=x10;
        i10.setTranslationX(-1000);
        if(x1==12)
        {i10.setImageResource(R.drawable.ca);}
        else if(x1==0)
        {i10.setImageResource(R.drawable.c2);}
        else if(x1==1)
        {i10.setImageResource(R.drawable.c3);}
        else if(x1==2)
        {i10.setImageResource(R.drawable.c4);}
        else if(x1==3)
        {i10.setImageResource(R.drawable.c5);}
        else if(x1==4)
        {i10.setImageResource(R.drawable.c6);}
        else if(x1==5)
        {i10.setImageResource(R.drawable.c7);}
        else if(x1==6)
        {i10.setImageResource(R.drawable.c8);}
        else if(x1==7)
        {i10.setImageResource(R.drawable.c9);}
        else if(x1==8)
        {i10.setImageResource(R.drawable.ct);}
        else if(x1==9)
        {i10.setImageResource(R.drawable.cj);}
        else if(x1==10)
        {i10.setImageResource(R.drawable.cq);}
        else if(x1==11)
        {i10.setImageResource(R.drawable.ck);}
        else if(x1==25)
        {i10.setImageResource(R.drawable.da);}
        else if(x1==13)
        {i10.setImageResource(R.drawable.d2);}
        else if(x1==14)
        {i10.setImageResource(R.drawable.d3);}
        else if(x1==15)
        {i10.setImageResource(R.drawable.d4);}
        else if(x1==16)
        {i10.setImageResource(R.drawable.d5);}
        else if(x1==17)
        {i10.setImageResource(R.drawable.d6);}
        else if(x1==18)
        {i10.setImageResource(R.drawable.d7);}
        else if(x1==19)
        {i10.setImageResource(R.drawable.d8);}
        else if(x1==20)
        {i10.setImageResource(R.drawable.d9);}
        else if(x1==21)
        {i10.setImageResource(R.drawable.dt);}
        else if(x1==22)
        {i10.setImageResource(R.drawable.dj);}
        else if(x1==23)
        {i10.setImageResource(R.drawable.dq);}
        else if(x1==24)
        {i10.setImageResource(R.drawable.dk);}
        else if(x1==38)
        {i10.setImageResource(R.drawable.ha);}
        else if(x1==26)
        {i10.setImageResource(R.drawable.h2);}
        else if(x1==27)
        {i10.setImageResource(R.drawable.h3);}
        else if(x1==28)
        {i10.setImageResource(R.drawable.h4);}
        else if(x1==29)
        {i10.setImageResource(R.drawable.h5);}
        else if(x1==30)
        {i10.setImageResource(R.drawable.h6);}
        else if(x1==31)
        {i10.setImageResource(R.drawable.h7);}
        else if(x1==32)
        {i10.setImageResource(R.drawable.h8);}
        else if(x1==33)
        {i10.setImageResource(R.drawable.h9);}
        else if(x1==34)
        {i10.setImageResource(R.drawable.ht);}
        else if(x1==35)
        {i10.setImageResource(R.drawable.hj);}
        else if(x1==36)
        {i10.setImageResource(R.drawable.hq);}
        else if(x1==37)
        {i10.setImageResource(R.drawable.hk);}
        else if(x1==51)
        {i10.setImageResource(R.drawable.sa);}
        else if(x1==39)
        {i10.setImageResource(R.drawable.s2);}
        else if(x1==40)
        {i10.setImageResource(R.drawable.s3);}
        else if(x1==41)
        {i10.setImageResource(R.drawable.s4);}
        else if(x1==42)
        {i10.setImageResource(R.drawable.s5);}
        else if(x1==43)
        {i10.setImageResource(R.drawable.s6);}
        else if(x1==44)
        {i10.setImageResource(R.drawable.s7);}
        else if(x1==45)
        {i10.setImageResource(R.drawable.s8);}
        else if(x1==46)
        {i10.setImageResource(R.drawable.s9);}
        else if(x1==47)
        {i10.setImageResource(R.drawable.st);}
        else if(x1==48)
        {i10.setImageResource(R.drawable.sj);}
        else if(x1==49)
        {i10.setImageResource(R.drawable.sq);}
        else if(x1==50)
        {i10.setImageResource(R.drawable.sk);}

        i10.animate().translationXBy(1000).setDuration(1000);








        x1=x11;

        h1.setTranslationY(-1000);
        if(x1==12)
        {h1.setImageResource(R.drawable.ca);}
        else if(x1==0)
        {h1.setImageResource(R.drawable.c2);}
        else if(x1==1)
        {h1.setImageResource(R.drawable.c3);}
        else if(x1==2)
        {h1.setImageResource(R.drawable.c4);}
        else if(x1==3)
        {h1.setImageResource(R.drawable.c5);}
        else if(x1==4)
        {h1.setImageResource(R.drawable.c6);}
        else if(x1==5)
        {h1.setImageResource(R.drawable.c7);}
        else if(x1==6)
        {h1.setImageResource(R.drawable.c8);}
        else if(x1==7)
        {h1.setImageResource(R.drawable.c9);}
        else if(x1==8)
        {h1.setImageResource(R.drawable.ct);}
        else if(x1==9)
        {h1.setImageResource(R.drawable.cj);}
        else if(x1==10)
        {h1.setImageResource(R.drawable.cq);}
        else if(x1==11)
        {h1.setImageResource(R.drawable.ck);}
        else if(x1==25)
        {h1.setImageResource(R.drawable.da);}
        else if(x1==13)
        {h1.setImageResource(R.drawable.d2);}
        else if(x1==14)
        {h1.setImageResource(R.drawable.d3);}
        else if(x1==15)
        {h1.setImageResource(R.drawable.d4);}
        else if(x1==16)
        {h1.setImageResource(R.drawable.d5);}
        else if(x1==17)
        {h1.setImageResource(R.drawable.d6);}
        else if(x1==18)
        {h1.setImageResource(R.drawable.d7);}
        else if(x1==19)
        {h1.setImageResource(R.drawable.d8);}
        else if(x1==20)
        {h1.setImageResource(R.drawable.d9);}
        else if(x1==21)
        {h1.setImageResource(R.drawable.dt);}
        else if(x1==22)
        {h1.setImageResource(R.drawable.dj);}
        else if(x1==23)
        {h1.setImageResource(R.drawable.dq);}
        else if(x1==24)
        {h1.setImageResource(R.drawable.dk);}
        else if(x1==38)
        {h1.setImageResource(R.drawable.ha);}
        else if(x1==26)
        {h1.setImageResource(R.drawable.h2);}
        else if(x1==27)
        {h1.setImageResource(R.drawable.h3);}
        else if(x1==28)
        {h1.setImageResource(R.drawable.h4);}
        else if(x1==29)
        {h1.setImageResource(R.drawable.h5);}
        else if(x1==30)
        {h1.setImageResource(R.drawable.h6);}
        else if(x1==31)
        {h1.setImageResource(R.drawable.h7);}
        else if(x1==32)
        {h1.setImageResource(R.drawable.h8);}
        else if(x1==33)
        {h1.setImageResource(R.drawable.h9);}
        else if(x1==34)
        {h1.setImageResource(R.drawable.ht);}
        else if(x1==35)
        {h1.setImageResource(R.drawable.hj);}
        else if(x1==36)
        {h1.setImageResource(R.drawable.hq);}
        else if(x1==37)
        {h1.setImageResource(R.drawable.hk);}
        else if(x1==51)
        {h1.setImageResource(R.drawable.sa);}
        else if(x1==39)
        {h1.setImageResource(R.drawable.s2);}
        else if(x1==40)
        {h1.setImageResource(R.drawable.s3);}
        else if(x1==41)
        {h1.setImageResource(R.drawable.s4);}
        else if(x1==42)
        {h1.setImageResource(R.drawable.s5);}
        else if(x1==43)
        {h1.setImageResource(R.drawable.s6);}
        else if(x1==44)
        {h1.setImageResource(R.drawable.s7);}
        else if(x1==45)
        {h1.setImageResource(R.drawable.s8);}
        else if(x1==46)
        {h1.setImageResource(R.drawable.s9);}
        else if(x1==47)
        {h1.setImageResource(R.drawable.st);}
        else if(x1==48)
        {h1.setImageResource(R.drawable.sj);}
        else if(x1==49)
        {h1.setImageResource(R.drawable.sq);}
        else if(x1==50)
        {h1.setImageResource(R.drawable.sk);}

        h1.animate().translationYBy(1000).setDuration(700);

        x1=x12;
        h2.setTranslationY(-1000);
        if(x1==12)
        {h2.setImageResource(R.drawable.ca);}
        else if(x1==0)
        {h2.setImageResource(R.drawable.c2);}
        else if(x1==1)
        {h2.setImageResource(R.drawable.c3);}
        else if(x1==2)
        {h2.setImageResource(R.drawable.c4);}
        else if(x1==3)
        {h2.setImageResource(R.drawable.c5);}
        else if(x1==4)
        {h2.setImageResource(R.drawable.c6);}
        else if(x1==5)
        {h2.setImageResource(R.drawable.c7);}
        else if(x1==6)
        {h2.setImageResource(R.drawable.c8);}
        else if(x1==7)
        {h2.setImageResource(R.drawable.c9);}
        else if(x1==8)
        {h2.setImageResource(R.drawable.ct);}
        else if(x1==9)
        {h2.setImageResource(R.drawable.cj);}
        else if(x1==10)
        {h2.setImageResource(R.drawable.cq);}
        else if(x1==11)
        {h2.setImageResource(R.drawable.ck);}
        else if(x1==25)
        {h2.setImageResource(R.drawable.da);}
        else if(x1==13)
        {h2.setImageResource(R.drawable.d2);}
        else if(x1==14)
        {h2.setImageResource(R.drawable.d3);}
        else if(x1==15)
        {h2.setImageResource(R.drawable.d4);}
        else if(x1==16)
        {h2.setImageResource(R.drawable.d5);}
        else if(x1==17)
        {h2.setImageResource(R.drawable.d6);}
        else if(x1==18)
        {h2.setImageResource(R.drawable.d7);}
        else if(x1==19)
        {h2.setImageResource(R.drawable.d8);}
        else if(x1==20)
        {h2.setImageResource(R.drawable.d9);}
        else if(x1==21)
        {h2.setImageResource(R.drawable.dt);}
        else if(x1==22)
        {h2.setImageResource(R.drawable.dj);}
        else if(x1==23)
        {h2.setImageResource(R.drawable.dq);}
        else if(x1==24)
        {h2.setImageResource(R.drawable.dk);}
        else if(x1==38)
        {h2.setImageResource(R.drawable.ha);}
        else if(x1==26)
        {h2.setImageResource(R.drawable.h2);}
        else if(x1==27)
        {h2.setImageResource(R.drawable.h3);}
        else if(x1==28)
        {h2.setImageResource(R.drawable.h4);}
        else if(x1==29)
        {h2.setImageResource(R.drawable.h5);}
        else if(x1==30)
        {h2.setImageResource(R.drawable.h6);}
        else if(x1==31)
        {h2.setImageResource(R.drawable.h7);}
        else if(x1==32)
        {h2.setImageResource(R.drawable.h8);}
        else if(x1==33)
        {h2.setImageResource(R.drawable.h9);}
        else if(x1==34)
        {h2.setImageResource(R.drawable.ht);}
        else if(x1==35)
        {h2.setImageResource(R.drawable.hj);}
        else if(x1==36)
        {h2.setImageResource(R.drawable.hq);}
        else if(x1==37)
        {h2.setImageResource(R.drawable.hk);}
        else if(x1==51)
        {h2.setImageResource(R.drawable.sa);}
        else if(x1==39)
        {h2.setImageResource(R.drawable.s2);}
        else if(x1==40)
        {h2.setImageResource(R.drawable.s3);}
        else if(x1==41)
        {h2.setImageResource(R.drawable.s4);}
        else if(x1==42)
        {h2.setImageResource(R.drawable.s5);}
        else if(x1==43)
        {h2.setImageResource(R.drawable.s6);}
        else if(x1==44)
        {h2.setImageResource(R.drawable.s7);}
        else if(x1==45)
        {h2.setImageResource(R.drawable.s8);}
        else if(x1==46)
        {h2.setImageResource(R.drawable.s9);}
        else if(x1==47)
        {h2.setImageResource(R.drawable.st);}
        else if(x1==48)
        {h2.setImageResource(R.drawable.sj);}
        else if(x1==49)
        {h2.setImageResource(R.drawable.sq);}
        else if(x1==50)
        {h2.setImageResource(R.drawable.sk);}

        h2.animate().translationYBy(1000).setDuration(800);

        x1=x13;
        h3.setTranslationY(-1000);
        if(x1==12)
        {h3.setImageResource(R.drawable.ca);}
        else if(x1==0)
        {h3.setImageResource(R.drawable.c2);}
        else if(x1==1)
        {h3.setImageResource(R.drawable.c3);}
        else if(x1==2)
        {h3.setImageResource(R.drawable.c4);}
        else if(x1==3)
        {h3.setImageResource(R.drawable.c5);}
        else if(x1==4)
        {h3.setImageResource(R.drawable.c6);}
        else if(x1==5)
        {h3.setImageResource(R.drawable.c7);}
        else if(x1==6)
        {h3.setImageResource(R.drawable.c8);}
        else if(x1==7)
        {h3.setImageResource(R.drawable.c9);}
        else if(x1==8)
        {h3.setImageResource(R.drawable.ct);}
        else if(x1==9)
        {h3.setImageResource(R.drawable.cj);}
        else if(x1==10)
        {h3.setImageResource(R.drawable.cq);}
        else if(x1==11)
        {h3.setImageResource(R.drawable.ck);}
        else if(x1==25)
        {h3.setImageResource(R.drawable.da);}
        else if(x1==13)
        {h3.setImageResource(R.drawable.d2);}
        else if(x1==14)
        {h3.setImageResource(R.drawable.d3);}
        else if(x1==15)
        {h3.setImageResource(R.drawable.d4);}
        else if(x1==16)
        {h3.setImageResource(R.drawable.d5);}
        else if(x1==17)
        {h3.setImageResource(R.drawable.d6);}
        else if(x1==18)
        {h3.setImageResource(R.drawable.d7);}
        else if(x1==19)
        {h3.setImageResource(R.drawable.d8);}
        else if(x1==20)
        {h3.setImageResource(R.drawable.d9);}
        else if(x1==21)
        {h3.setImageResource(R.drawable.dt);}
        else if(x1==22)
        {h3.setImageResource(R.drawable.dj);}
        else if(x1==23)
        {h3.setImageResource(R.drawable.dq);}
        else if(x1==24)
        {h3.setImageResource(R.drawable.dk);}
        else if(x1==38)
        {h3.setImageResource(R.drawable.ha);}
        else if(x1==26)
        {h3.setImageResource(R.drawable.h3);}
        else if(x1==27)
        {h3.setImageResource(R.drawable.h3);}
        else if(x1==28)
        {h3.setImageResource(R.drawable.h4);}
        else if(x1==29)
        {h3.setImageResource(R.drawable.h5);}
        else if(x1==30)
        {h3.setImageResource(R.drawable.h6);}
        else if(x1==31)
        {h3.setImageResource(R.drawable.h7);}
        else if(x1==32)
        {h3.setImageResource(R.drawable.h8);}
        else if(x1==33)
        {h3.setImageResource(R.drawable.h9);}
        else if(x1==34)
        {h3.setImageResource(R.drawable.ht);}
        else if(x1==35)
        {h3.setImageResource(R.drawable.hj);}
        else if(x1==36)
        {h3.setImageResource(R.drawable.hq);}
        else if(x1==37)
        {h3.setImageResource(R.drawable.hk);}
        else if(x1==51)
        {h3.setImageResource(R.drawable.sa);}
        else if(x1==39)
        {h3.setImageResource(R.drawable.s2);}
        else if(x1==40)
        {h3.setImageResource(R.drawable.s3);}
        else if(x1==41)
        {h3.setImageResource(R.drawable.s4);}
        else if(x1==42)
        {h3.setImageResource(R.drawable.s5);}
        else if(x1==43)
        {h3.setImageResource(R.drawable.s6);}
        else if(x1==44)
        {h3.setImageResource(R.drawable.s7);}
        else if(x1==45)
        {h3.setImageResource(R.drawable.s8);}
        else if(x1==46)
        {h3.setImageResource(R.drawable.s9);}
        else if(x1==47)
        {h3.setImageResource(R.drawable.st);}
        else if(x1==48)
        {h3.setImageResource(R.drawable.sj);}
        else if(x1==49)
        {h3.setImageResource(R.drawable.sq);}
        else if(x1==50)
        {h3.setImageResource(R.drawable.sk);}

        h3.animate().translationYBy(1000).setDuration(900);


        x1=x14;
        h4.setTranslationY(-1000);
        if(x1==12)
        {h4.setImageResource(R.drawable.ca);}
        else if(x1==0)
        {h4.setImageResource(R.drawable.c2);}
        else if(x1==1)
        {h4.setImageResource(R.drawable.c3);}
        else if(x1==2)
        {h4.setImageResource(R.drawable.c4);}
        else if(x1==3)
        {h4.setImageResource(R.drawable.c5);}
        else if(x1==4)
        {h4.setImageResource(R.drawable.c6);}
        else if(x1==5)
        {h4.setImageResource(R.drawable.c7);}
        else if(x1==6)
        {h4.setImageResource(R.drawable.c8);}
        else if(x1==7)
        {h4.setImageResource(R.drawable.c9);}
        else if(x1==8)
        {h4.setImageResource(R.drawable.ct);}
        else if(x1==9)
        {h4.setImageResource(R.drawable.cj);}
        else if(x1==10)
        {h4.setImageResource(R.drawable.cq);}
        else if(x1==11)
        {h4.setImageResource(R.drawable.ck);}
        else if(x1==25)
        {h4.setImageResource(R.drawable.da);}
        else if(x1==13)
        {h4.setImageResource(R.drawable.d2);}
        else if(x1==14)
        {h4.setImageResource(R.drawable.d3);}
        else if(x1==15)
        {h4.setImageResource(R.drawable.d4);}
        else if(x1==16)
        {h4.setImageResource(R.drawable.d5);}
        else if(x1==17)
        {h4.setImageResource(R.drawable.d6);}
        else if(x1==18)
        {h4.setImageResource(R.drawable.d7);}
        else if(x1==19)
        {h4.setImageResource(R.drawable.d8);}
        else if(x1==20)
        {h4.setImageResource(R.drawable.d9);}
        else if(x1==21)
        {h4.setImageResource(R.drawable.dt);}
        else if(x1==22)
        {h4.setImageResource(R.drawable.dj);}
        else if(x1==23)
        {h4.setImageResource(R.drawable.dq);}
        else if(x1==24)
        {h4.setImageResource(R.drawable.dk);}
        else if(x1==38)
        {h4.setImageResource(R.drawable.ha);}
        else if(x1==26)
        {h4.setImageResource(R.drawable.h4);}
        else if(x1==27)
        {h4.setImageResource(R.drawable.h4);}
        else if(x1==28)
        {h4.setImageResource(R.drawable.h4);}
        else if(x1==29)
        {h4.setImageResource(R.drawable.h5);}
        else if(x1==30)
        {h4.setImageResource(R.drawable.h6);}
        else if(x1==31)
        {h4.setImageResource(R.drawable.h7);}
        else if(x1==32)
        {h4.setImageResource(R.drawable.h8);}
        else if(x1==33)
        {h4.setImageResource(R.drawable.h9);}
        else if(x1==34)
        {h4.setImageResource(R.drawable.ht);}
        else if(x1==35)
        {h4.setImageResource(R.drawable.hj);}
        else if(x1==36)
        {h4.setImageResource(R.drawable.hq);}
        else if(x1==37)
        {h4.setImageResource(R.drawable.hk);}
        else if(x1==51)
        {h4.setImageResource(R.drawable.sa);}
        else if(x1==39)
        {h4.setImageResource(R.drawable.s2);}
        else if(x1==40)
        {h4.setImageResource(R.drawable.s3);}
        else if(x1==41)
        {h4.setImageResource(R.drawable.s4);}
        else if(x1==42)
        {h4.setImageResource(R.drawable.s5);}
        else if(x1==43)
        {h4.setImageResource(R.drawable.s6);}
        else if(x1==44)
        {h4.setImageResource(R.drawable.s7);}
        else if(x1==45)
        {h4.setImageResource(R.drawable.s8);}
        else if(x1==46)
        {h4.setImageResource(R.drawable.s9);}
        else if(x1==47)
        {h4.setImageResource(R.drawable.st);}
        else if(x1==48)
        {h4.setImageResource(R.drawable.sj);}
        else if(x1==49)
        {h4.setImageResource(R.drawable.sq);}
        else if(x1==50)
        {h4.setImageResource(R.drawable.sk);}

        h4.animate().translationYBy(1000).setDuration(1000);

        x1=x15;
        h5.setTranslationY(-1000);
        if(x1==12)
        {h5.setImageResource(R.drawable.ca);}
        else if(x1==0)
        {h5.setImageResource(R.drawable.c2);}
        else if(x1==1)
        {h5.setImageResource(R.drawable.c3);}
        else if(x1==2)
        {h5.setImageResource(R.drawable.c4);}
        else if(x1==3)
        {h5.setImageResource(R.drawable.c5);}
        else if(x1==4)
        {h5.setImageResource(R.drawable.c6);}
        else if(x1==5)
        {h5.setImageResource(R.drawable.c7);}
        else if(x1==6)
        {h5.setImageResource(R.drawable.c8);}
        else if(x1==7)
        {h5.setImageResource(R.drawable.c9);}
        else if(x1==8)
        {h5.setImageResource(R.drawable.ct);}
        else if(x1==9)
        {h5.setImageResource(R.drawable.cj);}
        else if(x1==10)
        {h5.setImageResource(R.drawable.cq);}
        else if(x1==11)
        {h5.setImageResource(R.drawable.ck);}
        else if(x1==25)
        {h5.setImageResource(R.drawable.da);}
        else if(x1==13)
        {h5.setImageResource(R.drawable.d2);}
        else if(x1==14)
        {h5.setImageResource(R.drawable.d3);}
        else if(x1==15)
        {h5.setImageResource(R.drawable.d4);}
        else if(x1==16)
        {h5.setImageResource(R.drawable.d5);}
        else if(x1==17)
        {h5.setImageResource(R.drawable.d6);}
        else if(x1==18)
        {h5.setImageResource(R.drawable.d7);}
        else if(x1==19)
        {h5.setImageResource(R.drawable.d8);}
        else if(x1==20)
        {h5.setImageResource(R.drawable.d9);}
        else if(x1==21)
        {h5.setImageResource(R.drawable.dt);}
        else if(x1==22)
        {h5.setImageResource(R.drawable.dj);}
        else if(x1==23)
        {h5.setImageResource(R.drawable.dq);}
        else if(x1==24)
        {h5.setImageResource(R.drawable.dk);}
        else if(x1==38)
        {h5.setImageResource(R.drawable.ha);}
        else if(x1==26)
        {h5.setImageResource(R.drawable.h5);}
        else if(x1==27)
        {h5.setImageResource(R.drawable.h5);}
        else if(x1==28)
        {h5.setImageResource(R.drawable.h5);}
        else if(x1==29)
        {h5.setImageResource(R.drawable.h5);}
        else if(x1==30)
        {h5.setImageResource(R.drawable.h6);}
        else if(x1==31)
        {h5.setImageResource(R.drawable.h7);}
        else if(x1==32)
        {h5.setImageResource(R.drawable.h8);}
        else if(x1==33)
        {h5.setImageResource(R.drawable.h9);}
        else if(x1==34)
        {h5.setImageResource(R.drawable.ht);}
        else if(x1==35)
        {h5.setImageResource(R.drawable.hj);}
        else if(x1==36)
        {h5.setImageResource(R.drawable.hq);}
        else if(x1==37)
        {h5.setImageResource(R.drawable.hk);}
        else if(x1==51)
        {h5.setImageResource(R.drawable.sa);}
        else if(x1==39)
        {h5.setImageResource(R.drawable.s2);}
        else if(x1==40)
        {h5.setImageResource(R.drawable.s3);}
        else if(x1==41)
        {h5.setImageResource(R.drawable.s4);}
        else if(x1==42)
        {h5.setImageResource(R.drawable.s5);}
        else if(x1==43)
        {h5.setImageResource(R.drawable.s6);}
        else if(x1==44)
        {h5.setImageResource(R.drawable.s7);}
        else if(x1==45)
        {h5.setImageResource(R.drawable.s8);}
        else if(x1==46)
        {h5.setImageResource(R.drawable.s9);}
        else if(x1==47)
        {h5.setImageResource(R.drawable.st);}
        else if(x1==48)
        {h5.setImageResource(R.drawable.sj);}
        else if(x1==49)
        {h5.setImageResource(R.drawable.sq);}
        else if(x1==50)
        {h5.setImageResource(R.drawable.sk);}

        h5.animate().translationYBy(1000).setDuration(1100);


        int[] pa1=  getp(x,x2,x11,x12,x13,x14,x15);
        int[] pa2= getp(x3,x4,x11,x12,x13,x14,x15);
        int[] pa3= getp(x5,x6,x11,x12,x13,x14,x15);
        int[] pa4= getp(x7,x8,x11,x12,x13,x14,x15);
        int[] pa5= getp(x9,x10,x11,x12,x13,x14,x15);

        int a,b,c,d,e,n=0;
        a=pa1[0];
        b=pa2[0];
        c=pa3[0];
        d=pa4[0];
        e=pa5[0];


        if(a>b&&a>c&&a>d&&a>e)
        {n=a;}

        else if(b>a&&b>c&&b>d&&b>e)
        {n=b;}

        else if(c>a&&c>b&&c>d&&c>e)
        {n=c;}

        else if(d>a&&d>b&&c<d&&d>e)
        {n=d;}

        else if(e>a&&e>b&&e>d&&c<e)
        {n=e;}

        else if(a==b&&a>c&&a>d&&a>e)
        {for(int i=5;i>0;i--)
        {if(pa1[i]>pa2[i])
        {n=a;
            break;}
        else if(pa2[i]>pa1[i])
        {n=b;
            break;}}}





        else if(a==c&&a>b&&a>d&&a>e)
        {for(int i=5;i>0;i--)
        {if(pa1[i]>pa3[i])
        {n=a;
            break;}
        else if(pa1[i]<pa3[i])
        {n=c;
            break;}}}

        else if(a==d&&a>b&&a>c&&a>e)
        {for(int i=5;i>0;i--)
        {if(pa1[i]>pa4[i])
        {n=a;
            break;}
        else if(pa1[i]<pa4[i])
        {n=d;
            break;}}}

        else if(a==e&&a>b&&a>d&&a>c)
        {for(int i=5;i>0;i--)
        {if(pa1[i]>pa5[i])
        {n=a;
            break;}
        else if(pa1[i]<pa5[i])
        {n=e;
            break;}}}

        else if(b==c&&b>a&&b>d&&b>e)
        {for(int i=5;i>0;i--)
        {if(pa2[i]>pa3[i])
        {n=b;
            break;}
        else if(pa2[i]<pa3[i])
        {n=c;
            break;}}}

        else if(b==d&&b>a&&b>c&&b>e)
        {for(int i=5;i>0;i--)
        {if(pa2[i]>pa4[i])
        {n=b;
            break;}
        else if(pa2[i]<pa4[i])
        {n=d;
            break;}}}

        else if(b==e&&b>a&&b>d&&b>c)
        {for(int i=5;i>0;i--)
        {if(pa2[i]>pa5[i])
        {n=b;
            break;}
        else if(pa2[i]<pa5[i])
        {n=e;
            break;}}}

        else if(d==c&&c>a&&c>b&&c>e)
        {for(int i=5;i>0;i--)
        {if(pa4[i]<pa3[i])
        {n=c;
            break;}
        else if(pa4[i]>pa3[i])
        {n=d;
            break;}}}

        else if(c==e&&c>a&&c>b&&c>d)
        {for(int i=5;i>0;i--)
        {if(pa5[i]<pa3[i])
        {n=c;
            break;}
        else if(pa5[i]>pa3[i])
        {n=e;
            break;}}}

        else if(d==e&&d>a&&c<d&&d>b)
        {for(int i=5;i>0;i--)
        {if(pa4[i]>pa5[i])
        {n=d;
            break;}
        else if(pa4[i]<pa5[i])
        {n=e;
            break;}}}

        else if(a==b&&b==c&&a>d&&a>e)
        {for(int i=5;i>0;i--)
        {if(pa1[i]>pa3[i]&&pa1[i]>pa2[i])
        {n=a;
            b=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa1[i]<pa3[i]&&pa3[i]>pa2[i])
        {n=c;
            a=-1;
            b=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa2[i]>pa3[i]&&pa1[i]<pa2[i])
        {n=b;
            a=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        }}

        else if(a==b&&b==d&&a>c&&a>e)
        {for(int i=5;i>0;i--)
        {if(pa1[i]>pa4[i]&&pa1[i]>pa2[i])
        {n=a;
            b=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa1[i]<pa4[i]&&pa4[i]>pa2[i])
        {n=d;
            a=-1;
            b=-1;
            c=-1;
            e=-1;
            break;}
        else if(pa2[i]>pa4[i]&&pa1[i]<pa2[i])
        {n=b;
            a=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        }}

        else if(a==b&&b==e&&a>d&&a>c)
        {for(int i=5;i>0;i--)
        {if(pa1[i]>pa5[i]&&pa1[i]>pa2[i])
        {n=a;
            b=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa1[i]<pa5[i]&&pa5[i]>pa2[i])
        {n=e;
            a=-1;
            b=-1;
            d=-1;
            c=-1;
            break;}
        else if(pa2[i]>pa5[i]&&pa1[i]<pa2[i])
        {n=b;
            a=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        }}

        else if(a==c&&c==d&&a>b&&a>e)
        {for(int i=5;i>0;i--)
        {if(pa1[i]>pa3[i]&&pa1[i]>pa4[i])
        {n=a;
            b=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa1[i]<pa3[i]&&pa3[i]>pa4[i])
        {n=c;
            a=-1;
            b=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa4[i]>pa3[i]&&pa1[i]<pa4[i])
        {n=d;
            a=-1;
            c=-1;
            b=-1;
            e=-1;
            break;}
        }}
        else if(a==c&&c==e&&a>b&&a>d)
        {for(int i=5;i>0;i--)
        {if(pa1[i]>pa3[i]&&pa1[i]>pa5[i])
        {n=a;
            b=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa1[i]<pa3[i]&&pa3[i]>pa5[i])
        {n=c;
            a=-1;
            b=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa5[i]>pa3[i]&&pa1[i]<pa5[i])
        {n=e;
            a=-1;
            c=-1;
            b=-1;
            d=-1;
            break;}
        }}

        else if(a==d&&d==e&&a>b&&a>c)
        {for(int i=5;i>0;i--)
        {if(pa1[i]>pa4[i]&&pa1[i]>pa5[i])
        {n=a;
            b=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa1[i]<pa4[i]&&pa4[i]>pa5[i])
        {n=d;
            a=-1;
            b=-1;
            c=-1;
            e=-1;
            break;}
        else if(pa5[i]>pa4[i]&&pa1[i]<pa4[i])
        {n=e;
            a=-1;
            c=-1;
            b=-1;
            d=-1;
            break;}
        }}

        else if(b==c&&c==d&&b>a&&b>e)
        {for(int i=5;i>0;i--)
        {if(pa2[i]>pa3[i]&&pa2[i]>pa4[i])
        {n=b;
            a=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa2[i]<pa3[i]&&pa3[i]>pa4[i])
        {n=c;
            a=-1;
            b=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa4[i]>pa3[i]&&pa2[i]<pa4[i])
        {n=d;
            a=-1;
            c=-1;
            b=-1;
            e=-1;
            break;}
        }}

        else if(b==c&&c==e&&b>a&&b>d)
        {for(int i=5;i>0;i--)
        {if(pa2[i]>pa3[i]&&pa2[i]>pa5[i])
        {n=b;
            a=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa2[i]<pa3[i]&&pa3[i]>pa5[i])
        {n=c;
            a=-1;
            b=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa5[i]>pa3[i]&&pa2[i]<pa5[i])
        {n=e;
            a=-1;
            c=-1;
            b=-1;
            d=-1;
            break;}
        }}

        else if(b==d&&d==e&&b>a&&b>c)
        {for(int i=5;i>0;i--)
        {if(pa2[i]>pa4[i]&&pa2[i]>pa5[i])
        {n=b;
            a=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa2[i]<pa4[i]&&pa4[i]>pa5[i])
        {n=d;
            a=-1;
            b=-1;
            c=-1;
            e=-1;
            break;}
        else if(pa5[i]>pa4[i]&&pa2[i]<pa5[i])
        {n=e;
            a=-1;
            c=-1;
            b=-1;
            d=-1;
            break;}
        }}

        else if(c==d&&d==e&&c>a&&c>b)
        {for(int i=5;i>0;i--)
        {if(pa3[i]>pa4[i]&&pa3[i]>pa5[i])
        {n=c;
            a=-1;
            b=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa3[i]<pa4[i]&&pa4[i]>pa5[i])
        {n=d;
            a=-1;
            b=-1;
            c=-1;
            e=-1;
            break;}
        else if(pa5[i]>pa4[i]&&pa3[i]<pa5[i])
        {n=e;
            a=-1;
            c=-1;
            b=-1;
            d=-1;
            break;}
        }}

        else if(a==b&&b==c&&c==d&&a>e)
        {for(int i=5;i>0;i--)
        {if(pa1[i]>pa3[i]&&pa1[i]>pa2[i]&&pa1[i]>pa4[i])
        {n=a;
            b=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa1[i]<pa3[i]&&pa3[i]>pa2[i]&&pa3[i]>pa4[i])
        {n=c;
            a=-1;
            b=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa2[i]>pa3[i]&&pa1[i]<pa2[i]&&pa2[i]>pa4[i])
        {n=b;
            a=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa4[i]>pa3[i]&&pa1[i]<pa4[i]&&pa2[i]<pa4[i])
        {n=d;
            a=-1;
            c=-1;
            b=-1;
            e=-1;
            break;}
        }}

        else if(a==b&&b==c&&c==e&&a>d)
        {for(int i=5;i>0;i--)
        {if(pa1[i]>pa3[i]&&pa1[i]>pa2[i]&&pa1[i]>pa5[i])
        {n=a;
            b=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa1[i]<pa3[i]&&pa3[i]>pa2[i]&&pa3[i]>pa5[i])
        {n=c;
            a=-1;
            b=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa2[i]>pa3[i]&&pa1[i]<pa2[i]&&pa2[i]>pa5[i])
        {n=b;
            a=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa5[i]>pa3[i]&&pa1[i]<pa5[i]&&pa2[i]<pa5[i])
        {n=e;
            a=-1;
            c=-1;
            b=-1;
            d=-1;
            break;}
        }}

        else if(a==b&&b==e&&a==d&&a>c)
        {for(int i=5;i>0;i--)
        {if(pa1[i]>pa5[i]&&pa1[i]>pa2[i]&&pa1[i]>pa4[i])
        {n=a;
            b=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa1[i]<pa5[i]&&pa5[i]>pa2[i]&&pa5[i]>pa4[i])
        {n=e;
            a=-1;
            b=-1;
            d=-1;
            c=-1;
            break;}
        else if(pa2[i]>pa5[i]&&pa1[i]<pa2[i]&&pa2[i]>pa4[i])
        {n=b;
            a=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa4[i]>pa5[i]&&pa1[i]<pa4[i]&&pa2[i]<pa4[i])
        {n=d;
            a=-1;
            c=-1;
            b=-1;
            e=-1;
            break;}
        }}

        else if(a==c&&e==c&&c==d&&a>b)
        {for(int i=5;i>0;i--)
        {if(pa1[i]>pa3[i]&&pa1[i]>pa5[i]&&pa1[i]>pa4[i])
        {n=a;
            b=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa1[i]<pa3[i]&&pa3[i]>pa5[i]&&pa3[i]>pa4[i])
        {n=c;
            a=-1;
            b=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa5[i]>pa3[i]&&pa1[i]<pa5[i]&&pa5[i]>pa4[i])
        {n=e;
            a=-1;
            c=-1;
            d=-1;
            b=-1;
            break;}
        else if(pa4[i]>pa3[i]&&pa1[i]<pa4[i]&&pa5[i]<pa4[i])
        {n=d;
            a=-1;
            c=-1;
            b=-1;
            e=-1;
            break;}
        }}

        else if(b==c&&e==c&&c==d&&a<b)
        {for(int i=5;i>0;i--)
        {if(pa2[i]>pa3[i]&&pa2[i]>pa5[i]&&pa2[i]>pa4[i])
        {n=b;
            a=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa2[i]<pa3[i]&&pa3[i]>pa5[i]&&pa3[i]>pa4[i])
        {n=c;
            a=-1;
            b=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa5[i]>pa3[i]&&pa2[i]<pa5[i]&&pa5[i]>pa4[i])
        {n=e;
            a=-1;
            c=-1;
            d=-1;
            b=-1;
            break;}
        else if(pa4[i]>pa3[i]&&pa2[i]<pa4[i]&&pa5[i]<pa4[i])
        {n=d;
            a=-1;
            c=-1;
            b=-1;
            e=-1;
            break;}
        }}

        else if(b==c&&e==c&&c==d&&a==b)
        {for(int i=5;i>0;i--)
        {if(pa2[i]>pa3[i]&&pa2[i]>pa5[i]&&pa2[i]>pa4[i]&&pa2[i]>pa1[i])
        {n=b;
            a=-1;
            c=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa2[i]<pa3[i]&&pa3[i]>pa5[i]&&pa3[i]>pa4[i]&&pa3[i]>pa1[i])
        {n=c;
            a=-1;
            b=-1;
            d=-1;
            e=-1;
            break;}
        else if(pa5[i]>pa3[i]&&pa2[i]<pa5[i]&&pa5[i]>pa4[i]&&pa5[i]>pa1[i])
        {n=e;
            a=-1;
            c=-1;
            d=-1;
            b=-1;
            break;}
        else if(pa4[i]>pa3[i]&&pa2[i]<pa4[i]&&pa5[i]<pa4[i]&&pa4[i]>pa1[i])
        {n=d;
            a=-1;
            c=-1;
            b=-1;
            e=-1;
            break;}
        else if(pa1[i]>pa3[i]&&pa2[i]<pa1[i]&&pa5[i]<pa1[i]&&pa4[i]<pa1[i])
        {n=a;
            d=-1;
            c=-1;
            b=-1;
            e=-1;
            break;}
        }}
        Button p1=(Button)findViewById(R.id.p1);
        Button p2=(Button)findViewById(R.id.p7);
        Button p3=(Button)findViewById(R.id.p8);
        Button p4=(Button)findViewById(R.id.p6);
        Button p5=(Button)findViewById(R.id.p9);
        Button pag=(Button)findViewById(R.id.paggain);

        pag.setVisibility(View.INVISIBLE);
        TextView t00=findViewById(R.id.stv);
        TextView t11=findViewById(R.id.ttv);
        t11.setVisibility(View.INVISIBLE);

        t00.setText(Integer.toString(scoreadv.score)+" "+Integer.toString(scoreadv.count));













        int a1=a;
        int b1=b;
        int c1=c;
        int d1=d;
        int e1=e;

        if(n==0)
        {n=a;}


        int y=n;





        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setAlpha(0.7F);
                p3.setAlpha(0.7F);
                p2.setEnabled(false);
                p3.setEnabled(false);
                p4.setAlpha(0.7F);
                p5.setAlpha(0.7F);
                p4.setEnabled(false);
                p5.setEnabled(false);
                if(y==a1)
                {scoreadv.score++;
                    Toast.makeText(getApplicationContext(),"YOU ARE RIGHT PLAYER 1 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();
                }
                else
                {if(y==c1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 3 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}
                else if(y==b1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 2 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}
                else if(y==d1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 4 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}
                else if(y==e1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 5 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}}
                scoreadv.count++;
                t00.setText(Integer.toString(scoreadv.score)+" "+Integer.toString(scoreadv.count));
               if(scoreadv.count<15)
               {openam();}
               else if(scoreadv.count==15)
               {pag.setVisibility(View.VISIBLE);

                   pag.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           openstrtprac();
                       }
                   });
                   t11.setVisibility(View.VISIBLE);
                   t11.setText("TOT="+Integer.toString(scoreadv.score)+"/"+Integer.toString(scoreadv.count));
                   scoreadv.score=0;
                   scoreadv.count=0;
                   p1.setEnabled(false);}


            }
        });


        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setAlpha(0.7F);
                p3.setAlpha(0.7F);
                p1.setEnabled(false);
                p3.setEnabled(false);
                p4.setAlpha(0.7F);
                p5.setAlpha(0.7F);
                p4.setEnabled(false);
                p5.setEnabled(false);
                if(y==b1)
                {scoreadv.score++;
                    Toast.makeText(getApplicationContext(),"YOU ARE RIGHT PLAYER 2 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();
                }
                else
                {if(y==c1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 3 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}
                else if(y==a1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 1 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}
                else if(y==d1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 4 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}
                else if(y==e1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 5 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}}

                scoreadv.count++;
                t00.setText(Integer.toString(scoreadv.score)+" "+Integer.toString(scoreadv.count));

                if(scoreadv.count<15)
                {openam();}
                else if(scoreadv.count==15)
                {pag.setVisibility(View.VISIBLE);

                    pag.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openstrtprac();
                        }
                    });
                    t11.setVisibility(View.VISIBLE);
                    t11.setText("TOT="+Integer.toString(scoreadv.score)+"/"+Integer.toString(scoreadv.count));
                    scoreadv.score=0;
                    scoreadv.count=0;
                    p2.setEnabled(false);}

            }
        });


        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setAlpha(0.7F);
                p1.setAlpha(0.7F);
                p2.setEnabled(false);
                p1.setEnabled(false);
                p4.setAlpha(0.7F);
                p5.setAlpha(0.7F);
                p4.setEnabled(false);
                p5.setEnabled(false);
                if(y==c1)
                {scoreadv.score++;
                    Toast.makeText(getApplicationContext(),"YOU ARE RIGHT PLAYER 3 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();
                }
                else
                {if(y==a1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 1 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}
                else if(y==b1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 2 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}
                else if(y==d1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 4 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}
                else if(y==e1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 5 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}}

                scoreadv.count++;
                t00.setText(Integer.toString(scoreadv.score)+" "+Integer.toString(scoreadv.count));
                if(scoreadv.count<15)
                {openam();}
                else if(scoreadv.count==15)
                {pag.setVisibility(View.VISIBLE);

                    pag.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openstrtprac();
                        }
                    });
                    t11.setVisibility(View.VISIBLE);
                    t11.setText("TOT="+Integer.toString(scoreadv.score)+"/"+Integer.toString(scoreadv.count));
                    scoreadv.score=0;
                    scoreadv.count=0;
                    p3.setEnabled(false);}


            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setAlpha(0.7F);
                p3.setAlpha(0.7F);
                p2.setEnabled(false);
                p3.setEnabled(false);
                p1.setAlpha(0.7F);
                p5.setAlpha(0.7F);
                p1.setEnabled(false);
                p5.setEnabled(false);
                if(y==d1)
                {scoreadv.score++;
                    Toast.makeText(getApplicationContext(),"YOU ARE RIGHT PLAYER 4 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();
                }
                else
                {if(y==c1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 3 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}
                else if(y==b1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 2 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}
                else if(y==a1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 1 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}
                else if(y==e1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 5 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}}

                scoreadv.count++;
                t00.setText(Integer.toString(scoreadv.score)+" "+Integer.toString(scoreadv.count));

                if(scoreadv.count<15)
                {openam();}
                else if(scoreadv.count==15)
                {pag.setVisibility(View.VISIBLE);

                    pag.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openstrtprac();
                        }
                    });
                    t11.setVisibility(View.VISIBLE);
                    t11.setText("TOT="+Integer.toString(scoreadv.score)+"/"+Integer.toString(scoreadv.count));
                    scoreadv.score=0;
                    scoreadv.count=0;
                    p4.setEnabled(false);}
            }
        });

        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setAlpha(0.7F);
                p3.setAlpha(0.7F);
                p2.setEnabled(false);
                p3.setEnabled(false);
                p4.setAlpha(0.7F);
                p1.setAlpha(0.7F);
                p4.setEnabled(false);
                p1.setEnabled(false);
                if(y==e1)
                {scoreadv.score++;
                    Toast.makeText(getApplicationContext(),"YOU ARE RIGHT PLAYER 5 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();
                }
                else
                {if(y==c1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 3 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}
                else if(y==b1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 2 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}
                else if(y==d1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 4 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}
                else if(y==a1)
                {Toast.makeText(getApplicationContext(),"YOU ARE WRONG PLAYER 1 HAS THE BEST HAND", Toast.LENGTH_SHORT).show();}}

                scoreadv.count++;
                t00.setText(Integer.toString(scoreadv.score)+" "+Integer.toString(scoreadv.count));
                if(scoreadv.count<15)
                {openam();}
                else if(scoreadv.count==15)
                {pag.setVisibility(View.VISIBLE);

                    pag.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openstrtprac();
                        }
                    });
                    t11.setVisibility(View.VISIBLE);
                    t11.setText("TOT="+Integer.toString(scoreadv.score)+"/"+Integer.toString(scoreadv.count));
                    scoreadv.score=0;
                    scoreadv.count=0;
                    p5.setEnabled(false);}


            }
        });











    }


    public void openam()
    {
        Intent intent=new Intent(this,advcd.class);
        startActivity(intent);}
    public void openstrtprac()
    {
        Intent intent=new Intent(this,strtprac.class);
        startActivity(intent);}

    int[] getp(int c1, int c2, int a, int b, int c, int d, int e)
    {int n1[]    = getmp(c1,b,c,d,e);
        n1=maxp(n1,getmp(a,c1,c,d,e));
        n1=maxp(n1,getmp(a,b,c1,d,e));
        n1=maxp(n1,getmp(a,b,c,c1,e));
        n1=maxp(n1,getmp(a,b,c,d,c1));
        n1=maxp(n1,getmp(c2,b,c,d,e));
        n1=maxp(n1,getmp(a,c2,c,d,e));
        n1=maxp(n1,getmp(a,b,c2,d,e));
        n1=maxp(n1,getmp(a,b,c,c2,e));
        n1=maxp(n1,getmp(a,b,c,d,c2));
        n1=maxp(n1,getmp(a,b,c,c1,c2));
        n1=maxp(n1,getmp(a,b,d,c1,c2));
        n1=maxp(n1,getmp(a,b,e,c1,c2));
        n1=maxp(n1,getmp(a,c,d,c1,c2));
        n1=maxp(n1,getmp(a,c,e,c1,c2));
        n1=maxp(n1,getmp(a,d,e,c1,c2));
        n1=maxp(n1,getmp(b,c,d,c1,c2));
        n1=maxp(n1,getmp(b,c,e,c1,c2));
        n1=maxp(n1,getmp(b,d,e,c1,c2));
        n1=maxp(n1,getmp(c,d,e,c1,c2));
        n1=maxp(n1,getmp(b,d,e,c,a));

        return n1;}

    int[] maxp(int n[], int p[]) {
        int n1[];
        int a=n[0];
        int b=p[0];
        int a1=n[0];
        int b1=p[0];
        if(a>b)
        {return n1=n;}
        else if(a<b)
        {return n1=p;}
        else if(a==b)
        {for(int i=5;i>0;i--)
        {if(n[i]>p[i])
        {return n;}
        else if(n[i]<p[i])
        {return p;}}}

        return n1=n;
    }

    private int[] getmp(int a, int b, int c, int d, int e) {
        int pa[] = {0, a, b, c, d, e};
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5 - i; j++) {
                if (pa[j] % 13 > pa[j + 1] % 13) {
                    int t = pa[j];
                    pa[j] = pa[j + 1];
                    pa[j + 1] = t;
                }
            }
        }
        String crds[]={"c2","c3","c4","c5","c6","c7","c8","c9","ct","cj","cq","ck","ca",
                "d2","d3","d4","d5","d6","d7","d8","d9","dt","dj","dq","dk","da",
                "h2","h3","h4","h5","h6","h7","h8","h9","ht","hj","hq","hk","ha",
                "s2","s3","s4","s5","s6","s7","s8","s9","st","sj","sq","sk","sa"};
        String s1 = crds[pa[1]];
        String s2 = crds[pa[2]];
        String s3 = crds[pa[3]];
        String s4 = crds[pa[4]];
        String s5 = crds[pa[5]];
        if (s1.charAt(0) == s2.charAt(0) && s1.charAt(0) == s3.charAt(0) && s1.charAt(0) == s4.charAt(0) && s1.charAt(0) == s5.charAt(0)) {//royalflush
            if (s1.charAt(1) == 't' && s2.charAt(1) == 'j' && s3.charAt(1) == 'q' && s4.charAt(1) == 'k' && s5.charAt(1) == 'a') {
                pa[0] = 10;
            }

            //straightflush
            else if (pa[1] + 1 == pa[2] && pa[2] + 1 == pa[3] && pa[3] + 1 == pa[4] && (pa[4] + 1 == pa[5] || pa[1] + 12 == pa[5])) {
                pa[0] = 9;
            }

            //flush
            else {
                pa[0] = 6;
            }
        }


        else if ((s1.charAt(1) == s2.charAt(1) && s1.charAt(1) == s3.charAt(1) && s1.charAt(1) == s4.charAt(1)) || (s1.charAt(1) == s2.charAt(1) && s1.charAt(1) == s3.charAt(1) && s1.charAt(1) == s5.charAt(1)) || (s1.charAt(1) == s2.charAt(1) && s1.charAt(1) == s5.charAt(1) && s1.charAt(1) == s4.charAt(1)) || (s1.charAt(1) == s5.charAt(1) && s1.charAt(1) == s3.charAt(1) && s1.charAt(1) == s4.charAt(1)) || (s5.charAt(1) == s2.charAt(1) && s5.charAt(1) == s3.charAt(1) && s5.charAt(1) == s4.charAt(1))) {//four of a kind
            pa[0] = 8;
        }


        else if ((s5.charAt(1) == s4.charAt(1) && s1.charAt(1) == s2.charAt(1) && s1.charAt(1) == s3.charAt(1)) || (s5.charAt(1) == s3.charAt(1) && s1.charAt(1) == s2.charAt(1) && s1.charAt(1) == s4.charAt(1)) || (s5.charAt(1) == s2.charAt(1) && s1.charAt(1) == s4.charAt(1) && s1.charAt(1) == s3.charAt(1)) || (s5.charAt(1) == s1.charAt(1) && s4.charAt(1) == s2.charAt(1) && s4.charAt(1) == s3.charAt(1)) || (s3.charAt(1) == s4.charAt(1) && s1.charAt(1) == s2.charAt(1) && s1.charAt(1) == s5.charAt(1)) || (s2.charAt(1) == s4.charAt(1) && s1.charAt(1) == s5.charAt(1) && s1.charAt(1) == s3.charAt(1)) || (s1.charAt(1) == s4.charAt(1) && s5.charAt(1) == s2.charAt(1) && s5.charAt(1) == s3.charAt(1)) || (s3.charAt(1) == s2.charAt(1) && s1.charAt(1) == s4.charAt(1) && s1.charAt(1) == s5.charAt(1)) || (s3.charAt(1) == s1.charAt(1) && s5.charAt(1) == s2.charAt(1) && s5.charAt(1) == s4.charAt(1)) || (s2.charAt(1) == s1.charAt(1) && s4.charAt(1) == s5.charAt(1) && s4.charAt(1) == s3.charAt(1))) {//full house
            pa[0] = 7;
        }


        else if ((pa[1] + 1) % 13 == pa[2] % 13 && (pa[2] + 1) % 13 == pa[3] % 13 && (pa[3] + 1) % 13 == pa[4] % 13 && (((pa[4] + 1) % 13 == pa[5] % 13) || (pa[1] % 13) + 12 == pa[5] % 13)) {//straight
            pa[0] = 5;
        }


        else if ((s1.charAt(1) == s2.charAt(1) && s1.charAt(1) == s3.charAt(1)) || (s1.charAt(1) == s2.charAt(1) && s1.charAt(1) == s4.charAt(1)) || (s1.charAt(1) == s4.charAt(1) && s1.charAt(1) == s3.charAt(1)) || (s4.charAt(1) == s2.charAt(1) && s4.charAt(1) == s3.charAt(1)) || (s1.charAt(1) == s2.charAt(1) && s1.charAt(1) == s5.charAt(1)) || (s1.charAt(1) == s5.charAt(1) && s1.charAt(1) == s3.charAt(1)) || (s5.charAt(1) == s2.charAt(1) && s5.charAt(1) == s3.charAt(1)) || (s1.charAt(1) == s4.charAt(1) && s1.charAt(1) == s5.charAt(1)) || (s5.charAt(1) == s2.charAt(1) && s5.charAt(1) == s4.charAt(1)) || (s4.charAt(1) == s5.charAt(1) && s4.charAt(1) == s3.charAt(1))) {//threeofakind
            pa[0] = 4;
        }

        else if ((s1.charAt(1) == s2.charAt(1) && s3.charAt(1) == s4.charAt(1)) || (s1.charAt(1) == s3.charAt(1) && s2.charAt(1) == s4.charAt(1)) || (s1.charAt(1) == s4.charAt(1) && s3.charAt(1) == s2.charAt(1)) || (s1.charAt(1) == s2.charAt(1) && s3.charAt(1) == s5.charAt(1)) || (s1.charAt(1) == s5.charAt(1) && s3.charAt(1) == s2.charAt(1)) || (s1.charAt(1) == s3.charAt(1) && s2.charAt(1) == s5.charAt(1)) || (s1.charAt(1) == s2.charAt(1) && s4.charAt(1) == s5.charAt(1)) || (s1.charAt(1) == s4.charAt(1) && s2.charAt(1) == s5.charAt(1)) || (s1.charAt(1) == s5.charAt(1) && s2.charAt(1) == s4.charAt(1)) || (s1.charAt(1) == s3.charAt(1) && s5.charAt(1) == s4.charAt(1)) || (s1.charAt(1) == s4.charAt(1) && s3.charAt(1) == s5.charAt(1)) || (s1.charAt(1) == s5.charAt(1) && s3.charAt(1) == s4.charAt(1)) || (s3.charAt(1) == s2.charAt(1) && s5.charAt(1) == s4.charAt(1)) || (s4.charAt(1) == s2.charAt(1) && s3.charAt(1) == s5.charAt(1)) || (s5.charAt(1) == s2.charAt(1) && s3.charAt(1) == s4.charAt(1))) {//twopair
            pa[0] = 3;
        }


        else if ((s5.charAt(1) == s4.charAt(1)) || (s5.charAt(1) == s3.charAt(1)) || (s5.charAt(1) == s2.charAt(1)) || (s5.charAt(1) == s1.charAt(1)) || (s3.charAt(1) == s4.charAt(1)) || (s2.charAt(1) == s4.charAt(1)) || (s1.charAt(1) == s4.charAt(1)) || (s3.charAt(1) == s2.charAt(1)) || (s3.charAt(1) == s1.charAt(1)) || (s2.charAt(1) == s1.charAt(1))) {//1-pair
            pa[0] = 2;
        }


        else {
            pa[0] = 1;
        }
        for (int i = 1; i < 6; i++)
        {pa[i]=pa[i]%13;}

        return pa;

    }

}