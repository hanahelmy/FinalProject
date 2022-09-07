package com.example.healthbuddy.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.healthbuddy.MainActivity2;
import com.example.healthbuddy.MainActivity3;
import com.example.healthbuddy.R;
import com.google.android.material.button.MaterialButton;




public class Sidemenu extends Fragment {


    Button towo;


    public Sidemenu() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_sidemenu, container, false);
    }


}