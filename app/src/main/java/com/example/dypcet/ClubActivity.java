package com.example.dypcet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.dypcet.databinding.ActivityClubBinding;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

public class ClubActivity extends AppCompatActivity {
    ActivityClubBinding binding;

    ImageView iv;
    CardView cd_handf;
    CardView cd_highedu;
    CardView cd_photo;
    CardView cd_code;
    CardView cd_adventure;
    CardView cd_robo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityClubBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        slider();

        iv=findViewById(R.id.back);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubActivity.this,WhyDypcetActivity.class);
                startActivity(intent);
            }
        });

        cd_handf=findViewById(R.id.HandF);
        cd_handf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubActivity.this, HealthFitnessActivity.class);
                startActivity(intent);
            }
        });

        cd_highedu=findViewById(R.id.HighEdu);
        cd_highedu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubActivity.this, HighEduActivity.class);
                startActivity(intent);
            }
        });

        cd_photo=findViewById(R.id.Photography);
        cd_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubActivity.this, PhotographyActivity.class);
                startActivity(intent);
            }
        });

        cd_code=findViewById(R.id.coding);
        cd_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubActivity.this, CodingActivity.class);
                startActivity(intent);
            }
        });

        cd_adventure=findViewById(R.id.Adventure);
        cd_adventure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubActivity.this, AdventureActivity.class);
                startActivity(intent);
            }
        });

        cd_robo=findViewById(R.id.Robotics);
        cd_robo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubActivity.this, RoboticActivity.class);
                startActivity(intent);
            }
        });
    }

    private void slider(){
        binding.slider.addData(new CarouselItem("https://coek.dypgroup.edu.in/wp-content/uploads/2020/01/image004-768x432.jpg","Health and Fitness Club"));
        binding.slider.addData(new CarouselItem("https://coek.dypgroup.edu.in/wp-content/uploads/2020/01/heclub-11-1024x768.jpg","Higher Education Club"));
        binding.slider.addData(new CarouselItem("https://coek.dypgroup.edu.in/wp-content/uploads/2020/01/9-300x169.jpg", "Photography Club"));
        binding.slider.addData(new CarouselItem("https://coek.dypgroup.edu.in/wp-content/uploads/2020/02/codingclub-4-768x576.jpg","Coding Club"));
        binding.slider.addData(new CarouselItem("https://coek.dypgroup.edu.in/wp-content/uploads/2020/03/image013.jpg","Adventure Club"));
        binding.slider.addData(new CarouselItem("https://coek.dypgroup.edu.in/wp-content/uploads/2020/03/robotics4.jpg","Robotics Club"));
    }
}