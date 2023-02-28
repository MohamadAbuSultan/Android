package com.example.a49androidsudioactivitylifecycleconcepts;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button  button2, button3;
    private final int REQUEST_CODE =2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"onCreate", Toast.LENGTH_SHORT).show();

        button2 = findViewById(R.id.buttonSecond);
        button3 = findViewById(R.id.buttonThird);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //آخر activity   إلى  activity للتحويل من
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("FirstName", "mohamad"); // شغلات إضافية ، خذها معك
                intent.putExtra("LastName", "Khaled");
                intent.putExtra("WelcomeMessage", "Hello");
                intent.putExtra("Age", 20);
                intent.putExtra("Salary",5000.55);
                // .this تعني من هذا الكلاس
                // تعني من الكلاس هذا إلى الكلاس هذاك
              //  startActivity(intent);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("FirstName", "mohamad"); // شغلات إضافية ، خذها معك
                intent.putExtra("LastName", "Khaled");
                intent.putExtra("WelcomeMessage", "Hello");
                intent.putExtra("Age", 21);
                intent.putExtra("Salary",4500.59);
                startActivity(intent);
                //                anonymous object
//                startActivity(new Intent(MainActivity.this, ThirdActivity.class));
            }
        });
    }

    // الثانيات activity ينتظر نتائج من ال
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE){
            if(resultCode == RESULT_OK){
                String returnData = data.getStringExtra("WelcomeMessage");
                Toast.makeText(getApplicationContext(), returnData, Toast.LENGTH_LONG).show();
            }
        }
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(getApplicationContext(),"onStart", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(getApplicationContext(),"onStop", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(getApplicationContext(),"onDestroy", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(getApplicationContext(),"onPause", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(getApplicationContext(),"onResume", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Toast.makeText(getApplicationContext(),"onRestart", Toast.LENGTH_SHORT).show();
//    }
}