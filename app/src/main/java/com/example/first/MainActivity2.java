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
    private Button button;

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
        num1 = findViewById(R.id.editNumber1);
        num2 = findViewById(R.id.editNumber2);
        button = findViewById(R.id.culcSum);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer number1 = Integer.parseInt(num1.getText().toString());
                Integer number2 = Integer.parseInt(num2.getText().toString());

                result.setText(String.valueOf(number1 + number2));
            }
        });
    }
}