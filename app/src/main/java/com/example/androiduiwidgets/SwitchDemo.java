package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class SwitchDemo extends AppCompatActivity {

    Switch wifi_switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_demo);

        wifi_switch = (Switch) findViewById(R.id.wifi_switch);
    }
    public void getSwitch(View view) {
        if(wifi_switch.isChecked()){
            Toast.makeText(this, "Wifi Onn", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Wifi Off", Toast.LENGTH_LONG).show();
        }
    }
}