package uz.ulugbekov__777.math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        new Handler().postDelayed(()->{
            Intent intent = new Intent(SplashActivity2.this,MainActivity.class);
            startActivity(intent);
            finish();
        },2000);
    }
}
