package com.example.dypcet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.dypcet.models.MockTest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

public class Mock4Activity extends AppCompatActivity {
    ImageView iv;

    CardView cd_p,cd_pcm;
    CardView cd_c;
    CardView cd_m;

    MockTest mockTest = new MockTest();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock4);
        iv=findViewById(R.id.back);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mock4Activity.this, CetMockActivity.class);
                startActivity(intent);
            }
        });

        getMockTests();

        cd_p=findViewById(R.id.physics);
        cd_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = mockTest.getPhysics();
                if (url != null)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Mock4Activity.this,"Something is wrong.. please choose press the button again..!!",Toast.LENGTH_LONG).show();
                }
            }
        });

        cd_c=findViewById(R.id.chemistry);
        cd_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = mockTest.getChemistry();
                if (url != null)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Mock4Activity.this,"Something is wrong.. please choose press the button again..!!",Toast.LENGTH_LONG).show();
                }            }
        });

        cd_m=findViewById(R.id.maths);
        cd_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = mockTest.getMathematics();
                if (url != null)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Mock4Activity.this,"Something is wrong.. please choose press the button again..!!",Toast.LENGTH_LONG).show();
                }

            }
        });
        cd_pcm=findViewById(R.id.pcm);
        cd_pcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = mockTest.getPhysics();
                if (url != null)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Mock4Activity.this,"Something is wrong.. please choose press the button again..!!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private void getMockTests() {
        FirebaseFirestore.getInstance().collection("mockTests").document("mockTest4").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful())
                {
                    DocumentSnapshot documentSnapshot = task.getResult();
                    if (documentSnapshot.exists())
                    {
                        mockTest =documentSnapshot.toObject(MockTest.class);
                    }
                }

            }
        });
    }
}