package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    EditText edt1 = (EditText)findViewById(R.id.num1) ;
    EditText edt2 = (EditText)findViewById(R.id.num2);
    Button btnA = (Button)findViewById(R.id.btnAdd);


    public void onclick(View view) {
        int number1 = Integer.parseInt(edt1.getText().toString());
        int number2 = Integer.parseInt(edt1.getText().toString());
        Intent i = new Intent(getApplicationContext(),SecondActivity.class);
        i.putExtra("val1",  number1);
        i.putExtra("val2",  number2);
        Toast toast = Toast.makeText(getApplicationContext(),"Sending values..",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
        toast.show();
        startActivity(i);

    }
}
