package com.example.textviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ExampleTextView extends AppCompatActivity implements View.OnClickListener {
    TextView textView1, textView2, textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_textview);
        textView1 = findViewById(R.id.textview_one);
        textView2 = findViewById(R.id.textview_two);
        textView3 = findViewById(R.id.textview_three);

        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.textview_one:
                Toast.makeText(this, "This is First Text", Toast.LENGTH_SHORT).show();
                break;
            case R.id.textview_two:
                Toast.makeText(this, "This is Second Text", Toast.LENGTH_SHORT).show();
                break;
            case R.id.textview_three:
                Toast.makeText(this, "This is Third Text", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
