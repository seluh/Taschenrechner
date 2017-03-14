package com.example.seluh.taschenrechner;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;

        import static java.lang.Double.parseDouble;
        import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void divide(View view) {

        EditText z1 = (EditText) findViewById(R.id.zahl1);
        EditText z2 = (EditText) findViewById(R.id.zahl2);
        TextView z3 = (TextView) findViewById(R.id.ergebnis);

        try {
            double a = Double.parseDouble(z1.getText().toString());
            double b = Double.parseDouble(z2.getText().toString());

            if (b == 0) {
                z3.setText("Divisor should not be 0");
            } else {
                    double c = a / b;
                    z3.setText(String.valueOf(c));
                }
            }
            catch (Exception e) {
                z3.setText("Not a number");
            }
            finally {
            z1.setText("");
            z2.setText("");
        }

    }
}
