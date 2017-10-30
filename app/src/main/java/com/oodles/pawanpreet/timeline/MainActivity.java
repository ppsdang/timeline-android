package com.oodles.pawanpreet.timeline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.oodles.pawanpreet.timelineview.MyView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v = new MyView(this);
        setContentView(v);
    }
}
