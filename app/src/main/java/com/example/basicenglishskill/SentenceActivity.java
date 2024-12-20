package com.example.basicenglishskill;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SentenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentence);
        Log.d("SentenceActivity", "Activity Loaded Successfully");
        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Button buttonAlternative = findViewById(R.id.buttonAlternative);
        buttonAlternative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Example action for Alternative Button
                Toast.makeText(SentenceActivity.this, "Alternative Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        Button buttonNext = findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SentenceActivity.this, SentenceActivity.class);
                startActivity(intent);
            }
        });
        Button buttonAdvance = findViewById(R.id.buttonAdvance);
        buttonAdvance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Example action for Advance Button
                Toast.makeText(SentenceActivity.this, "Advance Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

