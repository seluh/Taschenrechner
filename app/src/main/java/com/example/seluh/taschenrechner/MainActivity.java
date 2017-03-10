package com.example.seluh.taschenrechner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void divide (View view){
        EditText z1 = (EditText) findViewById(R.id.zahl1);
        EditText z2 = (EditText) findViewById(R.id.zahl2);
        EditText z3 = (EditText) findViewById(R.id.ergebnis);

        int a = Integer.parseInt(z1.getText().toString());
        int b = Integer.parseInt(z2.getText().toString());

        try {
            int c = a / b;
            z3.setText(String.valueOf(c));
        }
        catch (Exception e){
            z3.setText("Division durch 0 nicht möglich!");
        }


    }
}
