package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonDemo extends AppCompatActivity {

    ToggleButton wifi_toggle_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button_demo);

        wifi_toggle_button = (ToggleButton) findViewById(R.id.wifi_toggle_button);
    }
    public void getToogleButton(View view) {
        if(wifi_toggle_button.isChecked()) {
            Toast.makeText(this, "Wifi onn", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Wifi off", Toast.LENGTH_LONG).show();
        }
    }
}