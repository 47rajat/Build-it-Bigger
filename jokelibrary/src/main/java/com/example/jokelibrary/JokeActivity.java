package com.example.jokelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    private String mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        if(intent.getStringExtra(Intent.EXTRA_TEXT) != null){
            mJoke = intent.getStringExtra(Intent.EXTRA_TEXT);
        }

        TextView textView = (TextView) findViewById(R.id.joke_container);
        if(mJoke != null){
            textView.setText(mJoke);
        } else {
            textView.setText(getString(R.string.error_message));
        }
    }
}
