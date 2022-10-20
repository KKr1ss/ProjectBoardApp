package com.example.projectboardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bttnPresets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bttnPresets = (Button)findViewById(R.id.bttnPresets);
    }

    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, saves.class));
    }
}

