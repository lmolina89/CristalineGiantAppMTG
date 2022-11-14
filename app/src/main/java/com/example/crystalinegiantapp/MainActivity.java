package com.example.crystalinegiantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btnTirar;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTirar = findViewById(R.id.btn_throw);
        txtResult = findViewById(R.id.txt_result);


        btnTirar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int rnd = random.nextInt(10)+1;
                txtResult.setText(String.valueOf(rnd));
            }
        });
    }

//    public void lanzarDado(View view){
//
//        int random = (int) Math.round(Math.random()*10);
//        txtResult.setText(random);
//    }
}