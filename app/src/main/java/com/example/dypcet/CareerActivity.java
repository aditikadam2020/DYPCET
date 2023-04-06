package com.example.dypcet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CareerActivity extends AppCompatActivity {

    ImageView iv;
    Button btn_archi;
    Button btn_chem;
    Button btn_civil;
    Button btn_cse;
    Button btn_mech;
    Button btn_entc;
    Button btn_ds;
    Button btn_aiml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career);
        iv=findViewById(R.id.back);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CareerActivity.this,DashBoardActivity.class);
                startActivity(intent);
            }
        });

        //architecture
        btn_archi=findViewById(R.id.architecture);
        btn_archi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CareerActivity.this, ArchitectureActivity.class);
                startActivity(intent);
            }
        });

        //chemical
        btn_chem=findViewById(R.id.chemical);
        btn_chem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CareerActivity.this, ChemicalActivity.class);
                startActivity(intent);
            }
        });

        //civil
        btn_civil=findViewById(R.id.civil);
        btn_civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CareerActivity.this, CivilActivity.class);
                startActivity(intent);
            }
        });

        //cse
        btn_cse=findViewById(R.id.cse);
        btn_cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CareerActivity.this, CseActivity.class);
                startActivity(intent);
            }
        });

        //mechanical
        btn_mech=findViewById(R.id.mechanical);
        btn_mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CareerActivity.this, MechanicalActivity.class);
                startActivity(intent);
            }
        });

        //entc
        btn_entc=findViewById(R.id.entc);
        btn_entc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CareerActivity.this, EntcActivity.class);
                startActivity(intent);
            }
        });

        //ds
        btn_ds=findViewById(R.id.ds);
        btn_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CareerActivity.this, DsActivity.class);
                startActivity(intent);
            }
        });

        //aiml
        btn_aiml=findViewById(R.id.aiml);
        btn_aiml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CareerActivity.this, Ai_MlActivity.class);
                startActivity(intent);
            }
        });
    }
}