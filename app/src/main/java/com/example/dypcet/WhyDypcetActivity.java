package com.example.dypcet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WhyDypcetActivity extends AppCompatActivity {

    ImageView iv;
    CardView cd_virtual,cd_club,cd_nss,cd_ncc,cd_foreign,cd_gdsc,cd_rotract,cd_culture;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_why_dypcet);
        iv=findViewById(R.id.back);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WhyDypcetActivity.this,DashBoardActivity.class);
                startActivity(intent);
            }
        });

        cd_virtual=findViewById(R.id.virtual_tour);
        cd_virtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://youtu.be/CcEccQElTR0";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        cd_club=findViewById(R.id.club);
        cd_club.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WhyDypcetActivity.this,ClubActivity.class);
                startActivity(intent);
            }
        });

        cd_nss=findViewById(R.id.nss);
        cd_nss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WhyDypcetActivity.this,NssActivity.class);
                startActivity(intent);
            }
        });

        cd_ncc=findViewById(R.id.ncc);
        cd_ncc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WhyDypcetActivity.this,NccActivity.class);
                startActivity(intent);
            }
        });

        cd_foreign=findViewById(R.id.foreign);
        cd_foreign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WhyDypcetActivity.this,ForeignLanguageActivity.class);
                startActivity(intent);
            }
        });

        cd_gdsc=findViewById(R.id.gdsc);
        cd_gdsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WhyDypcetActivity.this,GdscActivity.class);
                startActivity(intent);
            }
        });

        cd_rotract=findViewById(R.id.rotract);
        cd_rotract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WhyDypcetActivity.this,RotractActivity.class);
                startActivity(intent);
            }
        });

        cd_culture=findViewById(R.id.cultural);
        cd_culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(WhyDypcetActivity.this,CulturalActivity.class);
                startActivity(intent);
            }
        });

    }
}