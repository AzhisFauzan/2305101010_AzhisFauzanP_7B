package com.example.prak_modul_5;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnOpenSecond, btnOpenBrowser, btnCircleArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Inisialisasi & Handler Tombol SecondActivity (Explicit Intent)
        btnOpenSecond = findViewById(R.id.btnOpenSecond);
        btnOpenSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        // 2. Inisialisasi & Handler Tombol Buka Browser (Implicit Intent)
        btnOpenBrowser = findViewById(R.id.btnOpenBrowser);
        btnOpenBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.unipma.ac.id"));
                startActivity(intent);
            }
        });

        // 3. Inisialisasi & Handler Tombol Kalkulator Luas Lingkaran
        btnCircleArea = findViewById(R.id.btnCircleArea);
        btnCircleArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CircleAreaActivity.class);
                startActivity(intent);
            }
        });
    }
}