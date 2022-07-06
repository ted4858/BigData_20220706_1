package com.iot.bigdata_20220706_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    boolean isOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (isOn) {
                    textView.setText("Good Bye~");
                    button.setTextColor(Color.argb(255,255,255,255));
                    button.setBackgroundColor(Color.argb(255,0,0,0));
                    isOn = false;
                }else{
                    textView.setText("Hello World!");
                    button.setTextColor(Color.argb(255,0,0,0));
                    button.setBackgroundColor(Color.argb(255,255,255,255));
                    isOn = true;
                }
            }
        });
    }
}