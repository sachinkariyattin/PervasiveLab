package com.pervasive.sachin.pervasivequiz;


public class SoccerQuestionLibrary {

    private String mQuestions [] = {
            "Which team does Zlatan play for?",
            "Which team does Ronaldo play for?",
            "Which team does Kane play for?",
            "Which team does Aguero play for?",
            "Which team does Vardy play for?"
    };

    private String mChoices [][] = {
            {"Tottenham", "Everton", "Manchester City", "Manchester United"},
            {"Tottenham", "Everton", "Real Madrid", "Manchester United"},
            {"Tottenham", "Real Madrid", "Manchester City", "Manchester United"},
            {"Manchester City", "Everton", "Tottenham", "Manchester United"},
            {"Leicester City", "Everton", "Manchester City", "Manchester United"}
    };


    private String mCorrectAnswers[] = {"Manchester United", "Real Madrid", "Tottenham", "Manchester City", "Leicester City"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice2 = mChoices[a][3];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
