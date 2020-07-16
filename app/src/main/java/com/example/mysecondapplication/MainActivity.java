package com.example.mysecondapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    TextView tv;
    Button ad, mul,sub, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.editText);
        n2 = (EditText) findViewById(R.id.editText2);
        tv = (TextView) findViewById(R.id.textView);
        ad = (Button) findViewById(R.id.btnAdd);
        sub = (Button) findViewById(R.id.btnSub);
        mul = (Button) findViewById(R.id.btnmulti);
        div = (Button) findViewById(R.id.btndiv);

        //Button Click Then
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Integer no1 = Integer.parseInt(n1.getText().toString());
            Integer no2 = Integer.parseInt(n2.getText().toString());

            Integer add = no1+no2;
            tv.setText("Result (" + no1 + " + " + no2 + ") = " + add.toString());
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer no1 = Integer.parseInt(n1.getText().toString());
                Integer no2 = Integer.parseInt(n2.getText().toString());

                Integer substraction = no1 - no2;
                tv.setText("Result (" + no1 + " - " + no2 + ") = " + substraction.toString());
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer no1 = Integer.parseInt(n1.getText().toString());
                Integer no2 = Integer.parseInt(n2.getText().toString());

                Integer multiplication = no1 * no2;
                tv.setText("Result (" + no1 + " * " + no2 + ") = " + multiplication.toString());
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer no1 = Integer.parseInt(n1.getText().toString());
                Integer no2 = Integer.parseInt(n2.getText().toString());

                Integer division = no1/no2;
                tv.setText("Result (" + no1 + " / " + no2 + ") = " + division.toString());
            }
        });
    }
}
