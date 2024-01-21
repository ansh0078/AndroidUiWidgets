package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MyFrom extends AppCompatActivity {

    EditText et_name_from, et_password_from;
    RadioButton rb_male, rb_female;
    CheckBox cb_android, cb_python, cb_java, cb_cpp;
    Spinner sp_course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_from);

        et_name_from = (EditText) findViewById(R.id.et_name_from);
        et_password_from = (EditText) findViewById(R.id.et_password_from);

        rb_male = (RadioButton) findViewById(R.id.rb_male);
        rb_female = (RadioButton) findViewById(R.id.rb_female);


        cb_android = (CheckBox) findViewById(R.id.cb_android);
        cb_java = (CheckBox) findViewById(R.id.cb_java);
        cb_python = (CheckBox) findViewById(R.id.cb_python);
        cb_cpp = (CheckBox) findViewById(R.id.cb_cpp);

        sp_course = (Spinner) findViewById(R.id.sp_course);

    }
    public void getAllDetails(View view){

        // ------------------------- to get Value from EditText ------------------------------------------
        String name = et_name_from.getText().toString();
        String password = et_password_from.getText().toString();

        // ------------------------- to get Value from Radio Button ------------------------------------------
        String gender = " ";
        if(rb_male.isChecked()){
            gender = rb_male.getText().toString();
        }
        if(rb_female.isChecked()){
            gender = rb_female.getText().toString();
        }

        // ------------------------- to get Value from Check Box ------------------------------------------
        String subject = "";
        if(cb_android.isChecked()){
            subject = cb_android.getText().toString();
        }
        if(cb_java.isChecked()){
            subject = cb_java.getText().toString();
        }
        if(cb_python.isChecked()){
            subject = cb_python.getText().toString();
        }
        if(cb_cpp.isChecked()){
            subject = cb_cpp.getText().toString();
        }

        // ------------------------- to get Value from Spinner ------------------------------------------
        String course = sp_course.getSelectedItem().toString();

        // ------------------------- to show Values by using Toast ------------------------------------------

        String result = name+"\n"+password+"\n"+gender+"\n"+subject+"\n"+course;
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }
}