package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressBarDemo extends AppCompatActivity {

    Button progress_bar_btn;
    ProgressBar progress_bar;
    int progress_value = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar_demo);

        progress_bar = (ProgressBar) findViewById(R.id.progress_bar);
        progress_bar_btn = (Button) findViewById(R.id.progress_bar_btn);

    }
    public void startParogressBar(View view) {
        progress_bar_btn.setVisibility(View.GONE);
        setProgessbarValue(progress_value);
    }
    void setProgessbarValue(int i) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                progress_bar.setProgress(i);
                setProgessbarValue(i + 1);
            }
        });
        thread.start();
    }
}