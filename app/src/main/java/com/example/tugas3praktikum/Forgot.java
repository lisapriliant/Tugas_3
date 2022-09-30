package com.example.tugas3praktikum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Forgot extends AppCompatActivity {

    private ImageButton btnback;
    private Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        btnback=findViewById(R.id.panah);
        btnsend=findViewById(R.id.fp5);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Forgot.this, Reset.class);
                startActivity(pindah);
            }
        });

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Forgot.this, Reset.class);
                startActivity(pindah);
            }
        });
    }
}