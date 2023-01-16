package uz.ulugbekov__777.math;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import uz.ulugbekov__777.math.databinding.ActivityThirdBinding;

public class FourthActivity extends AppCompatActivity {

    ActivityThirdBinding binding;
    CountDownTimer countDownTimer;
    TextView question, answer, answer1, answer2, answer3, number;
    ArrayList<QuestionModel> questionModel = new ArrayList<>();
    int indexQuestion = 0;
    static int rightAnswer = 0;
    static int errorAnswer = 0;
    boolean isClicked = false;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityThirdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initUI();
        loadQuestion();
        setUI(indexQuestion);

        answer.setOnClickListener(view -> {
            if (!isClicked) {
                if (answer.getText() == questionModel.get(indexQuestion).getRealAnswer()) {
                    rightAnswer++;
                    setRightAnswerBackground(answer);
                } else {
                    setErrorAnswerBackground(answer);
                    errorAnswer++;
                }
                isClicked = true;
                new Handler().postDelayed(() -> {
                    setUI(++indexQuestion);
                    isClicked = false;
                }, 500);
            }
        });

        answer1.setOnClickListener(view -> {
            if (!isClicked){
                if (answer1.getText() == questionModel.get(indexQuestion).getRealAnswer()) {
                    rightAnswer++;
                    setRightAnswerBackground(answer1);
                } else {
                    setErrorAnswerBackground(answer1);
                    errorAnswer++;
                }
                isClicked = true;
                new Handler().postDelayed(() -> {
                    setUI(++indexQuestion);
                    isClicked = false;
                }, 500);
            }
        });

        answer2.setOnClickListener(view -> {
            if (!isClicked){
                if (answer2.getText() == questionModel.get(indexQuestion).getRealAnswer()) {
                    rightAnswer++;
                    setRightAnswerBackground(answer2);
                } else {
                    setErrorAnswerBackground(answer2);
                    errorAnswer++;
                }
                isClicked = true;
                new Handler().postDelayed(() -> {
                    setUI(++indexQuestion);
                    isClicked = false;
                }, 500);
            }
        });

