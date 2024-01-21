package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CustomAlertDialogDemo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_alert_dialog_demo);
    }
    public void getCustomAlertDialog(View view) {
        Dialog dialog = new Dialog(CustomAlertDialogDemo.this);
        dialog.setContentView(R.layout.layout_custom_alertdialog);

        // ----- to find another layout id ------
        Button cus_dialog_btn = (Button) dialog.findViewById(R.id.cus_layout_alert);
        cus_dialog_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss(); // it use to show and automatically close it by using dismiss() method
                Toast.makeText(CustomAlertDialogDemo.this, "Custom Dialog Opened....", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();
    }
}