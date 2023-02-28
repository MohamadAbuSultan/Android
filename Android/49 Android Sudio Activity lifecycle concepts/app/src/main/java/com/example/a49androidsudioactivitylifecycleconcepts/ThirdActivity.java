package com.example.a49androidsudioactivitylifecycleconcepts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Bundle extras = getIntent().getExtras();
        textView = findViewById(R.id.textView4);

        String FirstName = extras.getString("FirstName");
        String LastName = extras.getString("LastName");
        String WelcomeMessage = extras.getString("WelcomeMessage");
        int Age = extras.getInt("Age");
        double Salary = extras.getDouble("Salary");
        textView.setText(FirstName + "\n" +LastName + "\n"
                +WelcomeMessage   + "\n"
                +Age  +  "\n"
                + Salary);
    }
}