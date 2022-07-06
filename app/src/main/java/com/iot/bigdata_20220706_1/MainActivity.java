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
    int b_state = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (b_state == 1) {
                    textView.setText("Good Bye~");
                    //button.setBackgroundColor();
                    b_state++;
                }else if(b_state == 2){
                    textView.setText("Hello World!");
                    //button.setBackgroundColor();
                    b_state--;
                }
            }
        });
    }
}