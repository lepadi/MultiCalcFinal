package com.example.myapplication;

import static android.widget.Toast.LENGTH_SHORT;
import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Alg extends AppCompatActivity {
    private EditText textA;
    private EditText textB;
    private EditText textC;
    private TextView tx1;
    private TextView tx2;
    private LinearLayout Ll1;
    private LinearLayout Ll2;

    private TextView selectTxt;
    private double a;
    private double b;
    private double c;
    private double d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alg);
        textA = findViewById(R.id.textA);
        textB = findViewById(R.id.textB);
        textC = findViewById(R.id.textC);
        tx1 = findViewById(R.id.x1);
        tx2 = findViewById(R.id.x2);
        selectTxt = findViewById(R.id.selectTxt);

    }

    public void ax2(View view) {
        Ll1.setVisibility(View.VISIBLE);
        Ll2.setVisibility(View.INVISIBLE);
        selectTxt.setVisibility(View.INVISIBLE);

    }

    public void ax2Count(View view) {
        try{
            a = Double.parseDouble(textA.getText().toString());
            b = Double.parseDouble(textB.getText().toString());
            c = Double.parseDouble(textC.getText().toString());
            d = Math.pow(b,2)-4*(c-2*c)*a;
            System.out.println(d);
            double x1 = ((b-2*b)-Math.abs(Math.sqrt(d)))/(2*a);
            double x2 = ((b-2*b)+Math.abs(Math.sqrt(d)))/(2*a);
            System.out.println(x1);
            System.out.println(x2);
            tx1.setText(Double.toString(x1));
            tx2.setText(Double.toString(x2));

        } catch (Exception e) {
            Toast.makeText(Alg.this,e.getMessage(), LENGTH_SHORT).show();
        }


    }
}