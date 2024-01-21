package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Custom_Toast extends AppCompatActivity {

    EditText et_toast_name;
    TextView tv_toast_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);

        et_toast_name = (EditText) findViewById(R.id.et_toast_name);

    }
    public void getCustomToast(View view) {
        LayoutInflater lf = getLayoutInflater();
        View layout = lf.inflate(R.layout.layout_custom_toast, (ViewGroup) findViewById(R.id.ct_toast));

        tv_toast_name = (TextView) layout.findViewById(R.id.tv_toast_name);

        String name = et_toast_name.getText().toString();
        tv_toast_name.setText("name is "+name);

        Toast t = new Toast(getApplicationContext());
        t.setGravity(Gravity.CENTER,0,0); // to show position of the layout
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(layout);
        t.show();
    }

}