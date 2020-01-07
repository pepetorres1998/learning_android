package com.example.textviewexample;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ExampleRadioButton extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radiobtn1, radiobtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_radiobutton);

        radioGroup = findViewById(R.id.radiogp1);
        radiobtn1 = findViewById(R.id.radiob1);
        radiobtn2 = findViewById(R.id.radiob2);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radiob1:
                        Toast.makeText(getApplicationContext(), "Male", Toast.LENGTH_SHORT)
                                .show();
                        break;
                    case R.id.radiob2:
                        Toast.makeText(getApplicationContext(), "Female", Toast.LENGTH_SHORT)
                                .show();
                        break;
                }
            }
        });
    }
}
