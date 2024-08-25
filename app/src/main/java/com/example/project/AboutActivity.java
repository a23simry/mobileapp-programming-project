package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        WebView myWebView;
        myWebView = findViewById(R.id.about_webview);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("file:///android_asset/about.html");
    }
}