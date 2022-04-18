package com.example.fragapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class fragment1 extends Fragment {
TextView textView1,textView2;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters


    public fragment1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


View view =inflater.inflate(R.layout.fragment_fragment1, container, false);
        textView1=(TextView) view.findViewById(R.id.textView1);
        textView2=(TextView)view.findViewById(R.id.textView2);



        return view;
    }

    public void change(String txt, String txt1)
    {
        textView1.setText(txt);
        textView2.setText(txt1);
    }
}