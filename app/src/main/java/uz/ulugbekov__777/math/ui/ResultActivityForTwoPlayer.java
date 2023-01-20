package uz.ulugbekov__777.math.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import uz.ulugbekov__777.math.R;
import uz.ulugbekov__777.math.databinding.ActivityResultForTwoPlayerBinding;

public class ResultActivityForTwoPlayer extends AppCompatActivity {

    ActivityResultForTwoPlayerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultForTwoPlayerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int player1 = TwoPlayerActivity.player1Answer;
        int player2 = TwoPlayerActivity.player2Answer;

        if (player1 > player2) {
            binding.winnerID.setText("" + player1);
        } else {
            binding.winnerID.setText("" + player2);
        }


        new Handler().postDelayed(() -> {

            binding.winnerView.setVisibility(View.VISIBLE);

            ObjectAnimator translateAnim = ObjectAnimator.ofFloat(binding.cubokImage, "translationY", 0, -350);
            translateAnim.setDuration(1000);
            translateAnim.start();

            ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(binding.winnerView,
                    PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f),
                    PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f)
            );
            scaleDown.setDuration(1000);
            scaleDown.start();

            binding.lottieAnimation.playAnimation();

        }, 1000);

    }
}