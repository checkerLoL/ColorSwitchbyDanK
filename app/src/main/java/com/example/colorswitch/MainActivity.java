package com.example.colorswitch;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        ConstraintLayout layout = findViewById(R.id.main);


        btn.setOnClickListener(v -> {
            Random r = new Random();
            int clr = Color.argb(255, r.nextInt(256), r.nextInt(256), r.nextInt(256));
            layout.setBackgroundColor(clr);
        });
    }
}