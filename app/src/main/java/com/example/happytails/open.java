package com.example.happytails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class open extends AppCompatActivity {
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.open);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAbout(view);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBreeds(view);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOrgs(view);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openContact(view);
            }
        });

    }

    public void openAbout(View view)
    {
        Intent intent=new Intent(this,about.class);
        startActivity(intent);

    }
    public void openBreeds(View view)
    {
        Intent intent=new Intent(this,breeds.class);
        startActivity(intent);
    }
    public void openOrgs(View view)
    {
        Intent intent=new Intent(this,orgs.class);
        startActivity(intent);
    }
    public void openContact(View view)
    {
        Intent intent=new Intent(this,contact.class);
        startActivity(intent);
    }

}
