package com.example.project;

import static com.example.project.R.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

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

        myWebView = findViewById(id.web_view);
        myWebView.setWebViewClient(new WebViewClient()); // Do not open in Chrome!

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        showInternalWebPage();


        Button ToSecondActivity = findViewById(id.bottom_button);
        ToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
