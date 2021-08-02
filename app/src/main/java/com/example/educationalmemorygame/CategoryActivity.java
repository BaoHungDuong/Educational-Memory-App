package com.example.educationalmemorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoryActivity extends AppCompatActivity {

    Button btnAnimal, btnSport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getSupportActionBar().hide();

        btnAnimal = findViewById(R.id.buttonAnimal);
        btnAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, PlaygroundActivity.class);
                startActivity(intent);
            }
        });


        btnSport = findViewById(R.id.buttonSport);
    }
}