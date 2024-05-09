package com.example.happytails;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class breedinfo extends AppCompatActivity {

    ImageView img;
    TextView name,span,height,weight,size;
    int position;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breedinfo);
        name=findViewById(R.id.name);
        span=findViewById(R.id.lifespan);
        height=findViewById(R.id.height);
        weight=findViewById(R.id.weight);
        size=findViewById(R.id.size);
        img=findViewById(R.id.imageView2);
        Intent intent=getIntent();

        name.setText(intent.getStringExtra("arr"));
        String lifespan="LifeSpan: "+ intent.getStringExtra("span")+" years";
        span.setText(lifespan);
        String ht="Height: "+intent.getStringExtra("ht")+" cm";
        height.setText(ht);
        String wt="Weight: "+intent.getStringExtra("wt")+" kg";
        weight.setText(wt);
        String s="Size: "+intent.getStringExtra("size");
        size.setText(s);
        position=intent.getIntExtra("position",0);
        int imgR=intent.getIntExtra("imgR",0);
        img.setImageResource(imgR);

    }
}
