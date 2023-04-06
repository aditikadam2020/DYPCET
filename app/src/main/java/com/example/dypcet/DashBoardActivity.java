package com.example.dypcet;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dypcet.databinding.ActivityDashBoardBinding;
import com.google.android.material.navigation.NavigationView;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

public class DashBoardActivity extends AppCompatActivity {
    ActivityDashBoardBinding binding;
    CardView cd_about,cd_admission,cd_document,cd_scholarship,cd_career,cd_faci,cd_cet,cd_branch,cd_whydypcet,cd_cutoff,cd_placement,cd_bus,cd_mhtcet,cd_jee,cd_future,cd_finishingschool;
    TextView tv_facebook,tv_insta;

    ImageView iv_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashBoardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        slider();

        //menu image view start
        iv_menu = findViewById(R.id.menu);
        iv_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

        //menu image view end

        //about dyp card start
        cd_about=findViewById(R.id.about);
        cd_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
        //about dyp card end

        //admission card start
        cd_admission = findViewById(R.id.admission);
        cd_admission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this,AdmissionActivity.class);
                startActivity(intent);
            }
        });
        //admission card end

        //document card end
        cd_document=findViewById(R.id.document);
        cd_document.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, DocumentActivity.class);
                startActivity(intent);
            }
        });
        //document card end

        //scholarship card start
        cd_scholarship=findViewById(R.id.scholarship);
        cd_scholarship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, ScholarshipActivity.class);
                startActivity(intent);
            }
        });
        //scholarship card end

        //career card start
        cd_career=findViewById(R.id.career);
        cd_career.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, CareerActivity.class);
                startActivity(intent);
            }
        });
        //career card end

        //CET Mock test start
        cd_cet=findViewById(R.id.cet);
        cd_cet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, CetMockActivity.class);
                startActivity(intent);
            }
        });
        //facility card start
        cd_faci=findViewById(R.id.facility);
        cd_faci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, FacilityActivity.class);
                startActivity(intent);
            }
        });
        //facility card end

        //branch card start
        cd_branch=findViewById(R.id.course);
        cd_branch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, BranchActivity.class);
                startActivity(intent);
            }
        });
        //branch card end

        //why dypcet card start
        cd_whydypcet=findViewById(R.id.whydypcet);
        cd_whydypcet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, WhyDypcetActivity.class);
                startActivity(intent);
            }
        });
        //why dypcet card end

        //MHT-CET card start
        cd_mhtcet=findViewById(R.id.mhtcet);
        cd_mhtcet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://mhtcet2023.mahacet.org/StaticPages/HomePage";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        //MHT-CET card end

        //JEE Card start
        cd_jee=findViewById(R.id.jee);
        cd_jee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://jeemain.nta.nic.in/#1648447930282-deb48cc0-95ec";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        //JEE card end

        //placement card start
        cd_placement=findViewById(R.id.placement);
        cd_placement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, PlacementActivity.class);
                startActivity(intent);
            }
        });
        //placement card end

        //cutoff card start
        cd_cutoff=findViewById(R.id.cutoff);
        cd_cutoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://fe2022.mahacet.org/StaticPages/HomePage";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        //cutoff card end

        //facebook link start
        tv_facebook=findViewById(R.id.facebook);
        tv_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com/dypcetkolhapur";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        //facebook link end

        //insta link start
        tv_insta=findViewById(R.id.insta);
        tv_insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.instagram.com/dypcet_official/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        //insta link end

        //Bus card start
        cd_bus=findViewById(R.id.buscard);
        cd_bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, BusRouteActivity.class);
                startActivity(intent);
            }
        });
        //Bus card end

        //Future Eng. card start
        cd_future=findViewById(R.id.futureeng);
        cd_future.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, FutureEngActivity.class);
                startActivity(intent);
            }
        });
        //Future Eng end

        //finishing school start
        cd_finishingschool=findViewById(R.id.finishingSchool);
        cd_finishingschool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoardActivity.this, FinishingSchoolActivity.class));
            }
        });
        //finishing school end

    }
    private void slider(){
        binding.carousel.addData(new CarouselItem("https://cache.careers360.mobi/media/colleges/reviews/2021/6/1/161645/IMG-20191109-WA0015.jpg"));
        binding.carousel.addData(new CarouselItem("https://coek.dypgroup.edu.in/wp-content/uploads/2017/06/kb-building.jpg"));
        binding.carousel.addData(new CarouselItem("https://media.licdn.com/dms/image/C4D22AQFI6QeKL4l9Tg/feedshare-shrink_800/0/1662355596468?e=1681344000&v=beta&t=TKUoskVTy8YcBrkzWIDTPOTxbvl4l2vXzJGkNqc5EpE"));
        binding.carousel.addData(new CarouselItem("https://scontent-bom1-2.xx.fbcdn.net/v/t39.30808-6/271190360_5542323015794104_4391267751290127635_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=a26aad&_nc_ohc=Kk7TDAv1sO0AX_zbylW&_nc_ht=scontent-bom1-2.xx&oh=00_AfBUYvZ2qIiALRv0MaIwrRbG8IAyAsD3Dpvzu1O7216HrA&oe=6429742D"));
    }
}