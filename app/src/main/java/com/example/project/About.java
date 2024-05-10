package com.example.project;

import static com.example.project.R.*;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {

    WebView myWebView;

    public void showInternalWebPage() {
        myWebView.loadUrl("file:///android_asset/about.html");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        myWebView = findViewById(R.id.My_WebView);
        myWebView.setWebViewClient(new WebViewClient()); // Do not open in Chrome!

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        showInternalWebPage();
    }
}
