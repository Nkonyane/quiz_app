package com.example.wendy.quiz_app;

import static com.example.wendy.quiz_app.QuestionClass.slangQuestion;

/**
 * Created by Wendy on 2017/06/26.
 */

public class synonymClass {
    public static String synonymQuestion[] ={

            "Synonym of Duo",
            "Synonym of enormous",
            "Synonym of Omit",
            "Synonym of Frolic",
            "Synonym of Winner",
            "Synonym of Walk",
            "Synonym of Stop",
            "Synonym of continue",
            "Synonym of Word",
            "Synonym of story",

    };

    //@-Dimensional Array
    static String answers[][] = {
            {"Choir", "Group","Pair"},
            {"Unknown", "Huge", "Weird"},
            {"Vomit","swallow","Remove"},
            {"Play","Medicine","Fraud"},
            {"Victor","very good","Yey!!"},
            {"Stroll","way","Road"},
            {"wait","Slow down","Halt"},
            {"Repeat","Again","Endure"},
            {"Sentence","Expression","Talk To You Later"},
            {"Tail","Tale","Movie"}
    };

    //Correct Answers
    static String correctAnswer[] = {
            "Pair",
            "Huge",
            "Remove",
            "Play",
            "Victor",
            "Stroll",
            "Halt",
            "Endure",
            "Expression",
            "Tale"
    };
    public String getQuestion(int x) {
        String q = synonymQuestion[x];
        return q;
    }

    public String getAnswers1(int x) {
        String ans = answers[x][0];
        return ans;
    }

    public String getAnswers2(int x) {
        String ans = answers[x][1];
        return ans;
    }

    public String getAnswers3(int x) {
        String ans = answers[x][2];
        return ans;
    }

    public String getCorrectAnswer(int x) {
        String cAnswer = correctAnswer[x];
        return cAnswer;
    }

}
