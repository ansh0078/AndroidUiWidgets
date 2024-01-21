package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class TimePickerDialogDemo extends AppCompatActivity {;

    TextView timepickerdialog1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_dialog_demo);

        timepickerdialog1 = (TextView) findViewById(R.id.timepickerdialog1);

        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR);
        int min = c.get(Calendar.MINUTE);

        timepickerdialog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(TimePickerDialogDemo.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourss, int minn) {
                        timepickerdialog1.setText(hourss+":"+minn);
                    }
                },hour,min, false);
                timePickerDialog.show();
            }
        });

    }
}