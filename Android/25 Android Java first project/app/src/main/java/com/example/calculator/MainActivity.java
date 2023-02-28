package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    TextView myResult;
    EditText number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         myButton = findViewById(R.id.myButton);
         myResult = findViewById(R.id.myResult);
         number1 = findViewById(R.id.number1);
         number2 = findViewById(R.id.number2);
    }

    public void getSum(View view){
        double myNumber1 = Double.parseDouble(number1.getText().toString());
        //  إلي راح يدخله اليوزر (بالتطبيق) يحصله على شكل  نص text
        // تحويل ال نص string إلى رقم double العملية هاي بنسميها casting
        double myNumber2 = Double.parseDouble(number2.getText().toString());

        myResult.setText( "Your Result is : "  + (myNumber1 + myNumber2) );
    }
}