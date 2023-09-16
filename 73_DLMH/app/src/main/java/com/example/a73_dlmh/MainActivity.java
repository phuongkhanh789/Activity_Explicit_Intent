package com.example.a73_dlmh;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2,btn3,btn4;
    EditText txt1, txt2;
//    TextView txt3, txt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Init();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1.length() !=0) {
                    Intent childActivity = new Intent(MainActivity.this, Activity_child.class);
                    childActivity.putExtra("header", "Get String Extra Activity");
                    childActivity.putExtra("content", "Họ tên Khách hàng: " + txt1.getText().toString());
                    startActivity(childActivity);
                }else{
                    Toast.makeText(MainActivity.this, "Bạn nhập không đúng định dạng!", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt2.length() !=0) {
                    Intent childActivity = new Intent(MainActivity.this,Activity_child.class);
                    childActivity.putExtra("header","Get Int Extra Activity");
                    childActivity.putExtra("content","Số thứ tự Kh: " + txt2.getText().toString());
                    startActivity(childActivity);
                }else{
                    Toast.makeText(MainActivity.this, "Bạn nhập không đúng định dạng!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1.length() !=0 && txt2.length() !=0) {
                    Intent childActivity = new Intent(MainActivity.this,Activity_child.class);
                    childActivity.putExtra("header","Get String và Int Extra Activity \n Ứng dụng lấy số thứ tự");
                    childActivity.putExtra("content","Họ tên Khách hàng: " + txt1.getText().toString()+"\n"+"Số thứ tự Kh: " + txt2.getText().toString());
                    startActivity(childActivity);
                }else{
                    Toast.makeText(MainActivity.this, "Bạn nhập không đúng định dạng!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    void Init(){
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        txt1 = findViewById(R.id.txt_kh);
        txt2 = findViewById(R.id.txt_stt);
    }
}