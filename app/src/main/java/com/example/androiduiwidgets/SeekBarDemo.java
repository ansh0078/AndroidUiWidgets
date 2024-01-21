package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarDemo extends AppCompatActivity {

    SeekBar seek_bar;
    TextView tv_seek_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar_demo);

        seek_bar = (SeekBar) findViewById(R.id.seek_bar);
        tv_seek_bar = (TextView) findViewById(R.id.tv_seek_bar);


        seek_bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress_value = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int new_progr, boolean b) {
                progress_value = new_progr;
                // ---- it show continues value with seek bar
                tv_seek_bar.setText(progress_value+" ");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                // ---- it show previous value with seek bar
//                tv_seek_bar.setText(progress_value+" ");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                // ---- it show exact point value with seek bar
//                tv_seek_bar.setText(progress_value+" ");
            }
        });
    }
}