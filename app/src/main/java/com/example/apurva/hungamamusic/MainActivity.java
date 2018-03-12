package com.example.apurva.hungamamusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    String hungama_ulr = "file:///android_asset/hungama.html";
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=findViewById(R.id.web_view);
        //webView.loadUrl("http://www.google.com");
        webView.loadUrl(hungama_ulr);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(webView.canGoBack()){
            webView.goBack();
        }
        else{
            finish();
        }
    }
}
