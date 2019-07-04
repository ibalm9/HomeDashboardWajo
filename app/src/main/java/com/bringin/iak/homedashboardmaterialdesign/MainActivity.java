package com.bringin.iak.homedashboardmaterialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    CardView cvPoint,cvIdea, cvBank, cvFile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cvPoint = findViewById(R.id.point_view);
        cvIdea = findViewById(R.id.idea_view);
        cvBank = findViewById(R.id.banking_view);
        cvFile = findViewById(R.id.file_view);

        cvPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Point.class);
                startActivity(intent);
            }
        });
        cvIdea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Idea.class);
                startActivity(intent);
            }

        });
        cvBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bank.class);
                startActivity(intent);
            }

        });
        cvFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, File.class);
                startActivity(intent);
            }

        });





    }

}
