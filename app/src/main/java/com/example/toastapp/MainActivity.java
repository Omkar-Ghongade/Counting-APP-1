package com.example.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button toastt;
    TextView txt;
    int k=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= (Button) findViewById(R.id.cntbtn);
        toastt=(Button) findViewById(R.id.toast);
        txt=  (TextView) findViewById(R.id.text);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k++;
                String s=Integer.toString(k);
                txt.setText(s,TextView.BufferType.EDITABLE);
            }
        });

        toastt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Welcome Bro/Sis",Toast.LENGTH_SHORT).show();
            }
        });

    }
}