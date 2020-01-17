package com.example.textviewexample;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class ExampleSwitch extends AppCompatActivity {
    LinearLayout linearLayout;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_switch);

        linearLayout = findViewById(R.id.linearlayout1);
        aSwitch = findViewById(R.id.switch1);

        aSwitch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (aSwitch.isChecked()) {
                    linearLayout.setBackgroundColor(Color.YELLOW);
                } else {
                    linearLayout.setBackgroundColor(Color.GREEN);
                }
            }
        });
    }
}
