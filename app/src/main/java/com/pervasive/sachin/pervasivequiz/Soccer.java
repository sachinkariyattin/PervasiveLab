package com.pervasive.sachin.pervasivequiz;

import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Soccer extends Fragment {


    private SoccerQuestionLibrary mQuestionLibrary = new SoccerQuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    public Soccer() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Soccer");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_soccer, container, false);

        mScoreView = (TextView)v.findViewById(R.id.score);
        mQuestionView = (TextView)v.findViewById(R.id.question);
        mButtonChoice1 = (Button)v.findViewById(R.id.choice1);
        mButtonChoice2 = (Button)v.findViewById(R.id.choice2);
        mButtonChoice3 = (Button)v.findViewById(R.id.choice3);
        mButtonChoice4 = (Button)v.findViewById(R.id.choice4);


        updateQuestion();

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 2;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(Soccer.this.getActivity(), "correct", Toast.LENGTH_SHORT).show();

                }else {
                    mScore = mScore - 1;
                    updateScore(mScore);
                    Toast.makeText(Soccer.this.getActivity(), "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 2;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(Soccer.this.getActivity(), "correct", Toast.LENGTH_SHORT).show();

                }else {
                    mScore = mScore - 1;
                    updateScore(mScore);
                    Toast.makeText(Soccer.this.getActivity(), "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 2;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(Soccer.this.getActivity(), "correct", Toast.LENGTH_SHORT).show();

                }else {
                    mScore = mScore - 1;
                    updateScore(mScore);
                    Toast.makeText(Soccer.this.getActivity(), "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice4.getText() == mAnswer){
                    mScore = mScore + 2;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(Soccer.this.getActivity(), "correct", Toast.LENGTH_SHORT).show();

                }else {
                    mScore = mScore - 1;
                    updateScore(mScore);
                    Toast.makeText(Soccer.this.getActivity(), "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        return v;
    }

    private void updateQuestion(){
        if (mQuestionNumber < 5) {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
            mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        else {

            Fragment welcomeFragment = new WelcomeMessage();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            Bundle args = new Bundle();
            args.putString("SOCCER_SCORE", String.valueOf(mScore));
            welcomeFragment.setArguments(args);
            ft.replace(R.id.content_main, welcomeFragment);
            ft.commit();
        }
    }


    private void updateScore(int point) {
        if (mScore < 0) {
            mScore = 0;
        }
        if (mScore >= 0 && mQuestionNumber <= 5 && mScore <= 10 ) {
            mScoreView.setText("" + mScore);
        }
    }
}
