package com.example.healthbuddy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.tabs.TabLayout;

import java.util.List;

public class workoutsadapter extends ArrayAdapter<workouts>
{
    List<workouts> workoutsList;

    public workoutsadapter(@NonNull Context context, int resource, @NonNull List<workouts> objects) {
        super(context, resource, objects);
        workoutsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.listitem, parent , false);

        workouts currentworkout = workoutsList.get(position);
        TextView workoutname = view.findViewById(R.id.workoutname);
        TextView workouttype = view.findViewById(R.id.workouttype);
        ImageView workoutpic = view.findViewById(R.id.workoutpic);

        workoutname.setText(currentworkout.getExename());
        workouttype.setText(currentworkout.getType());
        workoutpic.setImageResource(currentworkout.getExepic());

        return view;

    }
}
