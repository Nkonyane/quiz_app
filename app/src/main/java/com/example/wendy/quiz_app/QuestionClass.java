package com.example.wendy.quiz_app;

import static android.R.attr.x;

/**
 * Created by Wendy on 2017/06/26.
 */

public class QuestionClass {

    //Declaring Questions
    //One-Dimensional Array
    public static String[] slangQuestion = {
            "Acronym of yolo",
            "Acronym of ASAP",
            "Acronym of BRB",
            "Acronym of LMK",
            "Acronym of WCW",
            "Acronym of BTW",
            "Acronym of TIA",
            "Acronym of NP",
            "Acronym TTYL"

    };

    //@-Dimensional Array
    static String answers[][] = {
            {"You Only Live Once", "You Only Love Once","You Only Live Life"},
            {"Always Seen As Pride", "As Soon AS Possible", "After Seeing All People"},
            {"Be right Back","Be Right Beside","Bored Really Bored"},
            {"Let Me Know","Love My Kitty","Love My King"},
            {"World's Cutest Woman","We Care ","Woman Crush Wednesday"},
            {"Be That Woman","By The Way","Buy Those Wine"},
            {"weeee","joooo","Thanks In Advance"},
            {"No Problem","No Phone","No Pressure"},
            {"Tell The Young Ladies","Thanks To You Love","Talk To You Later"},
    };

    //Correct Answers
    static String correctAnswer[] = {
        "You Only Live Once",
        "As Soon AS Possible",
            "Be right Back",
            "Let Me Know",
            "Woman Crush Wednesday",
            "Acronym of BTW",
            "Thanks In Advance",
            "No Problem",
            "Talk To You Later"






















    };

    public String getQuestion(int x) {
        String q = slangQuestion[x];
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
