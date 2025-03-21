package com.example.first;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textSample;
    private Button secondButton;

    private TextView textOfApp;
    private TextView secondTextOfApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.first_layout);
//        setContentView(R.layout.second_layout);
//        setContentView(R.layout.linear_layout_2);
//        setContentView(R.layout.table_layout);
//        setContentView(R.layout.frame_layout);
//        setContentView(R.layout.scroll_view);
        setContentView(R.layout.third_layout);

        textSample = findViewById(R.id.textSample);
        secondButton = findViewById(R.id.secondButton);

//        textOfApp = findViewById(R.id.textOfApp);
//        secondTextOfApp = findViewById(R.id.secondTextOfApp);

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textSample.setText("Новое приветствие");
                textSample.setTextSize(40);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void sayHello(View view) {
        textSample.setText("Привет");
    }

//    public void bombarda(View v) {
//        textOfApp.setText("Магия вне Хогвартса запрещена!");
//        textOfApp.setTextSize(35);
//    }
//
//    public void obliviate(View v) {
//        secondTextOfApp.setText("Обливиэйт!");
//        secondTextOfApp.setTextSize(35);
//    }
}