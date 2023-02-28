package com.example.string;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton.setText(R.string.my_name);

        // strings للكتابات
        // xml يحتاج شيئين أساسيين
        // المفتاح والقيمة
        //  إسم متغير
        // إلي بين القوسين <> هي القيمة إلي هتظهر للمستخدم
        // هاي الطريقة أكثر إحترافية ، ليش ؟
        // لما تشتغل على مشروع وتستخدم المتغيرات في ال string راح ترتاح كثير
    }
}