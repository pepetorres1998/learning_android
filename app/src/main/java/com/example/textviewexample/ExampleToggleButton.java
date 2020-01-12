package com.example.textviewexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class ExampleToggleButton extends AppCompatActivity {
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_togglebutton);

        toggleButton = findViewById(R.id.toggle_button);

        toggleButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (toggleButton.isChecked()){
                    Toast.makeText(getApplicationContext(),
                            R.string.toggle_turn_on,
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            R.string.toggle_turn_off,
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
