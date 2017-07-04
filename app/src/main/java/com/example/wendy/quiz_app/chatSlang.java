package com.example.wendy.quiz_app;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.wendy.quiz_app.R.id.yolo;

public class chatSlang extends Activity {

    static RadioButton yolo1,yolo2,yolo3;
    TextView yoloQuestion, asapQuestion, brbQuestion, lmkQuestion, wcwQuestion, tiaQuestion, btwQuestion, npQuestion, ttylQuestion;
    Button next;

    QuestionClass questionClass = new QuestionClass();
    String correct;
    int questionNum = 0, score;
    int qLegnth = questionClass.slangQuestion.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_slang);

        yolo1 = (RadioButton)findViewById(R.id.radyolo1);
        yolo2 = (RadioButton)findViewById(R.id.radyolo2);
        yolo3 = (RadioButton)findViewById(R.id.radyolo3);
        yoloQuestion = (TextView)findViewById(R.id.yolo);
        next = (Button)findViewById(R.id.btnNext);
        setQuestion(questionNum);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionNum++;
                if(questionNum < qLegnth){
                    if(yolo1.isChecked()){
                        if(yolo1.getText().toString() == correct){
                            score++;
                        }
                        setQuestion(questionNum);
                    }
                    if(yolo2.isChecked()){
                        if(yolo2.getText().toString() == correct){
                            score++;
                        }
                        setQuestion(questionNum);
                    }
                    if(yolo3.isChecked()){
                        if(yolo3.getText().toString() == correct){
                            score++;
                        }
                        setQuestion(questionNum);
                    }
                }else {
                    Toast.makeText(chatSlang.this, "GAME OVER", Toast.LENGTH_LONG).show();
                }

                Toast.makeText(chatSlang.this, "Score: " + score, Toast.LENGTH_LONG).show();
            }
        });

    }

    void setQuestion(int x){
        yoloQuestion.setText(questionClass.getQuestion(x));

        yolo1.setText(questionClass.getAnswers1(x));
        yolo2.setText(questionClass.getAnswers2(x));
        yolo3.setText(questionClass.getAnswers3(x));

        correct = questionClass.getCorrectAnswer(x);
    }
}
