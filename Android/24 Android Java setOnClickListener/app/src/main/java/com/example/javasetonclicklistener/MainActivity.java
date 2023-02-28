package com.example.javasetonclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
// 24 Android Java setOnClickListener
public class MainActivity extends AppCompatActivity {
    Button myButton;
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.myButton);
        myTextView = findViewById(R.id.myTextView);


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView.setTextColor(Color.YELLOW);
                myTextView.setBackgroundColor(Color.BLUE);
                myTextView.setText(R.string.my_text);
            }
        });
        // هاي نفس فكرة الفنكشن
        // لما يكون عندك buttons كثيرة ممكن أنو نفضل طريقة الفنكشن العادية
    }
}