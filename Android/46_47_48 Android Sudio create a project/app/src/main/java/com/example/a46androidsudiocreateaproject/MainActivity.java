package com.example.a46androidsudiocreateaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText number1, number2;
    private Button buttonSum, buttonMulti;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        buttonSum= findViewById(R.id. buttonSum);
        buttonMulti= findViewById(R.id. buttonMulti);
        textViewResult = findViewById(R.id.result);

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String myNumber1 = number1.getText().toString();
                    String myNumber2 = number2.getText().toString();
                    if(myNumber1.isEmpty() || myNumber2.isEmpty()){
                        Toast.makeText(getApplicationContext(), "Put Value", Toast.LENGTH_SHORT).show();
                    }else {
                        Double input1 = Double.parseDouble(myNumber1);
                        Double input2 = Double.parseDouble(myNumber2);
                        sumValues(input1,input2);
                        String finalResult = String.valueOf(sumValues(input1,input2));
                        textViewResult.setText("Result " +finalResult);
                    }
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myNumber1 = number1.getText().toString();
                String myNumber2 = number2.getText().toString();
                if(myNumber1.isEmpty() || myNumber2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Put Value", Toast.LENGTH_SHORT).show();
                }else {
                    Double input1 = Double.parseDouble(myNumber1);
                    Double input2 = Double.parseDouble(myNumber2);
                    multiValues(input1,input2);
                    String finalResult = String.valueOf(multiValues(input1,input2));
                    textViewResult.setText("Result " +finalResult);
                }
            }
        });

    }


    // void رأساً ينفذ
    // return برجع قيمة إلك عشان تعمل فيها إشي معين
    // ثانية  function بترجعها حتى تستخدمها ب


    private Double sumValues(Double number1, Double number2){
        return number1 + number2;
    }
    private Double multiValues(Double number1, Double number2){
        return number1 * number2;
    }
}