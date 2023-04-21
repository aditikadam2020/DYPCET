package com.dypcet.dypcet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DocumentActivity extends AppCompatActivity {

    ImageView iv;
    TextView tv_open;
    TextView tv_ebc;
    TextView tv_tfws;
    TextView tv_ScSt;
    TextView tv_obc;
    TextView tv_SbcVjNt;
    TextView tv_ews;
    TextView tv_type_c;
    TextView tv_type_d;
    TextView tv_type_e;

    CardView cd;
    CardView cd_sampledoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document);
        iv=findViewById(R.id.back);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentActivity.this,DashBoardActivity.class);
                startActivity(intent);
            }
        });

        //open category
        tv_open=findViewById(R.id.open);
        tv_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentActivity.this,OpenActivity.class);
                startActivity(intent);
            }
        });

        //ebc category
        tv_ebc=findViewById(R.id.ebc);
        tv_ebc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentActivity.this,EbcActivity.class);
                startActivity(intent);
            }
        });

        //tfws category
        tv_tfws=findViewById(R.id.tfws);
        tv_tfws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentActivity.this,TfwsActivity.class);
                startActivity(intent);
            }
        });

        //scst category
        tv_ScSt=findViewById(R.id.scst);
        tv_ScSt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentActivity.this,ScStActivity.class);
                startActivity(intent);
            }
        });

        //obc category
        tv_obc=findViewById(R.id.obc);
        tv_obc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentActivity.this,ObcActivity.class);
                startActivity(intent);
            }
        });

        //sbc_vj_nt category
        tv_SbcVjNt=findViewById(R.id.sbc_vj_nt);
        tv_SbcVjNt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentActivity.this, SbcVjNtActivity.class);
                startActivity(intent);
            }
        });

        //ews category
        tv_ews=findViewById(R.id.ews);
        tv_ews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentActivity.this, EwsActivity.class);
                startActivity(intent);
            }
        });

        //TYPE-C category
        tv_type_c=findViewById(R.id.type_c);
        tv_type_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentActivity.this, CTypeActivity.class);
                startActivity(intent);
            }
        });

        //TYPE-D category
        tv_type_d=findViewById(R.id.type_d);
        tv_type_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentActivity.this, DTypeActivity.class);
                startActivity(intent);
            }
        });

        //TYPE-E category
        tv_type_e=findViewById(R.id.type_e);
        tv_type_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentActivity.this, ETypeActivity.class);
                startActivity(intent);
            }
        });

        //find document
        cd=findViewById(R.id.find);
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentActivity.this, FindDocumentActivity.class);
                startActivity(intent);
            }
        });

        cd_sampledoc = findViewById(R.id.docsample);
        cd_sampledoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentActivity.this, SampleDocActivity.class);
                startActivity(intent);
            }
        });

    }
}