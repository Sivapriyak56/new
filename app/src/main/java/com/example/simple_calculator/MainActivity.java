package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ev1, ev2;
    Button add, sub, div, mul;
    Double n1, n2;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ev1 = findViewById(R.id.editTextNumber3);
        ev2 = findViewById(R.id.editTextNumber4);
        add = findViewById(R.id.button);
        sub = findViewById(R.id.button2);
        div = findViewById(R.id.button3);
        mul = findViewById(R.id.button4);

        t = findViewById(R.id.textView);
        Clicklistener();

    }

    public void Clicklistener() {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(ev1.getText().toString());
                n2 = Double.parseDouble(ev2.getText().toString());
                Double result = n1 + n2;
                t.setText(String.valueOf(result));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(ev1.getText().toString());
                n2 = Double.parseDouble(ev2.getText().toString());
                Double result = n1 - n2;
                t.setText(String.valueOf(result));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(ev1.getText().toString());
                n2 = Double.parseDouble(ev2.getText().toString());
                Double result = n1 * n2;
                t.setText(String.valueOf(result));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(ev1.getText().toString());
                n2 = Double.parseDouble(ev2.getText().toString());
                Double result = n1 / n2;
                t.setText(String.valueOf(result));
            }
        });
    }
}
