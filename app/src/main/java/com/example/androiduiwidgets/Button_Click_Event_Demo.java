package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Button_Click_Event_Demo extends AppCompatActivity {

    TextView et_click;
    TextView et_click1;
    Button btn_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_event_demo);

        et_click = (TextView) findViewById(R.id.et_click);
        btn_click = (Button) findViewById(R.id.btn_event);
        et_click1 = (TextView) findViewById(R.id.et_click_show);

        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = et_click.getText().toString();
                //et_click1.setText("Name: "+name);

                Toast.makeText(Button_Click_Event_Demo.this, "Your Name is : "+name, Toast.LENGTH_LONG).show();
            }
        });
    }
}