package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Intent intent = getIntent();
        String URL = intent.getStringExtra("auxdata");

        WebView myWebView;
        myWebView = findViewById(R.id.web_page);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl(URL);
    }
}