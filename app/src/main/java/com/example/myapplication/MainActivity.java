package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView mTextView;
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.textview);
        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if(mTextView.getText() == "测试")
            mTextView.setText("北京交通大学");
        else
            mTextView.setText("测试");
    }
}
