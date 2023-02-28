package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView results;
    private CheckBox checkJava;
    private CheckBox checkPython;
    private CheckBox checkCplusplus;
    private CheckBox checkC;
    private Button buttonShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         results = findViewById(R.id.mytextview);
         checkJava = findViewById(R.id.java);
         checkPython = findViewById(R.id.python);
         checkCplusplus = findViewById(R.id.cplusplus);
         checkC = findViewById(R.id.c);
         buttonShow = findViewById(R.id.buttonShow);

         buttonShow.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 StringBuilder stringBuilder = new StringBuilder();
                 if(checkJava.isChecked()) {
                     stringBuilder.append(checkJava.getText().toString() + "\n");
                 }
                 if(checkPython.isChecked()) {
                     stringBuilder.append(checkPython.getText().toString() + "\n");
                 }
                 if(checkCplusplus.isChecked()) {
                     stringBuilder.append(checkCplusplus.getText().toString() + "\n");
                 }
                 if(checkC.isChecked()) {
                     stringBuilder.append(checkC.getText().toString() + "\n");
                 }
                results.setText(stringBuilder);

             }
         });
    }
}