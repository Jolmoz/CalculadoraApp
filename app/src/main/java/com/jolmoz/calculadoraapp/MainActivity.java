package com.jolmoz.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textResponse;
    private EditText textInput1;
    private EditText textInput2;

    private Button buttonAdd;
    private Button buttonSubs;
    private Button buttonMult;
    private Button buttonDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResponse = findViewById(R.id.response);
        textInput1 = findViewById(R.id.textInput1);
        textInput2 = findViewById(R.id.textInput2);

        buttonAdd = findViewById(R.id.button_add);
        buttonSubs = findViewById(R.id.button_subs);
        buttonMult = findViewById(R.id.button_mult);
        buttonDiv = findViewById(R.id.button_div);

        setListeners();

    }

    public double sum (double num1, double num2){
        return num1 + num2;
    }

    public double substract (double num1, double num2){
        return num1 - num2;
    }

    public double multiply (double num1, double num2){
        return num1 * num2;
    }

    public double divide (double num1, double num2){
        if(num2!=0){
            return num1 / num2;
        }else {
            return 0;
        }
    }

    public void setListeners(){

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double operationResult = sum(Double.parseDouble(textInput1.getText().toString()),Double.parseDouble(textInput2.getText().toString()));
                textResponse.setText(operationResult+"");
            }
        });

        buttonSubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double operationResult = substract(Double.parseDouble(textInput1.getText().toString()),Double.parseDouble(textInput2.getText().toString()));
                textResponse.setText(operationResult+"");
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double operationResult = multiply(Double.parseDouble(textInput1.getText().toString()),Double.parseDouble(textInput2.getText().toString()));
                textResponse.setText(operationResult+"");
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double operationResult = divide(Double.parseDouble(textInput1.getText().toString()),Double.parseDouble(textInput2.getText().toString()));
                textResponse.setText(operationResult+"");
            }
        });
    }
}