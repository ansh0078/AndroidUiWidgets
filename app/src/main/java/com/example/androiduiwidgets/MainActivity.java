package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openAlertDialog(View view) {
        startActivity(new Intent(MainActivity.this, AlertDialogDemo.class));
    }
    public void openButtonClick(View view) {
        startActivity(new Intent(MainActivity.this, Button_Click_Event_Demo.class));
    }
    public void openButtonDesign(View view) {
        startActivity(new Intent(MainActivity.this, Button_design.class));
    }
    public void openCustomToast(View view) {
        startActivity(new Intent(MainActivity.this, Custom_Toast.class));
    }
    public void openCustomAlertDialog(View view) {
        startActivity(new Intent(MainActivity.this, CustomAlertDialogDemo.class));
    }
    public void openDatePicker(View view) {
        startActivity(new Intent(MainActivity.this, DatePickerDemo.class));
    }
    public void openDatePickerDialog(View view) {
        startActivity(new Intent(MainActivity.this, DatePickerDialogDemo.class));
    }
    public void openImageButton(View view) {
        startActivity(new Intent(MainActivity.this, ImageButton.class));
    }
    public void openImageSwitcher(View view) {
        startActivity(new Intent(MainActivity.this, ImageSwitcherDemo.class));
    }
    public void openMyFrom(View view) {
        startActivity(new Intent(MainActivity.this, MyFrom.class));
    }
    public void openProgressBar(View view) {
        startActivity(new Intent(MainActivity.this, ProgressBarDemo.class));
    }
    public void openProgressDialog(View view) {
        startActivity(new Intent(MainActivity.this, ProgressDialogDemo.class));
    }
    public void openRatingBar(View view) {
        startActivity(new Intent(MainActivity.this, RatingBarDemo.class));
    }
    public void openScrollView(View view) {
        startActivity(new Intent(MainActivity.this, ScrollViewDemo.class));
    }
    public void openSeekBar(View view) {
        startActivity(new Intent(MainActivity.this, SeekBarDemo.class));
    }
    public void openSpinner(View view) {
        startActivity(new Intent(MainActivity.this, Spinner_demo.class));
    }
    public void openSwitch(View view) {
        startActivity(new Intent(MainActivity.this, SwitchDemo.class));
    }
    public void openTimePicker(View view) {
        startActivity(new Intent(MainActivity.this, TimePickerDemo.class));
    }
    public void openTimePickerDialog(View view) {
        startActivity(new Intent(MainActivity.this, TimePickerDialogDemo.class));
    }
    public void openToggleButton(View view) {
        startActivity(new Intent(MainActivity.this, ToggleButtonDemo.class));
    }
    public void openViewFlipper(View view) {
        startActivity(new Intent(MainActivity.this, ViewFlipper.class));
    }
    public void openSearchView(View view) {
        startActivity(new Intent(MainActivity.this, SearchViewDemo.class));
    }
    public void openWebView(View view) {
        startActivity(new Intent(MainActivity.this, WebViewDemo.class));
    }
}