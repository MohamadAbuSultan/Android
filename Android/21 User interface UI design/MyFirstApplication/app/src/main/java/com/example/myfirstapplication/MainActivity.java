package com.example.myfirstapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    TextView myTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);

        myButton = findViewById(R.id.myButton);
        myButton.setTextColor(Color.YELLOW);
        myButton.setBackgroundColor(Color.BLUE);
        myButton.setText("mohammad khaled abu sultan جايب العيد");
        // أي شيء في ال xml من رسومات ، صور ، زر ، نص ، يعتبر view
    }
}