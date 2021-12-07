package com.phc.opencv_demo_fuck;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.phc.opencv_demo_fuck.colorBlob.ColorBlobDetectionActivity;

/**
 *
 */
public class MainActivity extends AppCompatActivity {
    private Button btnColorBlob;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btnColorBlob.setOnClickListener(v -> {
            startActivity(new Intent(this, ColorBlobDetectionActivity.class));
        });
    }

    private void initView() {
        btnColorBlob = (Button) findViewById(R.id.btn_color_blob);
    }
}