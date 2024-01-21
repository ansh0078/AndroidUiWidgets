package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class DatePickerDialogDemo extends AppCompatActivity {

    TextView datepickerdialog1;

    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_dialog_demo);

        datepickerdialog1 = (TextView) findViewById(R.id.datepickerdialog);

        Calendar c = Calendar.getInstance();
        int date = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);

        datepickerdialog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePickerDialog = new DatePickerDialog(DatePickerDialogDemo.this, new DatePickerDialog.OnDateSetListener() {
                     @Override
                     public void onDateSet(DatePicker datePicker, int years, int months, int days) {
                         datepickerdialog1.setText(days+"/"+(months + 1)+"/"+years);
                     }
                 },year,month,date);
                 datePickerDialog.show();
            }
        });
    }
}