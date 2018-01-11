package com.example.android.myannotation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.annotation.annotation.MyAnnotation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener({
            myMethod()
        })
    }


    @MyAnnotation
    private fun myMethod() {
        Log.d("TAG", "Hello Method")
    }
}
