package com.ahhsfj1991.okhttplogger

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import okhttp3.OkHttpClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ok = OkHttpClient.Builder()
    }
}
