package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AlertDialogDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_demo);
    }
    public void getAlertBox(View view) {
        AlertDialog.Builder alertDialogBulider = new AlertDialog.Builder(AlertDialogDemo.this);
        alertDialogBulider.setIcon(R.drawable.home);
        alertDialogBulider.setTitle("Close Window");
        alertDialogBulider.setCancelable(false);
        alertDialogBulider.setMessage("Do you want to close window??");
        alertDialogBulider.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "you clicked yes......!!!", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBulider.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertDialogDemo.this,"Noooo", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBulider.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertDialogDemo.this,"Cancell", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBulider.show();

    }
}