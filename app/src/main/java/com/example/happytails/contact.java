package com.example.happytails;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class contact extends AppCompatActivity {
    EditText email,message;
    Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        email=findViewById(R.id.editTextTextEmailAddress);
        message=findViewById(R.id.editTextTextPersonName2);
        button=findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=message.getText().toString();
                String []address={"info@Happy Tails!.com"};
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_EMAIL,address);
                intent.putExtra(Intent.EXTRA_SUBJECT,text);
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });
    }
}