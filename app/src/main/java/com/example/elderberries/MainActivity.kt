package com.example.elderberries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initiate web view client
        webView.webViewClient = WebViewClient();

        //load url on page
        webView.loadUrl("https://www.google.com");

        //enable javascript settings
        webView.settings.javaScriptEnabled = true;
    }

    override fun onBackPressed() {
        //back action on webapp from phone key
        if (webView.canGoBack())
            webView.goBack();
        else
            //exit the application if no back actio available on web page
            super.onBackPressed();
    }
}