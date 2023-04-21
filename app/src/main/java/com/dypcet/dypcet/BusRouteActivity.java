package com.dypcet.dypcet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BusRouteActivity extends AppCompatActivity {
    ImageView iv;
    TextView tv_sangli,tv_ichal,tv_kuditre,tv_kagal,tv_bhogavati,tv_gargoti,tv_ashta,tv_hupri,tv_vashinaka,tv_ssc,tv_kalamba,tv_fulewadi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_route);
        iv=findViewById(R.id.back);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusRouteActivity.this,DashBoardActivity.class);
                startActivity(intent);
            }
        });


        tv_sangli = findViewById(R.id.sangli);
        tv_sangli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusRouteActivity.this,SangliActivity.class);
                startActivity(intent);
            }
        });

        tv_kalamba = findViewById(R.id.kalamba);
        tv_kalamba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusRouteActivity.this,KalambaActivity.class);
                startActivity(intent);
            }
        });

        tv_fulewadi = findViewById(R.id.fulewadi);
        tv_fulewadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusRouteActivity.this,FulewadiActivity.class);
                startActivity(intent);
            }
        });

        tv_ichal=findViewById(R.id.ichalkaranji);
        tv_ichal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusRouteActivity.this,IchalkaranjiActivity.class);
                startActivity(intent);
            }
        });

        tv_kuditre=findViewById(R.id.kuditre);
        tv_kuditre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusRouteActivity.this,KuditreActivity.class);
                startActivity(intent);
            }
        });



        tv_kagal=findViewById(R.id.kagal);
        tv_kagal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusRouteActivity.this,KagalActivity.class);
                startActivity(intent);
            }
        });

        tv_bhogavati=findViewById(R.id.bhogavati);
        tv_bhogavati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusRouteActivity.this,BhogavatiActivity.class);
                startActivity(intent);
            }
        });

        tv_gargoti=findViewById(R.id.gargoti);
        tv_gargoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusRouteActivity.this,GargotiActivity.class);
                startActivity(intent);
            }
        });

        tv_hupri=findViewById(R.id.hupri);
        tv_hupri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusRouteActivity.this,HupriActivity.class);
                startActivity(intent);
            }
        });

        tv_ashta=findViewById(R.id.ashta);
        tv_ashta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusRouteActivity.this,AshtaActivity.class);
                startActivity(intent);
            }
        });

        tv_vashinaka=findViewById(R.id.vashinaka);
        tv_vashinaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusRouteActivity.this,VashinakaActivity.class);
                startActivity(intent);
            }
        });

        tv_ssc=findViewById(R.id.sscBoard);
        tv_ssc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusRouteActivity.this,SscBoardActivity.class);
                startActivity(intent);
            }
        });

    }
}