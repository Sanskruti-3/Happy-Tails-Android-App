package com.example.happytails;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText emailR, usernameR, phoneR;
    Button register,freeR;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailR=findViewById(R.id.email);
        usernameR=findViewById(R.id.username);
        phoneR=findViewById(R.id.phone);
        register=findViewById(R.id.button);
        freeR=findViewById(R.id.freeR);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=emailR.getText().toString();
                String phone=phoneR.getText().toString();
                if(!email.contains("@gmail.com") && !email.endsWith("com")&& phone.length()!=10)
                {
                    Toast.makeText(MainActivity.this, "Invalid Email and Phone number", Toast.LENGTH_SHORT).show();
                }
                else if(!email.contains("@gmail.com") && !email.endsWith("com"))
                    Toast.makeText(MainActivity.this, "Invalid Email", Toast.LENGTH_SHORT).show();
                else if(phone.length()!=10)
                    Toast.makeText(MainActivity.this, "Invalid Phone number", Toast.LENGTH_SHORT).show();
                else
                    openActivity(v);
            }

        });

        freeR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                free(view);
            }
        });
    }

    public void openActivity(View v)
    {
        Intent intent=new Intent(MainActivity.this, open.class);
        String username=usernameR.getText().toString();

        intent.putExtra("name",username);
        startActivity(intent);
    }
    public void free(View v)
    {
        Intent intent=new Intent(MainActivity.this, open.class);
        startActivity(intent);
    }
}