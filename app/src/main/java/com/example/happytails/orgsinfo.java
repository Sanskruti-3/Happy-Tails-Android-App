package com.example.happytails;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class orgsinfo extends AppCompatActivity {
    TextView name, about,website,industry;
    ImageView im1,im2,im3,im4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orgsinfo);
        name=findViewById(R.id.textView3);
        about=findViewById(R.id.textView4);
        website=findViewById(R.id.textView5);
        industry=findViewById(R.id.textView7);
        im1=findViewById(R.id.image1);
        im2=findViewById(R.id.image2);
        im3=findViewById(R.id.image3);
        im4=findViewById(R.id.image4);

        Intent intent=getIntent();
        String N=intent.getStringExtra("name");
        name.setText(N);
        String A="ABOUT"+"\n"+intent.getStringExtra("about");
        about.setText(A);
        String W="WEBSITE: "+intent.getStringExtra("website");
        website.setText(W);
        String I="INDUSTRY: "+intent.getStringExtra("industry");
        industry.setText(I);
        im1.setImageResource(intent.getIntExtra("im1",0));
        im2.setImageResource(intent.getIntExtra("im2",0));
        im3.setImageResource(intent.getIntExtra("im3",0));
        im4.setImageResource(intent.getIntExtra("im4",0));
    }
}
