package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimePickerDemo extends AppCompatActivity {

    TimePicker time_picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        time_picker = (TimePicker) findViewById(R.id.time_picker);

        time_picker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hours, int min) {
                Toast.makeText(getApplicationContext(), hours+":"+min, Toast.LENGTH_SHORT).show();

            }
        });

    }
}