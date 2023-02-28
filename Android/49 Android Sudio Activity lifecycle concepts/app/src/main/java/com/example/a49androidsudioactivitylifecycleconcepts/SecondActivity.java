package com.example.a49androidsudioactivitylifecycleconcepts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // لإستلام أي شيء من واجهات ثانية
        Bundle extras = getIntent().getExtras();
        textView = findViewById(R.id.textViewFromFirst);
        button = findViewById(R.id.buttonback);

        String FirstName = extras.getString("FirstName");
        String LastName = extras.getString("LastName");
        String WelcomeMessage = extras.getString("WelcomeMessage");
        int Age = extras.getInt("Age");
        double Salary = extras.getDouble("Salary");
        textView.setText(FirstName + " " + "\n" +LastName + " " + "\n"
                +WelcomeMessage  + " " + "\n"
                +Age  + " " + "\n"
                + Salary);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = getIntent();
                backIntent.putExtra("WelcomeMessage", "Data Back From Second Activity");
                setResult(RESULT_OK, backIntent);
                // main activity لنقوله هذا لل
                finish();
            }
        });
    }

}