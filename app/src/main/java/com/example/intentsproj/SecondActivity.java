package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        EditText edt1 = (EditText)findViewById(R.id.num1) ;
        EditText edt2 = (EditText)findViewById(R.id.num2);


        Intent intent = getIntent();
        String number01 = intent.getStringExtra("val1");
        String number02 = intent.getStringExtra("val2");
        edt1.setText(number01);
        edt2.setText(number02);


    }

    public void onButtonAdd(View view) {
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);
        TextView t1 = (TextView)findViewById(R.id.textres);
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());

        int sum = number1 + number2;
        t1.setText(Integer.toString(sum));
    }

    public void onButtonSUB(View view) {
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);
        TextView t1 = (TextView)findViewById(R.id.textres);
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());

        int SUB = number1 - number2;
        t1.setText(Integer.toString(SUB));
    }

    public void onButtonDIV(View view) {
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);
        TextView t1 = (TextView)findViewById(R.id.textres);
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());

        int DIV = number1 / number2;
        t1.setText(Integer.toString(DIV));
    }

    public void onButtonMUT(View view) {
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);
        TextView t1 = (TextView)findViewById(R.id.textres);
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());

        int MUT = number1 * number2;
        t1.setText(Integer.toString(MUT));
    }
}






