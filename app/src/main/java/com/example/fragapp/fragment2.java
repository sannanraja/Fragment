package com.example.fragapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class fragment2 extends ListFragment {
    String[] stringone=new String[]
            {"Hello",
    "Sanann",
    "Never",
    "Lose",
    "Hope"};
    String[] stringtwo=new String[]
            {"Hello",
                    "Friends",
                    "Never",
                    "Lose",
                    "Hope"};



    public fragment2() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment2,container,false);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,stringone);
        setListAdapter(adapter);
        return view;
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        fragment1 txt= (fragment1) getChildFragmentManager().findFragmentById(R.id.fragment1);
        txt.change(stringone[position],"version : "+stringtwo);
        getListView().setSelector(android.R.color.holo_blue_bright);
    }
}