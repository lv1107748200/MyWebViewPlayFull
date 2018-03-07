package com.hr.mywebviewplayfull;

import android.graphics.PixelFormat;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by 吕 on 2018/3/5.
 */

public class TbActivity extends FragmentActivity{
    X5WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tb);
        webView =  findViewById(R.id.web_filechooser);

        webView.loadUrl("file:///android_asset/hemmm.html");
        getWindow().setFormat(PixelFormat.TRANSLUCENT);

        webView.getView().setOverScrollMode(View.OVER_SCROLL_ALWAYS);

    }

}
