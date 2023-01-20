package uz.ulugbekov__777.math.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.util.ArrayList;

import uz.ulugbekov__777.math.R;
import uz.ulugbekov__777.math.databinding.ActivityTwoplayerGameBinding;
import uz.ulugbekov__777.math.models.QuestionModelTwoPlayer;

public class TwoPlayerActivity extends AppCompatActivity {
    ActivityTwoplayerGameBinding binding;
    ArrayList<QuestionModelTwoPlayer> questionModel = new ArrayList();
    int indexQuestion = 0;
    static int player1Answer = 0;
    static int player2Answer = 0;
    boolean isClicked = false;
    boolean isPlayer1Blocked = false;
    boolean isPlayer2Blocked = false;

    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTwoplayerGameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadQuestion();
        setUI(indexQuestion);
        binding.user1Answer1.setOnClickListener(view -> {
            if (!isClicked && !isPlayer1Blocked) {
                if (binding.user1Answer1.getText() == questionModel.get(indexQuestion).getRealAnswer()) {
                    player1Answer++;
                    setRightAnswerBackground(binding.user1Answer1);
                    isClicked = true;
                    new Handler().postDelayed(() -> {
                        setUI(++indexQuestion);
                        isClicked = false;
                    }, 500);
                } else {
                    setErrorAnswerBackground(binding.user1Answer1);
                    if (isPlayer2Blocked) {
                        new Handler().postDelayed(() -> {
                            setUI(++indexQuestion);
                            isClicked = false;
                        }, 500);
                    } else {
                        isPlayer1Blocked = true;
                    }
                }
            }
        });

        binding.user1Answer2.setOnClickListener(view -> {
            if (!isClicked && !isPlayer1Blocked) {
                if (binding.user1Answer2.getText() == questionModel.get(indexQuestion).getRealAnswer()) {
                    player1Answer++;
                    setRightAnswerBackground(binding.user1Answer2);
                    isClicked = true;
                    new Handler().postDelayed(() -> {
                        setUI(++indexQuestion);
                        isClicked = false;
                    }, 500);
                } else {
                    setErrorAnswerBackground(binding.user1Answer2);
                    if (isPlayer2Blocked) {
                        new Handler().postDelayed(() -> {
                            setUI(++indexQuestion);
                            isClicked = false;
                        }, 500);
                    } else {
                        isPlayer1Blocked = true;
                    }
                }
            }
        });

        binding.user1Answer3.setOnClickListener(view -> {
            if (!isClicked && !isPlayer1Blocked) {
                if (binding.user1Answer3.getText() == questionModel.get(indexQuestion).getRealAnswer()) {
                    player1Answer++;
                    setRightAnswerBackground(binding.user1Answer3);
                    isClicked = true;
                    new Handler().postDelayed(() -> {
                        setUI(++indexQuestion);
                        isClicked = false;
                    }, 500);
                } else {
                    setErrorAnswerBackground(binding.user1Answer3);
                    if (isPlayer2Blocked) {
                        new Handler().postDelayed(() -> {
                            setUI(++indexQuestion);
                            isClicked = false;
                        }, 500);
                    } else {
                        isPlayer1Blocked = true;
                    }
                }

            }
        });

        binding.user2Answer1.setOnClickListener(view -> {
            if (!isClicked && !isPlayer2Blocked) {
                if (binding.user2Answer1.getText() == questionModel.get(indexQuestion).getRealAnswer()) {
                    player2Answer++;
                    setRightAnswerBackground(binding.user2Answer1);
                    isClicked = true;
                    new Handler().postDelayed(() -> {
                        setUI(++indexQuestion);
                        isClicked = false;
                    }, 500);
                } else {
                    setErrorAnswerBackground(binding.user2Answer1);
                    if (isPlayer1Blocked) {
                        new Handler().postDelayed(() -> {
                            setUI(++indexQuestion);
                            isClicked = false;
                        }, 500);
                    } else {
                        isPlayer2Blocked = true;
                    }
                }
            }
        });

