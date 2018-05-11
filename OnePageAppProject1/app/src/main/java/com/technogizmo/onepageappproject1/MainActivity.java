package com.technogizmo.onepageappproject1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    private ViewFlipper taglineViewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taglineViewFlipper = (ViewFlipper) findViewById(R.id.tagTextFlip1);
        taglineViewFlipper.setFlipInterval(1500);


    }
}
