package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GridLayout gridLayout;
    TextView resultTextView;
    Button one, two, three, four, five, six, seven, eight, nine, zero;
    Button plus, minus, divide, multiply, equals, dot, clear;
    Switch darkMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        darkMode = findViewById(R.id.darkMode);
        gridLayout = findViewById(R.id.gridLayout);
        resultTextView = findViewById(R.id.resultTextView);
        //numbers
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        //functions
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        divide = findViewById(R.id.division);
        multiply = findViewById(R.id.multiply);
        equals = findViewById(R.id.equals);
        dot = findViewById(R.id.dot);
        clear = findViewById(R.id.clear);



    }

    public void equalsClick(View view) {
    }

    public void inputClick(View view) {

    }
}