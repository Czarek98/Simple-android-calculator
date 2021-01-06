package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.gridlayout.widget.GridLayout;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Activity activity;
    GridLayout gridLayout;
    TextView resultTextView;
    Button one, two, three, four, five, six, seven, eight, nine, zero;
    Button plus, minus, divide, multiply, equals, dot, clear, leftBracket, power, delete;
    Switch darkMode;
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        activity = this;
        darkMode = findViewById(R.id.darkMode);
        darkMode.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked){
                activity.findViewById(android.R.id.content).setBackgroundColor(Color.BLACK);
                darkMode.setTextColor(Color.WHITE);
                resultTextView.setTextColor(Color.WHITE);
                one.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                two.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                three.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                four.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                five.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                six.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                seven.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                eight.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                nine.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                zero.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                dot.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                plus.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                minus.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                equals.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                divide.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                multiply.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                leftBracket.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                power.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                clear.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
                delete.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));

            }
            else {
                activity.findViewById(android.R.id.content).setBackgroundColor(Color.WHITE);
                darkMode.setTextColor(Color.BLACK);
                resultTextView.setTextColor(Color.GRAY);
                one.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF6200EE")));
                two.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF6200EE")));
                three.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF6200EE")));
                four.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF6200EE")));
                five.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF6200EE")));
                six.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF6200EE")));
                seven.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF6200EE")));
                eight.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF6200EE")));
                nine.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF6200EE")));
                zero.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF6200EE")));
                dot.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#DA00FF")));
                plus.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#85CC00")));
                minus.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF8800")));
                equals.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#21E10A")));
                divide.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#F1DD2F")));
                multiply.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF03DAC5")));
                leftBracket.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFFF4444")));
                power.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF00DDFF")));
                clear.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFCC0000")));
                delete.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFCC0000")));

            }
        });

        gridLayout = findViewById(R.id.gridLayout);
        resultTextView = findViewById(R.id.resultTextView);
        resultTextView.setText("");
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
        multiply = findViewById(R.id.multiplication);
        equals = findViewById(R.id.equals);
        dot = findViewById(R.id.dot);
        clear = findViewById(R.id.clear);
        leftBracket = findViewById(R.id.leftBracket);
        power = findViewById(R.id.power);
        delete = findViewById(R.id.delete);



    }
    public void addToResult(String sign){
        result = result + sign;
        resultTextView.setText(result);
    }

    boolean b;


    public void inputClick(View view) {
        if (view.getId()== R.id.one){
            addToResult("1");
        }
        else if(view.getId() == R.id.two){
            addToResult("2");
        }else if(view.getId() == R.id.three){
            addToResult("3");
        }else if(view.getId() == R.id.plus){
            addToResult("+");
        }else if(view.getId() == R.id.four){
            addToResult("4");
        }else if(view.getId() == R.id.five){
            addToResult("5");
        }else if(view.getId() == R.id.six){
            addToResult("6");
        }else if(view.getId() == R.id.minus){
            addToResult("-");
        }else if(view.getId() == R.id.seven){
            addToResult("7");
        }else if(view.getId() == R.id.eight){
            addToResult("8");
        }else if(view.getId() == R.id.nine){
            addToResult("9");
        }else if(view.getId() == R.id.multiplication){
            addToResult("*");
        }else if(view.getId() == R.id.dot){
            addToResult(".");
        }else if(view.getId() == R.id.zero){
            addToResult("0");
        }else if(view.getId() == R.id.clear){
            resultTextView.setText("");
            result = "";
        }else if(view.getId() == R.id.division){
            addToResult("/");
        }else if(view.getId() == R.id.leftBracket){

                if (b == true){
                    addToResult(")");
                    b = false;
                }
                else{
                    addToResult("(");
                    b = true;
                }

        }else if(view.getId() == R.id.power){
            addToResult("^");
        }else if(view.getId() == R.id.delete){
            if (resultTextView.length()<1){
                Context context = getApplicationContext();
                CharSequence text = "It's empty";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                toast.show();
            }
            else {
                result = result.substring(0,resultTextView.length()-1);
                resultTextView.setText(result);
            }

        }else if(view.getId() == R.id.equals){

        }
    }


}