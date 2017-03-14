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

    public void divide(View view) {

        EditText z1 = (EditText) findViewById(R.id.zahl1);
        EditText z2 = (EditText) findViewById(R.id.zahl2);
        EditText z3 = (EditText) findViewById(R.id.ergebnis);

        double a = Integer.parseInt(z1.getText().toString());
        double b = Integer.parseInt(z2.getText().toString());
        if (b == 0) {
            z3.setText("Divisor should not be 0");
        } else {
            try {
                double c = a / b;
                z3.setText(String.valueOf(c));

            } catch (Exception e) {

                z3.setText("ERROR!");
            }
        }
        z1.setText("");
        z2.setText("");
    }

}
