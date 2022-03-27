package com.vaibhav.counter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.vaibhav.counter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding main_binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main_binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);

        LinearLayout s = main_binding.linearlayout;



    }
    public View createCounter(String title, boolean finalized, int value){
        View view;
        view = findViewById(R.id.counter_main);
        view.findViewById(R.id.remove_counter);
        ImageButton add = view.findViewById(R.id.add_counter);
        return view;
    }


}