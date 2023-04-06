package com.example.dypcet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SampleDocActivity extends AppCompatActivity {
    TextView tv_income,tv_caste_validity,tv_caste,tv_domicile,tv_noncreme,tv_ews,tv_typec,tv_typed_1,tv_typed_2,tv_g1_g2;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_doc);

        iv=findViewById(R.id.back);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SampleDocActivity.this, DocumentActivity.class);
                startActivity(intent);
            }
        });

        tv_income=findViewById(R.id.income);
        tv_income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SampleDocActivity.this, IncomeCertificateActivity.class);
                startActivity(intent);
            }
        });

        tv_caste_validity=findViewById(R.id.casteValid);
        tv_caste_validity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SampleDocActivity.this, CasteValidityActivity.class);
                startActivity(intent);
            }
        });

        tv_caste=findViewById(R.id.caste);
        tv_caste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SampleDocActivity.this, CasteActivity.class);
                startActivity(intent);
            }
        });

        tv_domicile=findViewById(R.id.domicile);
        tv_domicile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SampleDocActivity.this, DomicileActivity.class);
                startActivity(intent);
            }
        });

        tv_noncreme=findViewById(R.id.noncreme);
        tv_noncreme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SampleDocActivity.this, NonCremeLayerActivity.class);
                startActivity(intent);
            }
        });

        tv_ews=findViewById(R.id.ews);
        tv_ews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SampleDocActivity.this, EwsCertificateActivity.class);
                startActivity(intent);
            }
        });

        tv_typec=findViewById(R.id.typeC);
        tv_typec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SampleDocActivity.this, TypeCProformaActivity.class);
                startActivity(intent);
            }
        });

        tv_typed_1=findViewById(R.id.typeD_1);
        tv_typed_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SampleDocActivity.this, ProformaB1Activity.class);
                startActivity(intent);
            }
        });

        tv_typed_2=findViewById(R.id.typeD_2);
        tv_typed_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SampleDocActivity.this, ProformaB2Activity.class);
                startActivity(intent);
            }
        });

        tv_g1_g2=findViewById(R.id.typeE);
        tv_g1_g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SampleDocActivity.this, G1G2Activity.class);
                startActivity(intent);
            }
        });
    }
}