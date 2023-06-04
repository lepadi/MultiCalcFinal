package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Geom extends AppCompatActivity {
    private LinearLayout ll;
    private LinearLayout Kt;

    private EditText kt1;
    private EditText kt2;
    private TextView tXt;

    private double k1;
    private double k2;
    private double g;
    private double P;
    private double res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geom);
        ll = findViewById(R.id.Ll1);
        Kt = findViewById(R.id.Kt);
        kt1 = findViewById(R.id.Kt1);
        kt2 = findViewById(R.id.Kt2);
        tXt = findViewById(R.id.tXt);
    }

    public void KtPu(View view) {
        ll.setVisibility(View.INVISIBLE);
        Kt.setVisibility(View.VISIBLE);
    }

    public void GpPu(View view) {
        ll.setVisibility(View.INVISIBLE);
    }

    public void KtCount(View view) {
        try {
            k1 = Double.parseDouble(String.valueOf(kt1.getText()));
            k2 = Double.parseDouble(String.valueOf(kt2.getText()));
            P = Math.pow(k1, 2) + Math.pow(k2, 2);
            res = Math.round(Math.sqrt(P));
            tXt.setText(Double.toString(res));
        }
        catch (Exception e){
            Toast.makeText(Geom.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}