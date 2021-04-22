package com.example.mychat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.app_name)+"</font>"));
    }
}