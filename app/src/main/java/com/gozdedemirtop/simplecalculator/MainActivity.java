package com.gozdedemirtop.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numText1;
    EditText numText2;
    TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numText1 = findViewById(R.id.numText1);
        numText2 = findViewById(R.id.numText2);
        resultText = findViewById(R.id.resultText);

    }

    public void summation(View view){
        if(numText1.getText().toString().matches("")||numText2.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }
        else{
            int num1 = Integer.parseInt(numText1.getText().toString());
            int num2 = Integer.parseInt(numText2.getText().toString());

            int result = num1 + num2;
            resultText.setText("Result: " + result);
        }
    }

    public void subtraction(View view){
        if(numText1.getText().toString().matches("")||numText2.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }
        else {
            int num1 = Integer.parseInt(numText1.getText().toString());
            int num2 = Integer.parseInt(numText2.getText().toString());

            int result = num1 - num2;
            resultText.setText("Result: " + result);
        }
    }

    public void multiplication(View view){
        if(numText1.getText().toString().matches("")||numText2.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }
        else {
            int num1 = Integer.parseInt(numText1.getText().toString());
            int num2 = Integer.parseInt(numText2.getText().toString());

            int result = num1 * num2;
            resultText.setText("Result: " + result);
        }
    }

    public void division(View view){
        if(numText1.getText().toString().matches("")||numText2.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }
        else {
            int num1 = Integer.parseInt(numText1.getText().toString());
            int num2 = Integer.parseInt(numText2.getText().toString());

            int result = num1 / num2;
            resultText.setText("Result: " + result);
        }
    }
}
