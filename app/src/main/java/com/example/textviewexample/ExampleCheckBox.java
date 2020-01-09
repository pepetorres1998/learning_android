package com.example.textviewexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ExampleCheckBox extends AppCompatActivity {
    CheckBox checkBox1, checkBox2, checkBox3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_checkbox);

        checkBox1 = findViewById(R.id.checkb1);
        checkBox2 = findViewById(R.id.checkb2);
        checkBox3 = findViewById(R.id.checkb3);
        button = findViewById(R.id.button_submit);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ArrayList<CheckBox> checkBoxes = new ArrayList<CheckBox>(){
                    {
                        if(checkBox1.isChecked()) add(checkBox1);
                        if(checkBox2.isChecked()) add(checkBox2);
                        if(checkBox3.isChecked()) add(checkBox3);
                    }
                };

                String statement = "";

                for(int i=0; i<checkBoxes.size(); i++){
                    CheckBox checkBox = checkBoxes.get(i);

                    if (i == checkBoxes.size() - 1){
                        statement += checkBox.isChecked() ? checkBox.getText() : "";
                    } else {
                        statement += checkBox.isChecked() ? checkBox.getText() + ", " : "";
                    }
                }

                statement = statement == "" ? "Elige una opción" : statement;

                Toast.makeText(getApplicationContext(), statement, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
