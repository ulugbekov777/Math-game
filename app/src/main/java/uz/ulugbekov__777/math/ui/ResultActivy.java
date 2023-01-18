package uz.ulugbekov__777.math.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import uz.ulugbekov__777.math.R;

public class ResultActivy extends AppCompatActivity {

    TextView trueAns, falseAns;
    int rightAnswer = ThirdActivity.rightAnswer;
    int errorAnswer = ThirdActivity.errorAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_activy);
        trueAns = findViewById(R.id.trueAns);
        falseAns = findViewById(R.id.falseAns);

        trueAns.setText(rightAnswer+"");
        falseAns.setText(errorAnswer+"");
    }
}