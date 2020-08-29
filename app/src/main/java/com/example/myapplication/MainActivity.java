package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Add = findViewById(R.id.Add);
        Button Sub = findViewById(R.id.Sub);
        Button Mul = findViewById(R.id.Mul);
        Button Div = findViewById(R.id.Div);
        final EditText Ans =findViewById(R.id.Ans);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {        EditText num1;
                num1 = (EditText)findViewById(R.id.No1);
                EditText num2;
                num2 = (EditText) findViewById(R.id.No2);
                final int n1 = Integer.parseInt(num1.getText().toString());
                final int n2 = Integer.parseInt(num2.getText().toString());

             int answer = n1 +n2;
              Ans.setText("Addition: "+ String.valueOf(answer));
            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {        EditText num1;
                num1 = (EditText)findViewById(R.id.No1);
                EditText num2;
                num2 = (EditText) findViewById(R.id.No2);
                final int n1 = Integer.parseInt(num1.getText().toString());
                final int n2 = Integer.parseInt(num2.getText().toString());

                 int answer = n1 * n2;
                Ans.setText("Multiplication: "+ String.valueOf(answer));
            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {        EditText num1;
                num1 = (EditText)findViewById(R.id.No1);
                EditText num2;
                num2 = (EditText) findViewById(R.id.No2);
                final int n1 = Integer.parseInt(num1.getText().toString());
                final int n2 = Integer.parseInt(num2.getText().toString());
                int answer = n1 - n2;
                Ans.setText("Subtraction: "+ String.valueOf(answer));
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {        EditText num1;
                num1 = (EditText)findViewById(R.id.No1);
                EditText num2;
                num2 = (EditText) findViewById(R.id.No2);
                final int n1 = Integer.parseInt(num1.getText().toString());
                final int n2 = Integer.parseInt(num2.getText().toString());
                 int answer = n1 / n2;
                Ans.setText("Division: "+ String.valueOf(answer));
            }
        });
    }

}