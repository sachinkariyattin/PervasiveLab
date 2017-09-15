package com.pervasive.sachin.pervasivequiz;

public class CricketQuestionLibrary {

    private String mQuestions [] = {
            "How many international 100's has Sachin Tendulkar scored?",
            "He is the captain of Indian cricket team.",
            "Hardik's last name.",
            "Number of world cups won by Australia",
            "Six 6's in an over"
    };

    private String mChoices [][] = {
            {"10", "20", "30", "100"},
            {"Suresh", "Virat", "Jadeja", "Amir Khan"},
            {"Pundya", "Mandya", "Sharma", "Pandya"},
            {"1", "2", "3", "5"},
            {"Hayden", "Yuvraj", "Sachin", "Virat"}
    };


    private String mCorrectAnswers[] = {"100", "Virat", "Pandya", "5", "Yuvraj"};

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
