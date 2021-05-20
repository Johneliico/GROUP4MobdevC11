package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
        ed1=(EditText) findViewById(R.id.user);
        ed2=(EditText) findViewById(R.id.pass);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("johneli")&& ed2.getText().toString().equals("1234")){
                    Toast.makeText(getApplicationContext(),"Access Granted",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,Johneli.class);
                    startActivity(intent);

                }else if(ed1.getText().toString().equals("patrick")&& ed2.getText().toString().equals("1234")) {
                    Toast.makeText(getApplicationContext(), "Access Granted", Toast.LENGTH_SHORT).show();
                    Intent intent1 = new Intent(MainActivity.this,Patrick.class);
                    startActivity(intent1);
                }else if(ed1.getText().toString().equals("warren")&& ed2.getText().toString().equals("1234")) {
                    Toast.makeText(getApplicationContext(), "Access Granted", Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(MainActivity.this,Warren.class);
                    startActivity(intent2);
                }else{
                    Toast.makeText(getApplicationContext(), "Invalid Username and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}