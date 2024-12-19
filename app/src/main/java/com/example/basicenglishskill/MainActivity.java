package com.example.basicenglishskill;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSentence = findViewById(R.id.buttonSentence);
        buttonSentence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SentenceActivity.class);
                startActivity(intent);
            }
        });

        Button buttonVocab = findViewById(R.id.buttonVocab);
        buttonVocab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VocabActivity.class);
                startActivity(intent);
            }
        });


        Button buttonShortStory = findViewById(R.id.buttonShortStory);
        buttonShortStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShortStoryActivity.class);
                startActivity(intent);
            }
        });
    }
}
