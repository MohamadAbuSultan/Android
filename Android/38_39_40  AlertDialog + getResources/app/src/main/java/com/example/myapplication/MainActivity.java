package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    alertDialog = new AlertDialog.Builder(MainActivity.this);
                    alertDialog.setTitle(getResources().getString(R.string.mohamad_abu_sultan));
                    // هذه الطريقة يعتبروها أفضل
                  // تعطيك ال value نفسها
                // هاي تعتبر أحسن وأسرع

                // ما راح تعطيك ال key
                 //  زي الطريقة السابقة (R.string)
                //  ال key بيعطيلك ال integer إلي هو ال address المخزون لهذا ال object  ويطلع القيمة تعته ويرجعلك إياه

                    alertDialog.setMessage(R.string.hello_world);
                    alertDialog.setCancelable(false); // حتى ما يستطيع اليوزر يتهرب من عندها
                   // هاي يعني وين ما تغضط عالفاضي ما بطلع برا ال  alert  لازم يضغط على ok or cancel
                    alertDialog.setPositiveButton(R.string.positive_button, new DialogInterface.OnClickListener() {
                        // ok or cancel
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            MainActivity.this.finish();
                            //  أخرج من التطبيق إذا ضغطت yes
                        }
                    });
                    alertDialog.setNegativeButton(R.string.negative_button, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                            // يغلق ال dialog
                        }
                    });

                    AlertDialog dialog = alertDialog.create();
                    dialog.show();
            }
        });
    }
}