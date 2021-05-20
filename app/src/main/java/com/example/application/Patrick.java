package com.example.application;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
public class Patrick extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patrick);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Patrick.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}