package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int darkTheme = 0;

    private ConstraintLayout CL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CL = findViewById(R.id.CL);
    }

    public void Calc(View view) {
        Intent intent = new Intent(MainActivity.this, Calc.class);
        startActivity(intent);
    }

    public void PhysCalc(View view) {
        Intent intent = new Intent(MainActivity.this, Phys.class);
        startActivity(intent);
    }

    public void AlgCalc(View view) {
        Intent intent = new Intent(MainActivity.this, Alg.class);
        startActivity(intent);
    }

    public void GeomCalc(View view) {
        Intent intent = new Intent(MainActivity.this, Geom.class);
        startActivity(intent);
    }
}