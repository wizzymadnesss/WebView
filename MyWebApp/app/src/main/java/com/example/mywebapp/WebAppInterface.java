package com.example.mywebapp;

import android.content.Context;
import android.text.Layout;
import android.webkit.JavascriptInterface;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class WebAppInterface {
    Context context;
    RelativeLayout layout;

    WebAppInterface(Context c, RelativeLayout l){
        context = c;
        layout = l;
    }

    @JavascriptInterface
    public void showToastMessage(String message){
        Toast.makeText(context,message, Toast.LENGTH_SHORT).show();
    }
    @JavascriptInterface
    public void showSnackBar(String message){
        Snackbar snackbar= Snackbar.make(layout,message,Snackbar.LENGTH_SHORT);
        snackbar.show();
    }

}
