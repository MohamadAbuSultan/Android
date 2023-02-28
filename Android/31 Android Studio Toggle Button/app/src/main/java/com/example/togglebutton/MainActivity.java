package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView1);
        toggleButton = findViewById(R.id.toggleButton);
        // أي button لازم يكون إله listener
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked){
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("Wifi On");
                }else{
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("Wifi Off");
                }
            }
        }); // تغيير الحالة
    }
}
// Function => small  أول حرف
// Class ==> capital أول حرف