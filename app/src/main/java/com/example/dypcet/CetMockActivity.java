package com.example.dypcet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;
import android.widget.ListView;

public class CetMockActivity extends AppCompatActivity {
    ImageView iv;
    CardView mock1;
    CardView mock2;
    CardView mock3;
    CardView mock4;
    CardView mock5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cet_mock);
        iv=findViewById(R.id.back);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CetMockActivity.this,DashBoardActivity.class);
                startActivity(intent);
            }
        });

        mock1=findViewById(R.id.mock1);
        mock1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CetMockActivity.this,Mock1Activity.class);
                startActivity(intent);
            }
        });

        mock2=findViewById(R.id.mock2);
        mock2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CetMockActivity.this,Mock2Activity.class);
                startActivity(intent);
            }
        });

        mock3=findViewById(R.id.mock3);
        mock3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CetMockActivity.this,Mock3Activity.class);
                startActivity(intent);
            }
        });

        mock4=findViewById(R.id.mock4);
        mock4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CetMockActivity.this,Mock4Activity.class);
                startActivity(intent);
            }
        });

        mock5=findViewById(R.id.mock5);
        mock5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CetMockActivity.this,Mock5Activity.class);
                startActivity(intent);
            }
        });
    }
}