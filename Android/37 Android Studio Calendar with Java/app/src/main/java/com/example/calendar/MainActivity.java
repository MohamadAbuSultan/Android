package com.example.calendar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    CalendarView calendarView;
    // Calendar calendar; // بفيدك بالفورمات ، تحويل من كالندر لكالندر للداتابيز
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = findViewById(R.id.calendarView);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
                String myDate = "Year : " + year + "-"+ " month : " + month + "-"+ " day : " + dayOfMonth;
                Toast.makeText(getApplicationContext(),myDate , Toast.LENGTH_SHORT).show();
                textView.setText(myDate);
            }
        });
    }
}