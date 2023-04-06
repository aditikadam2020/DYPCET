package com.example.dypcet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dypcet.databinding.ActivityProfileBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ProfileActivity extends AppCompatActivity {

    ActivityProfileBinding binding;
    TextView getname,getemail,getphone,getstate,getcity,getgroup;
    ImageView iv;
    Button btn;

    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    DatabaseReference DBref = firebaseDatabase.getReference(firebaseAuth.getUid());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Toast.makeText(ProfileActivity.this, "Your Data is Loading... Please Wait for a while",Toast.LENGTH_SHORT).show();

        setUI();
        getUserData();

        iv=findViewById(R.id.back);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, DashBoardActivity.class));
                finish();
            }
        });


        btn=findViewById(R.id.logout);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(ProfileActivity.this, "logout successfully", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ProfileActivity.this,LoginActivity.class));
            }
        });
    }

    private void setUI() {
        binding.getname.findViewById(R.id.getname);
        binding.getemail.findViewById(R.id.getemail);
        binding.getphone.findViewById(R.id.getphone);
        binding.getstate.findViewById(R.id.getstate);
        binding.getcity.findViewById(R.id.getcity);
        binding.getgroup.findViewById(R.id.getgroup);
    }

    private void getUserData()                                                                                                                                                        // User data sending
    {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference DBref = firebaseDatabase.getReference(firebaseAuth.getUid());//uid = userid on server is used to retrieve his info only
        DBref.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                Users users = snapshot.getValue(Users.class);
                binding.getname.setText(users.getName());
                binding.getemail.setText(users.getEmail());
                binding.getphone.setText(users.getPhonenumber());
                binding.getstate.setText(users.getState());
                binding.getcity.setText(users.getCity());
                binding.getgroup.setText(users.getGroup());

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ProfileActivity.this, error.getCode(),Toast.LENGTH_SHORT).show();
            }
        });
    }

}