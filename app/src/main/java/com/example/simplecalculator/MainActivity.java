package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hooking in UI
        final EditText firstNumber = findViewById(R.id.number1);
        final EditText secondNumber = findViewById(R.id.number2);
        final RadioGroup operators = findViewById(R.id.operators);
        final RadioButton add = findViewById(R.id.add);
        final RadioButton subtract = findViewById(R.id.subtract);
        final Button equals = findViewById(R.id.equals);
        final TextView result = findViewById(R.id.result);
        //building the logic
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                final int firstNumberValue = Integer.parseInt(firstNumber.getText().toString());
                final int secondNumberValue = Integer.parseInt(secondNumber.getText().toString());
                Integer answer;

                final int operatorButtonId = operators.getCheckedRadioButtonId();

                if(operatorButtonId == R.id.add){ //same as in if(operatorButtonId == add.getId())
                    // addition
                    answer = firstNumberValue + secondNumberValue;
                }else{
                    //subtraction
                    answer = firstNumberValue - secondNumberValue;
                }

                result.setText(answer.toString());
            }
        });
    }
}