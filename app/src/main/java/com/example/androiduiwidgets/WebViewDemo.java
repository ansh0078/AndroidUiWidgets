package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebViewDemo extends AppCompatActivity {
    WebView web_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_demo);

        web_view = (WebView) findViewById(R.id.web_view);

        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Loading..");
        progressDialog.setMessage("Please Wait...");
        progressDialog.setCancelable(false);

        web_view.getSettings().setPluginState(WebSettings.PluginState.ON);
        web_view.getSettings().setJavaScriptEnabled(true);
        web_view.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        web_view.getSettings().setSupportMultipleWindows(true);

        web_view.getSettings().setSupportZoom(true);
        web_view.getSettings().setBuiltInZoomControls(true);

        web_view.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                Toast.makeText(WebViewDemo.this, "Error : "+error, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                progressDialog.show();
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                progressDialog.dismiss();
            }
        });

        web_view.loadUrl("https://www.google.com");
    }
}