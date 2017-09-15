package com.pervasive.sachin.pervasivequiz;

public class TechQuestionLibrary {

    private String mQuestions [] = {
            "Who is the CEO of Amazon?",
            "Who is the CEO of Google?",
            "Who is the CEO of Facebook?",
            "Who is the CEO of Apple?",
            "Which phone does Apple make?"
    };

    private String mChoices [][] = {
            {"Jeff Bezos", "Mark Zuckerberg", "Sundar Pichai", "Bill Gates"},
            {"Mark Zuckerberg", "Sundar Pichai", "Mark Zuckerberg", "Bill Gates"},
            {"Jeff Bezos", "Mark Zuckerberg", "Sundar Pichai", "Bill Gates"},
            {"Mark Zuckerberg", "Tim Cook", "Sundar Pichai", "Bill Gates"},
            {"Galaxy", "Fire", "Ice", "iPhone"}
    };


    private String mCorrectAnswers[] = {"Jeff Bezos", "Sundar Pichai", "Mark Zuckerberg", "Tim Cook", "iPhone"};

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
