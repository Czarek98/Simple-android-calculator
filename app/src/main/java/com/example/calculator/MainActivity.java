package com.example.calculator;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.gridlayout.widget.GridLayout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Activity activity;
    GridLayout gridLayout;
    TextView resultTextView;
    EditText editTextNumber;
    Button one, two, three, four, five, six, seven, eight, nine, zero;
    Button plus, minus, divide, multiply, equals, dot, clear, leftBracket, rightBracket, delete;
    Switch darkMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        activity = this;
        Button defbtn=new Button(this);
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
                rightBracket.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF000000")));
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
                rightBracket.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFFF4444")));
                clear.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFCC0000")));
                delete.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFCC0000")));

            }
        });

        gridLayout = findViewById(R.id.gridLayout);
        resultTextView = findViewById(R.id.editTextNumberSigned);
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
        rightBracket = findViewById(R.id.rightBracket);
        delete = findViewById(R.id.delete);



    }


    public void inputClick(View view) {
        if (view.getId()== R.id.one){
            resultTextView.append("1");
        }
        else if(view.getId() == R.id.two){
            resultTextView.append("2");
        }else if(view.getId() == R.id.three){
            resultTextView.append("3");
        }else if(view.getId() == R.id.plus){
            resultTextView.append("+");
        }else if(view.getId() == R.id.four){
            resultTextView.append("4");
        }else if(view.getId() == R.id.five){
            resultTextView.append("5");
        }else if(view.getId() == R.id.six){
            resultTextView.append("6");
        }else if(view.getId() == R.id.minus){
            resultTextView.append("-");
        }else if(view.getId() == R.id.seven){
            resultTextView.append("7");
        }else if(view.getId() == R.id.eight){
            resultTextView.append("8");
        }else if(view.getId() == R.id.nine){
            resultTextView.append("9");
        }else if(view.getId() == R.id.multiplication){
            resultTextView.append("*");
        }else if(view.getId() == R.id.dot){
            resultTextView.append(".");
        }else if(view.getId() == R.id.zero){
            resultTextView.append("0");
        }else if(view.getId() == R.id.clear){
            resultTextView.setText("");
        }else if(view.getId() == R.id.division){
            resultTextView.append("/");
        }else if(view.getId() == R.id.leftBracket){
            resultTextView.append("(");
        }else if(view.getId() == R.id.rightBracket){
            resultTextView.append(")");
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
                CharSequence text = resultTextView.getText();
                text = text.subSequence(0, text.length() - 1);
                resultTextView.setText(text);
            }

        }else if(view.getId() == R.id.equals){




        }
    }


}