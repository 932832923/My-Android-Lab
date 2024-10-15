package com.example.work2;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LinearLayoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
    }

    public void goBack(View view) {
        finish(); // 返回到主界面
    }
}
