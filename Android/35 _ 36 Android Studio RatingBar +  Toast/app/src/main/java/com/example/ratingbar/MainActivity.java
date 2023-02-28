package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonShow;
    TextView textViewResult;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonShow = findViewById(R.id.buttonshow);
        textViewResult = findViewById(R.id.myTextView);
        ratingBar = findViewById(R.id.ratingBar);

        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String totalValue = ratingBar.getNumStars() + ""; // ال " " عشان نحوله ل string
                String rating = ratingBar.getRating() + "";
                textViewResult.setText("total value is : " + totalValue + "\n" +  " Your Result is :  " +  rating );
                Toast.makeText(getApplicationContext(), " Your Result is :  " +  rating, Toast.LENGTH_SHORT).show();
                // Toast مثل تنبيه

            }
        });
    }
}