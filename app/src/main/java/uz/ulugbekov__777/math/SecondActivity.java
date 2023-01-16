package uz.ulugbekov__777.math;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import uz.ulugbekov__777.math.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    ActivitySecondBinding binding;
    TextView[] ts = new TextView[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ts = new TextView[]{
                binding.t1,
                binding.t2,
                binding.t3,
                binding.t4,
                binding.t5,
                binding.t6,
                binding.t7,
                binding.t8,
                binding.t9,
                binding.t10,
        };

        binding.text1.setOnClickListener(view -> {
            changeTable(1);
        });
        binding.text2.setOnClickListener(view -> {
            changeTable(2);
        });
        binding.text3.setOnClickListener(view -> {
            changeTable(3);
        });
        binding.text4.setOnClickListener(view -> {
            changeTable(4);
        });
        binding.text5.setOnClickListener(view -> {
            changeTable(5);
        });
        binding.text6.setOnClickListener(view -> {
            changeTable(6);
        });
        binding.text7.setOnClickListener(view -> {
            changeTable(7);
        });
        binding.text8.setOnClickListener(view -> {
            changeTable(8);
        });
        binding.text9.setOnClickListener(view -> {
            changeTable(9);
        });
        binding.text10.setOnClickListener(view -> {
            changeTable(10);
        });
    }

    void changeTable(int n) {
        for (int i = 1; i <= 10; i++) {
            String text = n + " x " + i + " = " + (n * i);
            ts[i-1].setText(text);
        }
    }
}