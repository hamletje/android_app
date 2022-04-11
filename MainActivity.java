package com.example.buttonpresses;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    Button button;
    TextView buttonPresses;
    int butt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        button.setBackgroundColor(Color.CYAN);
        buttonPresses = (TextView) findViewById(R.id.textView2);
        button.setOnClickListener(this);
        buttonPresses.setTextSize(100);
    }

    @Override
    public void onClick(View view) {
        butt++;
        buttonPresses.setText(""+butt);
    }
}