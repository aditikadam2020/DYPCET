package com.example.dypcet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.dypcet.databinding.ActivityRegistrationBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegistrationActivity extends AppCompatActivity {

    EditText ed_name,ed_email,ed_phone,ed_state,ed_city,ed_password,ed_usertype;

    final String PASSWORD_PATTERN = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
    final String EMAIL_PATTERN = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    String name,email,phone,state,city,password,group,usertype;
    FirebaseAuth firebaseAuth;
    ActivityRegistrationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegistrationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setViewsUI();
        firebaseAuth   = FirebaseAuth.getInstance();

        binding.logText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
                finish();
            }
        });

        binding.signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isValid()){
                    String name = binding.name.getText().toString();
                    String email = binding.email.getText().toString();
                    String phone = binding.phonenumber.getText().toString();
                    String state = binding.state.getText().toString();
                    String city = binding.city.getText().toString();
                    String password = binding.password.getText().toString();
                    String group = binding.group.getText().toString();
                    String usertype = binding.UserType.getText().toString();
                    createAccount(name, email, phone, state, city, password,group,usertype);

                }
            }
        });
    }

    private void createAccount(String name, String email, String phone, String state, String city, String password,String group,String usertype) {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Creating");
        progressDialog.setMessage("Account");
        progressDialog.show();
        firebaseAuth.createUserWithEmailAndPassword(email.trim(), password.trim())
                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        sendUserData( name,  email,  phone,  state,  city,  password, group, usertype);
                        UserProfileChangeRequest profileChangeRequest = new UserProfileChangeRequest.Builder()
                                .setDisplayName(name).build();
                        FirebaseAuth.getInstance().getCurrentUser().updateProfile(profileChangeRequest);
                        progressDialog.cancel();
                        Toast.makeText(RegistrationActivity.this, "Account Created", Toast.LENGTH_SHORT);
                        binding.name.setText("");
                        binding.email.setText("");
                        binding.phonenumber.setText("");
                        binding.state.setText("");
                        binding.city.setText("");
                        binding.group.setText("");
                        binding.password.setText("");
                        binding.UserType.setText("");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(RegistrationActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void sendUserData(String name, String email, String phone, String state, String city, String password,String group, String usertype)                                                                                                                                                        // User data sending
    {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference DBref = firebaseDatabase.getReference(firebaseAuth.getUid());//uid = userid on server is used to retrieve his info only
        Users usr = new Users(name,email,phone,state,city,password,group,usertype);
        DBref.setValue(usr).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(RegistrationActivity.this, "Registered Successful", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
                            finish();
                        }
                        else {
                            Toast.makeText(RegistrationActivity.this, "Registration Failed !! try again !!", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        System.out.println(e.getMessage());
                    }
                });
    }

    private void setViewsUI(){
        ed_name = findViewById(R.id.name);
        ed_email = findViewById(R.id.email);
        ed_phone = findViewById(R.id.phonenumber);
        ed_state = findViewById(R.id.state);
        ed_city = findViewById(R.id.city);
        ed_password = findViewById(R.id.password);
        ed_usertype = findViewById(R.id.UserType);
    }

    private boolean isValid(){
        boolean isValid = false;
        name = ed_name.getText().toString();                                                                                                                            //Passing strings to variables
        email = ed_email.getText().toString();
        password = ed_password.getText().toString();
        phone = ed_phone.getText().toString();
        state = ed_state.getText().toString();
        city = ed_city.getText().toString();
        usertype = ed_usertype.getText().toString();
        if(name.isEmpty()){
            ed_name.setHint("Please enter name");
            ed_name.setError("Please enter name");
        }
        else if (email.isEmpty()||!email.matches(EMAIL_PATTERN)){
            ed_email.setError("Please Enter valid email");
            ed_email.setHint("Please Enter valid email");
        }
        else if(password.isEmpty()||!password.matches(PASSWORD_PATTERN)){
            ed_password.setError("Please enter valid password");
            ed_password.setHint("Please enter valid password");
        }

        else if(phone.length() != 10) {
            ed_phone.setError("Enter valid phone number");
            ed_phone.setHint("Enter valid phone number");
        }
        else if (state.isEmpty()){
            ed_state.setHint("Please enter state");
            ed_state.setError("Please enter state");
        }
        else if (city.isEmpty()){
            ed_city.setHint("Please enter city");
            ed_city.setError("Please enter city");
        }
        else if (usertype.isEmpty()){
            ed_usertype.setHint("Please enter usertype");
            ed_usertype.setError("Please enter usertype");
        }
        else {
            isValid = true;
        }
        return isValid;
    }

}