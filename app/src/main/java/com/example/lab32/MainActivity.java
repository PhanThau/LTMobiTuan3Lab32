package com.example.lab32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button btnBMI;
    EditText editTen, editChieuCao, editCanNang, editBMI, editChanDoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBMI= findViewById(R.id.btnBMI);
        editTen = findViewById(R.id.editTen);
        editChieuCao = findViewById(R.id.editChieuCao);
        editCanNang = findViewById(R.id.editCanNang);
        editBMI = findViewById(R.id.editBMI);
        editChanDoan = findViewById(R.id.editChanDoan);
        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double H=Double.parseDouble(editChieuCao.getText()+"");
                double W=Double.parseDouble(editCanNang.getText()+"");
                double BMI=W/Math.pow(H, 2);
                String chuandoan="";
                if (BMI<18)
                {
                    chuandoan="Bạn gầy";
                }
                else if (BMI<=24.9)
                {
                    chuandoan="Bạn bình thường";
                }else if (BMI<=29.9)
                {
                    chuandoan="Bạn béo phì độ 1";
                }else if (BMI<=34.9)
                {
                    chuandoan="Bạn béo phì độ 2";
                }else
                {
                    chuandoan="Bạn béo phì độ 3";
                }
                DecimalFormat dcf=new DecimalFormat("#.0");
                editBMI.setText(dcf.format(BMI));
                editChanDoan.setText(chuandoan);

            }
        });
    }

}