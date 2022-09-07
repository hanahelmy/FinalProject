package com.example.healthbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
        ArrayList<workouts> workoutsArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        workouts lunges = new workouts("lunges" , "no equipment" , R.drawable.lunges);
        workouts pushups = new workouts("pushups" , "no equipment" , R.drawable.pushup);
        workouts squats = new workouts("squats" , "no equipment" , R.drawable.squat);
        workouts plank = new workouts("plank" , "no equipment" , R.drawable.plank);
        workouts crunshes = new workouts("crunshes" , "no equipment" , R.drawable.crunches);

        workoutsArrayList.add(lunges);
        workoutsArrayList.add(pushups);
        workoutsArrayList.add(squats);
        workoutsArrayList.add(plank);
        workoutsArrayList.add(crunshes);

        workoutsadapter workoutsadapter = new workoutsadapter(this, 0 , workoutsArrayList);
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(workoutsadapter);



    }
}