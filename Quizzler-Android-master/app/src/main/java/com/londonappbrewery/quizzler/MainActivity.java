package com.londonappbrewery.quizzler;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {



    // TODO: Declare member variables here:

    Button mTrueButton;
    Button mFalseButton;
    TextView Question;
    TextView Score;
    ProgressBar mProgressBar;
    int mQuestion;
    int MyIndex;
    int mScore = 0;
    boolean Answer;


    // TODO: Uncomment to create question bank
    private TrueOrFalse[] mQuestionBank = new TrueOrFalse[] {
            new TrueOrFalse(R.string.question_1, true),
            new TrueOrFalse(R.string.question_2, true),
            new TrueOrFalse(R.string.question_3, true),
            new TrueOrFalse(R.string.question_4, true),
            new TrueOrFalse(R.string.question_5, true),
            new TrueOrFalse(R.string.question_6, false),
            new TrueOrFalse(R.string.question_7, true),
            new TrueOrFalse(R.string.question_8, false),
            new TrueOrFalse(R.string.question_9, true),
            new TrueOrFalse(R.string.question_10, true),
            new TrueOrFalse(R.string.question_11, false),
            new TrueOrFalse(R.string.question_12, false),
            new TrueOrFalse(R.string.question_13,true)
    };

    // TODO: Declare constants here
    final int NumberTofillIn =  (int) Math.ceil(100.0 / mQuestionBank.length);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);
        Question = (TextView) findViewById(R.id.question_text_view);
        Score = (TextView) findViewById(R.id.score);
        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);
        mQuestion = mQuestionBank[MyIndex].getQuestion();
        Question.setText(mQuestion);
        Answer = mQuestionBank[MyIndex].isAnswer();
        
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( Answer == true){
                    Toast.makeText(getApplicationContext(),R.string.correct_toast,Toast.LENGTH_SHORT).show();
                    mScore = mScore +1;
                    Score.setText("Score"+mScore+"/13");
                }else
                    Toast.makeText(getApplicationContext(),R.string.incorrect_toast,Toast.LENGTH_SHORT).show();


                UpdateQuestion();
                mProgressBar.incrementProgressBy(NumberTofillIn);

            }
        });
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( Answer == false){
                    Toast.makeText(getApplicationContext(),R.string.correct_toast,Toast.LENGTH_SHORT).show();
                    mScore = mScore +1;
                    Score.setText("Score"+mScore+"/13");
                }else
                    Toast.makeText(getApplicationContext(),R.string.incorrect_toast,Toast.LENGTH_SHORT).show();


                UpdateQuestion();
                mProgressBar.incrementProgressBy(NumberTofillIn);

            }
        });

    }

    private void UpdateQuestion (){
        MyIndex = (MyIndex +1) % mQuestionBank.length ;
        if ( MyIndex == 0 ){
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Game Over");
            alert.setCancelable(false);
            alert.setMessage("You Scored" + mScore + "Points");
            alert.setPositiveButton("Close Application ", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            alert.show();
        }
        mQuestion = mQuestionBank[MyIndex].getQuestion();
        Answer = mQuestionBank[MyIndex].isAnswer();
        Question.setText(mQuestion);

    }
}
