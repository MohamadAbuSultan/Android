package com.example.a54_androidactivityintentbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private ImageView androidImage, javaImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidImage = findViewById(R.id.androidImage);
        javaImage = findViewById(R.id.javaImage);

        androidImage.setOnClickListener(this);
        javaImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.androidImage:
                // Toast.makeText(MainActivity.this,"Android", Toast.LENGTH_SHORT ).show();
                Intent intentAndroid = new Intent(MainActivity.this, DetailsActivity.class);
                intentAndroid.putExtra("name", "Android OS");
                intentAndroid.putExtra("mykey", "Android");
                intentAndroid.putExtra("details","Android is a mobile operating system based on a modified version of the Linux kernel and other open source software, designed primarily for touchscreen mobile devices such as smartphones and tablets.");
                startActivity(intentAndroid);
                break;

            case R.id.javaImage:
                // Toast.makeText(MainActivity.this,"Java", Toast.LENGTH_SHORT ).show();
                Intent intentJava = new Intent(MainActivity.this, DetailsActivity.class);
                intentJava.putExtra("name", "Java Programming");
                intentJava.putExtra("mykey", "Java");
                intentJava.putExtra("details","Java (programming language) Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
                startActivity(intentJava);
                break;
        }
    }
}