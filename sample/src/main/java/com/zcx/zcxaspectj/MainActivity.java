package com.zcx.zcxaspectj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.zcx.zcxaspectj.anno.TestA;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btTest = findViewById(R.id.bt_test);
        btTest.setOnClickListener(this);
    }

    @TestA("testValue")
    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Button clicked",Toast.LENGTH_SHORT).show();
    }
}
