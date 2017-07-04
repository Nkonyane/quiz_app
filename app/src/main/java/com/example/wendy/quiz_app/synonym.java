package com.example.wendy.quiz_app;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.y;
import static com.example.wendy.quiz_app.chatSlang.yolo1;
import static com.example.wendy.quiz_app.chatSlang.yolo2;
import static com.example.wendy.quiz_app.chatSlang.yolo3;

public class synonym extends Activity {

    static RadioButton omit1,omit2,omit3;

    TextView duoQuestion, enormousQuestion, omitQuestion, frolicQuestion, winnerQuestion, walkQuestion, stopQuestion, continueQuestion, wordQuestion, storyQuestion;
    Button next;

    synonymClass synonymClass = new synonymClass();
    String correct;
    int questionNum = 0, score;
    int qLength = synonymClass.synonymQuestion.length;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synonym);

        omit1 = (RadioButton)findViewById(R.id.radomit1);
        omit2 = (RadioButton)findViewById(R.id.radomit2);
        omit3 = (RadioButton)findViewById(R.id.radomit3);
        omitQuestion = (TextView)findViewById(R.id.omit);

        next = (Button)findViewById(R.id.btnNext);
        setQuestion(questionNum);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionNum++;
                if(questionNum < qLength){
                    if(omit1.isChecked()){
                        if(omit1.getText().toString() == correct){
                            score++;
                        }
                        setQuestion(questionNum);
                    }
                    if(omit2.isChecked()){
                        if(omit2.getText().toString() == correct){
                            score++;
                        }
                        setQuestion(questionNum);
                    }
                    if(omit3.isChecked()){
                        if(omit3.getText().toString() == correct){
                            score++;
                        }
                        setQuestion(questionNum);
                    }
                }else {
                    Toast.makeText(synonym.this, "GAME OVER", Toast.LENGTH_LONG).show();
                }

                Toast.makeText(synonym.this, "Score: " + score, Toast.LENGTH_LONG).show();
            }
        });

    }

    void setQuestion(int x){
        omitQuestion.setText(synonymClass.getQuestion(x));

        omit1.setText(synonymClass.getAnswers1(x));
        omit2.setText(synonymClass.getAnswers2(x));
        omit3.setText(synonymClass.getAnswers3(x));

        correct = synonymClass.getCorrectAnswer(x);

    }
}
