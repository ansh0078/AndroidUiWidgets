package com.example.androiduiwidgets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;

public class ProgressDialogDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_dialog_demo);
    }
    public void openProgessDialog(View view) {

        // ---- this is use for horizontal -----
        ProgressDialog progressDialog = new ProgressDialog(ProgressDialogDemo.this);
        progressDialog.setTitle("Progress Dialog Box");
        progressDialog.setMessage("This is simple progress Dialog Box");
        progressDialog.setIcon(R.drawable.home);
        progressDialog.setProgressStyle(progressDialog.STYLE_HORIZONTAL);
        progressDialog.setCancelable(false);
        progressDialog.show();

        Handler handler = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                progressDialog.incrementProgressBy(1);
            }
        };

        // -- this use for circular progress bar
//        ProgressDialog progressDialog = new ProgressDialog(ProgressDialogDemo.this);
//        progressDialog.setTitle("Progress Dialog Box");
//        progressDialog.setMessage("This is simple progress Dialog Box");
//        progressDialog.setIcon(R.drawable.home);
//        progressDialog.setCancelable(false);
//        progressDialog.show();

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                    progressDialog.dismiss();
//                }
//                catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        thread.start();

        // ---- second way to right thread in java -----
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // while loop come under horizontal progress bar
                    while (progressDialog.getProgress() <= 100) { // another way to get 100 is --- progressDialog.getMax()
                        Thread.sleep(10);
//                    progressDialog.dismiss();
                        handler.sendMessage(handler.obtainMessage());

                        if(progressDialog.getProgress() == progressDialog.getMax()){
                            progressDialog.dismiss();
                        }
                    }
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }
}