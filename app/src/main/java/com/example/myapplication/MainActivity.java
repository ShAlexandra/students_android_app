package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_plus;
    Button btn_minus;
    Button btn_multi;
    Button btn_div;
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    TextView calcResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

/*((Button) findViewById(R.id.bnt0|R.id.bnt1|R.id.bnt2|R.id.bnt3|R.id.bnt4|R.id.bnt5|R.id.bnt6|R.id.bnt7|R.id.bnt8|R.id.bnt9)).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setText(((EditText)findViewById(R.id.).getText());
            }
        });*/
/*num1 = Float.parseFloat(etNum1.getText().toString());*/