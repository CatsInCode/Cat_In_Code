package com.example.ponomarevdanila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        TextView messageText = new TextView(this);
        messageText.setTextSize(26);
        messageText.setPadding(16,16,16,16);
        Bundle arguments = getIntent().getExtras();
        if(arguments!=null){
            String name = arguments.get("name").toString();
            //String age = arguments.get("age").toString();
            //String mark = arguments.get("mark").toString();
            //String grop = arguments.get("grop").toString();
            messageText.setText(/*"name: "+*/name  /*+ "\nage: " + age+ "\nmark: " + mark + "\nage: " + grop*/);
        }
        setContentView(R.layout.activity_main2);
        setContentView(messageText);
    }
}
