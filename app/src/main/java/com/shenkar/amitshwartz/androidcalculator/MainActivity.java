package com.shenkar.amitshwartz.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bAdd, bSub, bDivision, bMul, bDot, bC, bEqual;
    EditText screen;

    float value, lastResult;

    String action;
    public void check(){
        switch (action){
            case "add":
                lastResult += value;
                break;
            case "sub":
                lastResult -= value;
                break;
            case "mul":
                lastResult *= value;
                break;
            case "div":
                lastResult /= value;
                break;
                default:
                    break;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        action = "add";
        lastResult=0;
        b0 = (Button) findViewById(R.id.button0);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        bDot = (Button) findViewById(R.id.button10);
        bAdd = (Button) findViewById(R.id.buttonadd);
        bSub = (Button) findViewById(R.id.buttonsub);
        bMul = (Button) findViewById(R.id.buttonmul);
        bDivision = (Button) findViewById(R.id.buttondiv);
        bC = (Button) findViewById(R.id.buttonC);
        bEqual = (Button) findViewById(R.id.buttoneql);
        screen = (EditText) findViewById(R.id.edt1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "0");
            }
        });

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (screen == null) {
                    screen.setText("");
                } else {
                    value = Float.parseFloat(screen.getText() + "");
                    check();
                    screen.setText(null);
                    action="add";
                }
            }
        });

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen == null) {
                    screen.setText("");
                } else {
                    value = Float.parseFloat(screen.getText() + "");
                    check();
                    screen.setText(null);
                    action="sub";
                }
            }
        });

        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen == null) {
                    screen.setText("");
                } else {
                    value = Float.parseFloat(screen.getText() + "");
                    check();
                    screen.setText(null);
                    action="mul";
                }
            }
        });

        bDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen == null) {
                    screen.setText("");
                } else {
                    value = Float.parseFloat(screen.getText() + "");
                    check();
                    screen.setText(null);
                    action="div";
                }
            }
        });

        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = Float.parseFloat(screen.getText() + "");
                check();
                screen.setText(lastResult + "");
                lastResult=0;
                action="add";
            }
        });

        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("");
                lastResult=0;
                action="add";
            }
        });

        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + ".");
            }
        });
    }
}
