package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class DatePickerDemo extends AppCompatActivity {

    DatePicker date_picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_demo);

        date_picker = (DatePicker) findViewById(R.id.date_picker);
        //int month = date_picker.getMonth();
    }
    public void getDatePicker(View view) {
//        int month = date_picker.getMonth();
//        float year = date_picker.getYear();
//        int date = date_picker.getDayOfMonth();
//        Toast.makeText(this, "date : "+date+" month : "+(month + 1)+" year : "+year, Toast.LENGTH_SHORT).show();

        // it show the current date
        Calendar c = Calendar.getInstance();
        int date = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);
        Toast.makeText(this, "date : "+date+" month : "+(month + 1)+" year : "+year, Toast.LENGTH_SHORT).show();
    }
}