        answer3.setOnClickListener(view -> {
            if (!isClicked){
                if (answer3.getText() == questionModel.get(indexQuestion).getRealAnswer()) {
                    rightAnswer++;
                    setRightAnswerBackground(answer3);
                } else {
                    setErrorAnswerBackground(answer3);
                    errorAnswer++;
                }
                isClicked = true;
                new Handler().postDelayed(() -> {
                    setUI(++indexQuestion);
                    isClicked = false;
                }, 500);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuSettings:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menuShare:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menuProfile:
                Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    private void setUI(int indexQuestion) {
        if (indexQuestion < questionModel.size()) {
            setDefaultBackground(answer);
            setDefaultBackground(answer1);
            setDefaultBackground(answer2);
            setDefaultBackground(answer3);
            question.setText(questionModel.get(indexQuestion).getQuestion());
            answer.setText(questionModel.get(indexQuestion).getAnswer1());
            answer1.setText(questionModel.get(indexQuestion).getAnswer2());
            answer2.setText(questionModel.get(indexQuestion).getAnswer3());
            answer3.setText(questionModel.get(indexQuestion).getAnswer4());
            number.setText((indexQuestion + 1) + " / 30");

            if (countDownTimer != null) {
                countDownTimer.cancel();
            }

            countDownTimer = new CountDownTimer(10000, 1000) {
                int counter = 1;

                @Override
                public void onTick(long l) {
                    binding.progress.setProgress(100 - counter * 10);
                    binding.timeTv.setText("00:0" + (10 - counter));
                    counter++;
                }

                @Override
                public void onFinish() {
                    errorAnswer++;
                    setUI(indexQuestion + 1);
                }
            };

            countDownTimer.start();

        } else {
            startActivity(new Intent(FourthActivity.this, ResultActivy.class));
            finish();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        indexQuestion = 0;
        setUI(indexQuestion);
        rightAnswer = 0;
    }

    private void loadQuestion() {
        questionModel.add(new QuestionModel("3*5 = ?", "15", "25", "35", "45", "15"));
        questionModel.add(new QuestionModel("8*9 = ?", "62", "72", "71", "74", "72"));
        questionModel.add(new QuestionModel("5*7 = ?", "34", "30", "35", "45", "35"));
        questionModel.add(new QuestionModel("4*9 = ?", "25", "34", "35", "36", "36"));
        questionModel.add(new QuestionModel("7*8 = ?", "65", "56", "55", "25", "56"));
        questionModel.add(new QuestionModel("9*9 = ?", "80", "72", "81", "75", "81"));
        questionModel.add(new QuestionModel("5*2 = ?", "10", "35", "26", "12", "10"));
        questionModel.add(new QuestionModel("5*5 = ?", "45", "15", "65", "25", "25"));
        questionModel.add(new QuestionModel("7*8 = ?", "38", "56", "25", "55", "56"));
        questionModel.add(new QuestionModel("3*4 = ?", "12", "25", "22", "35", "12"));
        questionModel.add(new QuestionModel("23*2 = ?", "56", "46", "35", "45", "56"));
        questionModel.add(new QuestionModel("8*4 = ?", "43", "32", "63", "24", "32"));
        questionModel.add(new QuestionModel("15*7 = ?", "92", "80", "105", "115", "105"));
        questionModel.add(new QuestionModel("24*3 = ?", "72", "52", "85", "66", "72"));
        questionModel.add(new QuestionModel("4*6 = ?", "24", "26", "35", "25", "24"));
        questionModel.add(new QuestionModel("3*9 = ?", "27", "30", "42", "32", "27"));
        questionModel.add(new QuestionModel("15*2 = ?", "10", "30", "26", "12", "30"));
        questionModel.add(new QuestionModel("5*15 = ?", "45", "15", "65", "75", "75"));
        questionModel.add(new QuestionModel("4*8 = ?", "32", "56", "35", "55", "32"));
        questionModel.add(new QuestionModel("10*4 = ?", "52", "40", "32", "33", "40"));
        questionModel.add(new QuestionModel("7*5 = ?", "35", "25", "15", "45", "35"));
        questionModel.add(new QuestionModel("8*9 = ?", "62", "72", "71", "74", "72"));
        questionModel.add(new QuestionModel("6*5 = ?", "30", "20", "39", "29", "30"));
        questionModel.add(new QuestionModel("7*9 = ?", "56", "74", "63", "62", "63"));
        questionModel.add(new QuestionModel("6*4 = ?", "24", "46", "34", "25", "24"));
        questionModel.add(new QuestionModel("9*4 = ?", "55", "36", "41", "35", "36"));
        questionModel.add(new QuestionModel("5*21 = ?", "105", "135", "115", "95", "105"));
        questionModel.add(new QuestionModel("6*6 = ?", "45", "36", "26", "30", "36"));
        questionModel.add(new QuestionModel("6*8 = ?", "38", "56", "48", "55", "48"));
        questionModel.add(new QuestionModel("3*25 = ?", "62", "75", "42", "55", "75"));
    }

    private void initUI() {
        question = findViewById(R.id.question);
        answer = findViewById(R.id.answer);
        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        number = findViewById(R.id.number);

    }

    private void setRightAnswerBackground(TextView textView) {
        textView.setBackgroundColor(getResources().getColor(R.color.green));
        textView.setTextColor(getResources().getColor(R.color.white));

    }

    private void setErrorAnswerBackground(TextView textView) {
        textView.setBackgroundColor(getResources().getColor(R.color.red));
        textView.setTextColor(getResources().getColor(R.color.white));
    }

    public void setDefaultBackground(TextView textView) {
        textView.setBackgroundColor(getResources().getColor(R.color.white));
        textView.setTextColor(getResources().getColor(R.color.black));
    }

}