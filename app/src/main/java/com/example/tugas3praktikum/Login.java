package com.example.tugas3praktikum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private Button btnlogin;
    private TextView forgot;
    private ImageButton wel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnlogin=findViewById(R.id.loginbtn);
        forgot=findViewById(R.id.s7);
        wel=findViewById(R.id.panah);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Login.this, LoginSuccess.class);
                startActivity(pindah);
            }
        });

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Login.this, Forgot.class);
                startActivity(pindah);
            }
        });

        wel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Login.this, Welcome.class);
                startActivity(pindah);
            }
        });
    }
}