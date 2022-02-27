package com.example.myfirstapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClick(View view){
        TextView var = findViewById(R.id.sampleText);
        TextView chTxt = findViewById(R.id.changeText);
        var.setText(chTxt.getText().toString());
    }
}