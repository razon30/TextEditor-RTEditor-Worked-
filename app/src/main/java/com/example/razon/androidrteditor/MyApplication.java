package com.example.razon.androidrteditor;

import android.app.Application;

import com.onegravity.rteditor.fonts.FontManager;

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        FontManager.preLoadFonts(this);




    }
}
