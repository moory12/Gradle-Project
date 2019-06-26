package com.bookt.jokesshow;

import android.content.Intent;

import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class JokesActvity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joks_activity);

        Intent intent = getIntent();

         textView = findViewById(R.id.jokes_shower);

        textView.setText(intent.getStringExtra("JOKE"));
    }
}