        binding.user2Answer2.setOnClickListener(view -> {
            if (!isClicked && !isPlayer2Blocked) {
                if (binding.user2Answer2.getText() == questionModel.get(indexQuestion).getRealAnswer()) {
                    player2Answer++;
                    setRightAnswerBackground(binding.user2Answer2);
                    isClicked = true;
                    new Handler().postDelayed(() -> {
                        setUI(++indexQuestion);
                        isClicked = false;
                    }, 500);
                } else {
                    setErrorAnswerBackground(binding.user2Answer2);
                    if (isPlayer1Blocked) {
                        new Handler().postDelayed(() -> {
                            setUI(++indexQuestion);
                            isClicked = false;
                        }, 500);
                    } else {
                        isPlayer2Blocked = true;
                    }
                }
            }
        });

        binding.user2Answer3.setOnClickListener(view -> {
            if (!isClicked && !isPlayer2Blocked) {
                if (binding.user2Answer3.getText() == questionModel.get(indexQuestion).getRealAnswer()) {
                    player2Answer++;
                    setRightAnswerBackground(binding.user2Answer3);
                    isClicked = true;
                    new Handler().postDelayed(() -> {
                        setUI(++indexQuestion);
                        isClicked = false;
                    }, 500);
                } else {
                    setErrorAnswerBackground(binding.user2Answer3);
                    if (isPlayer1Blocked) {
                        new Handler().postDelayed(() -> {
                            setUI(++indexQuestion);
                            isClicked = false;
                        }, 500);
                    } else {
                        isPlayer2Blocked = true;
                    }
                }
            }
        });

    }

    private void loadQuestion() {
        questionModel.add(new QuestionModelTwoPlayer("3*6 = ?", "18", "45", "25", "18"));
        questionModel.add(new QuestionModelTwoPlayer("4*3 = ?", "12", "33", "32", "12"));
        questionModel.add(new QuestionModelTwoPlayer("5*5 = ?", "34", "25", "14", "25"));
        questionModel.add(new QuestionModelTwoPlayer("6*4 = ?", "24", "28", "35", "24"));
        questionModel.add(new QuestionModelTwoPlayer("5*8 = ?", "38", "40", "55", "40"));
        questionModel.add(new QuestionModelTwoPlayer("4*9 = ?", "36", "32", "26", "36"));
        questionModel.add(new QuestionModelTwoPlayer("5*2 = ?", "10", "35", "26", "10"));
        questionModel.add(new QuestionModelTwoPlayer("7*5 = ?", "45", "25", "35", "35"));
        questionModel.add(new QuestionModelTwoPlayer("7*8 = ?", "38", "56", "25", "56"));
        questionModel.add(new QuestionModelTwoPlayer("8*4 = ?", "32", "45", "22", "12"));
    }

    private void setUI(int indexQuestion) {
        isPlayer2Blocked = false;
        isPlayer1Blocked = false;
        if (indexQuestion < questionModel.size()) {
            //setDefaults
            setDefaultBackground(binding.user1Answer1);
            setDefaultBackground(binding.user1Answer2);
            setDefaultBackground(binding.user1Answer3);
            setDefaultBackground(binding.user2Answer1);
            setDefaultBackground(binding.user2Answer2);
            setDefaultBackground(binding.user2Answer3);
            //setQuestions
            binding.question1.setText(questionModel.get(indexQuestion).getQuestion());
            binding.question2.setText(questionModel.get(indexQuestion).getQuestion());
            //setsAnswerTexts
            binding.user1Answer1.setText(questionModel.get(indexQuestion).getAnswer1());
            binding.user1Answer2.setText(questionModel.get(indexQuestion).getAnswer2());
            binding.user1Answer3.setText(questionModel.get(indexQuestion).getAnswer3());
            binding.user2Answer1.setText(questionModel.get(indexQuestion).getAnswer1());
            binding.user2Answer2.setText(questionModel.get(indexQuestion).getAnswer2());
            binding.user2Answer3.setText(questionModel.get(indexQuestion).getAnswer3());

        } else {
            startActivity(new Intent(TwoPlayerActivity.this, ResultActivityForTwoPlayer.class));
            finish();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        indexQuestion = 0;
        setUI(indexQuestion);
        player1Answer = 0;
        player2Answer = 0;
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