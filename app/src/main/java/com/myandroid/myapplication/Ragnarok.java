package com.myandroid.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Ragnarok extends AppCompatActivity {
int proverka_ragnarok = 0;
Intent intent;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ragnarok);

        intent = new Intent(this , MainActivity.class);

        webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://video.sibnet.ru/shell.php?videoid=4335272&related_plst=692865&playlist_position=bottom&playlist_size=200");
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public void zakladka_ragnarok(View v){
        proverka_ragnarok = 1;
        intent.putExtra("proverka_ragnarok",proverka_ragnarok);

    }
    public void back_to_main(View v){
        startActivity(intent);
    }

}