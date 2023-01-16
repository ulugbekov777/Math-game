package uz.ulugbekov__777.math;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {


    CardView cardView, cardView1, cardView2,cardView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardView = findViewById(R.id.cardView);
        cardView1 = findViewById(R.id.cardView1);
        cardView2 = findViewById(R.id.cardView2);
        cardView3 = findViewById(R.id.cardView3);


        cardView.setOnClickListener(view -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });

        cardView1.setOnClickListener(view -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        });

        cardView2.setOnClickListener(view -> {
            Intent intent = new Intent(this, FourthActivity.class);
            startActivity(intent);
        });

        cardView3.setOnClickListener(view -> {
            Intent intent = new Intent(this, FifthActivity2.class);
            startActivity(intent);
        });
    }
}
