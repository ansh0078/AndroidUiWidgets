package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Button_Click_Event_Two extends AppCompatActivity {

    EditText ed_click_two, ed_click_show_two;
    Button btn_click_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click_event_two);

        ed_click_two = (EditText) findViewById(R.id.et_click_two);
        btn_click_two = (Button) findViewById(R.id.btn_event_two);
        ed_click_show_two = (EditText) findViewById(R.id.et_click_show_two);

    }
    public void getUserName(View view){
        String name = ed_click_two.getText().toString();
        //ed_click_show_two.setText("Name : "+name);

        Toast.makeText(this, "Your Name is : "+name, Toast.LENGTH_LONG).show();
        // getApplicationContext(), --- to show the current class

    }
}