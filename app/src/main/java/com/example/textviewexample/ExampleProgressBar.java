package com.example.textviewexample;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExampleProgressBar extends AppCompatActivity {
    TextView textView;
    ProgressBar progressBar;
    Button buttonStart;

    Handler handler;
    int progress=0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_progressbar);

        textView = findViewById(R.id.text_view);
        progressBar = findViewById(R.id.progress_bar);
        buttonStart = findViewById(R.id.progress_button);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        if (progressBar.getProgress() < 100) {
                            progressBar.setProgress(progress);
                            progress++;
                            handler.postDelayed(this, 100);
                            textView.setText("Wait...");
                        } else textView.setText("Finished");
                    }
                }, 100);
            }
        });
    }
}
