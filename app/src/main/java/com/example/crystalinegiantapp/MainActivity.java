package com.example.crystalinegiantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.crystalinegiantapp.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);

        binding.btnThrow.setOnClickListener(view -> {
            Random random;
            int rnd = 0;
            if (numbers.size() == 11) {
                binding.txtResult.setText("X");
                return;
            }
            while (numbers.contains(rnd)) {
                random = new Random();
                rnd = (int) Math.round(Math.random() * 10);
                binding.txtResult.setText(String.valueOf(rnd));
            }
            numbers.add(rnd);

            switch (rnd) {
                case 1: {
                    binding.checkBox.setChecked(true);
                    break;
                }
                case 2: {
                    binding.checkBox2.setChecked(true);
                    break;
                }
                case 3: {
                    binding.checkBox3.setChecked(true);
                    break;
                }
                case 4: {
                    binding.checkBox4.setChecked(true);
                    break;
                }
                case 5: {
                    binding.checkBox5.setChecked(true);
                    break;
                }
                case 6: {
                    binding.checkBox6.setChecked(true);
                    break;
                }
                case 7: {
                    binding.checkBox7.setChecked(true);
                    break;
                }
                case 8: {
                    binding.checkBox8.setChecked(true);
                    break;
                }
                case 9: {
                    binding.checkBox9.setChecked(true);
                    break;
                }
                case 10: {
                    binding.checkBox10.setChecked(true);
                    break;
                }
            }
        });
        View view = binding.getRoot();
        setContentView(view);
    }
}