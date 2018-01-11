package com.example.android.myannotation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.example.annotation.annotation.MyAnnotation;

/**
 * Created by Android on 1/11/2018.
 */

public class  Main2Activity extends AppCompatActivity {
    private static final String TAG = "Main2Activity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myMethod();
            }
        });
    }

    @MyAnnotation
    void myMethod() {
        Log.d(TAG, "myMethod: Inside My Method Java");
    }
}
