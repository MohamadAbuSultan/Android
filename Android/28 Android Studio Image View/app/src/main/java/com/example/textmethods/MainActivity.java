package com.example.textmethods;

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
            // كيف نضيف  صورة للتطبيق
            // على ال drawable بنروح وبنحط صورةوبس
            //

            // التأكد إذا ما كان المدخل من المستخدم فارغ أم لآ

            // الطريقة الأولى
//        if( !TextUtils.isEmpty(number1.getText().toString()) &&
//                !TextUtils.isEmpty(number2.getText().toString())    ){
//            double myNumber1 = Double.parseDouble(number1.getText().toString());
//            //  إلي راح يدخله اليوزر (بالتطبيق) يحصله على شكل  نص text
//            // تحويل ال نص string إلى رقم double العملية هاي بنسميها casting
//            double myNumber2 = Double.parseDouble(number2.getText().toString());
//            myResult.setText( "Your Result is : "  + (myNumber1 + myNumber2) );
//        }else{
//            myResult.setText( "Please Put Numbers");
//        }

            // الطريقة الثانية
            if( !number1.getText().toString().equals("") && !number2.getText().toString().equals("")  ){
                double myNumber1 = Double.parseDouble(number1.getText().toString());
                //  إلي راح يدخله اليوزر (بالتطبيق) يحصله على شكل  نص text
                // تحويل ال نص string إلى رقم double العملية هاي بنسميها casting
                double myNumber2 = Double.parseDouble(number2.getText().toString());
                myResult.setText( "Your Result is : "  + (myNumber1 + myNumber2) );
            }else{
                myResult.setText( "Please Put Numbers");
            }

        }
    }