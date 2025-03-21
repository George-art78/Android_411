package com.example.first;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView result;
    private EditText num1, num2;
    private Button btn_add, btn_subtraction, btn_multiplication, btn_div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        result = findViewById(R.id.result);
        num1 = findViewById(R.id.number_1);
        num2 = findViewById(R.id.number_2);
        btn_add = findViewById(R.id.addition);
        btn_subtraction = findViewById(R.id.subtraction);
        btn_multiplication = findViewById(R.id.multiplication);
        btn_div = findViewById(R.id.div);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double number1 = Double.parseDouble(num1.getText().toString());
                Double number2 = Double.parseDouble(num2.getText().toString());

                result.setText(String.valueOf("Result: " + number1 + " + " + number2 + " = " + (number1 + number2)));
            }
        });

        btn_subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double number1 = Double.parseDouble(num1.getText().toString());
                Double number2 = Double.parseDouble(num2.getText().toString());

                result.setText(String.valueOf("Result: " + number1 + " - " + number2 + " = " + (number1 - number2)));
            }
        });

        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double number1 = Double.parseDouble(num1.getText().toString());
                Double number2 = Double.parseDouble(num2.getText().toString());

                result.setText(String.valueOf("Result: " + number1 + " * " + number2 + " = " + (number1 * number2)));
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double number1 = Double.parseDouble(num1.getText().toString());
                Double number2 = Double.parseDouble(num2.getText().toString());

                if (number2 != 0) {
                    result.setText(String.valueOf("Result: " + number1 + " / " + number2 + " = " + (number1 / number2)));
                } else {
                    result.setText(String.valueOf("На 0 делить нельзя!"));
                }
            }
        });
    }
}