package com.example.a73_dlmh;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_child extends Activity {
    TextView txt3, txt4;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        Init();
        Intent iin= getIntent();
        Bundle b = iin.getExtras();

        if(b!=null)
        {
            String j =(String) b.get("header");
            String v =(String) b.get("content");
            System.out.println(j);
            txt3.setText(j);
            txt4.setText(v);
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    void Init(){
        txt3 = findViewById(R.id.txt6);
        txt4 = findViewById(R.id.txt7);
        btn = findViewById(R.id.button8);
    }
}