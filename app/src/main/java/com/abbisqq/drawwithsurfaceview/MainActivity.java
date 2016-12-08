package com.abbisqq.drawwithsurfaceview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{
    LetsDraw ld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ld = new LetsDraw(this);
        setContentView(ld);
    }


    @Override
    protected void onResume() {
        super.onResume();
        ld.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        ld.onPause();
    }
}
