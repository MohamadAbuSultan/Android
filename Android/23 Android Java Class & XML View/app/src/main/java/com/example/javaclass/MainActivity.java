package com.example.javaclass;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button myButton;
    TextView myTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.myButton);
        myTextView = findViewById(R.id.myTextView);

        myButton.setText(R.string.my_name);
        // لما تضغط على الزر يغير النص
        // class listener لما أجي أعمل كليك على الزر أو عالتيكست فيو هيتخذ إجراء معين

    }
    public void clickMyButton(View view){
        myTextView.setTextColor(Color.YELLOW);
        myTextView.setBackgroundColor(Color.BLUE);
        myTextView.setText(R.string.my_text);
    }
}