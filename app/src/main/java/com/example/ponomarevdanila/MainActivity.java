package com.example.ponomarevdanila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate() called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }

    public void onNextActivity(View view){
        EditText nameText = findViewById(R.id.editTextText);
        //EditText ageText = findViewById(R.id.editTextTextPassword);
        //EditText markText = findViewById(R.id.editTextText2);
        //EditText gropText = findViewById(R.id.editTextText3);
        Bundle arguments = getIntent().getExtras();
        String name = nameText.getText().toString();
        //String age = ageText.getText().toString();
        //String mark = markText.getText().toString();
        //String grop = gropText.getText().toString();
        Toast.makeText(this, "ИКБО-11-22", Toast.LENGTH_SHORT).show();
        Intent intent;

        intent = new Intent(this, MainActivity2.class);
        intent.putExtra("name",name);
        //intent.putExtra("age",age);
        //intent.putExtra("mark",mark);
        //intent.putExtra("grop",grop);
        startActivity(intent);
    }


}
