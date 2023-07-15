package com.example.add_numbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private Button button; // create varible
        private TextView text; // create varible
        private EditText n1,n2;  // create varible
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        text = findViewById(R.id.text);
        n1 =  findViewById(R.id.n1);
        n2 =  findViewById(R.id.n2);

        button.setOnClickListener(new View.OnClickListener() { // it work when button it pressed
            @Override
            public void onClick(View v) {
                int sum = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString()); // get two number as string and convert into Integer
                text.setText("Sum of two Number is " + sum);
            }
        });
    }
}