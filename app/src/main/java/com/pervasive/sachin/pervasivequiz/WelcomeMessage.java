package com.pervasive.sachin.pervasivequiz;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class WelcomeMessage extends Fragment {
    // TODO: Rename parameter arguments, choose names that match



    public WelcomeMessage() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (getArguments() != null) {
            if (getArguments().getString("CRICKET_SCORE") != null) {
                String score = getArguments().getString("CRICKET_SCORE");
                Toast.makeText(WelcomeMessage.this.getActivity(), "Cricket Quiz Score" +
                        ": "+score , Toast.LENGTH_LONG).show();
            }
            else if (getArguments().getString("SOCCER_SCORE") != null) {
                String score = getArguments().getString("SOCCER_SCORE");
                Toast.makeText(WelcomeMessage.this.getActivity(), "Soccer Quiz Score" +
                        ": "+score , Toast.LENGTH_LONG).show();
            }
            else {
                String score = getArguments().getString("TECH_SCORE");
                Toast.makeText(WelcomeMessage.this.getActivity(), "Tech Quiz Score" +
                        ": "+score , Toast.LENGTH_LONG).show();
            }
        }
        View v = inflater.inflate(R.layout.fragment_welcome_message, container, false);

        return v;
    }

}
