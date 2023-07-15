package com.example.multiplication_table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.Num);
        button = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.tv2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberString = editText.getText().toString();
                int  value = Integer.parseInt(numberString);
                result = "";
                for(int i=1; i<=10 ; i++){
                     result += value + " * "+ i + " = " + value*i+"\n";
                     textView.setText(result);
                }
            }
        });
    }
}