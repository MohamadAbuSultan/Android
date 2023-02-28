package com.example.radiobutton;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // encapsulation
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.checkedId);
        textView = findViewById(R.id.textView);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            // هذا إلي راح يراقب العملية إلي هتختارها
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkedId) {
                radioButton = findViewById(checkedId);
                // switch or if ??
                // switch أرتب وأكثر كفاءة لما يكون عندك أكثر من خيار
                switch (radioButton.getId()) {
                    case (R.id.pizzaId): {
                        textView.setVisibility(View.VISIBLE);
                        textView.setText("Pizza");
                        break;
                    }
                    case (R.id.hamburgerId): {
                        textView.setVisibility(View.VISIBLE);
                        textView.setText("Hamburger");
                        break;
                    }
                    case (R.id.shawermaId): {
                        textView.setVisibility(View.VISIBLE);
                        textView.setText("Mohamad");
                        break;
                    }
                }
            }
        });
        // لما تتغير عملية الإختيار لل radio button
    }
    // كيف يميز إذا كل ال radio في مجموعة واحدة ؟
    // عن طريق radio group
}
// log.d("logid" , "Hamburger"); // debugging  بفيدك بال