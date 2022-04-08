package com.sample.rotationsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "log_debug";
    private LinearLayout root;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        root = findViewById(R.id.layout_root);
        view = findViewById(R.id.view);
        view.setOnClickListener(view -> Toast.makeText(this,"点击",Toast.LENGTH_SHORT).show());
    }

    public void rotationX(View v) {
        //view.setPivotY(1);
        Log.d(TAG,"getPivotY = " + view.getPivotY() + "   getHeight = " + view.getHeight());
        float pivotY = view.getPivotY();
        view.setPivotY(pivotY + (pivotY * 0.5f));
        view.setRotationX(45);
    }

    public void rotationY(View v) {
        view.setRotationY(45);
    }
}