package com.example.myapplication;
import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText t1,t2,t3;
      TextView a1,a2;
      Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            t1=(EditText) findViewById(R.id.sqt);
            t2=(EditText) findViewById(R.id.t1);
            t3=(EditText) findViewById(R.id.con);
             btn=(Button) findViewById(R.id.bx);
            a1 =(TextView) findViewById(R.id.ans);
            a2 =(TextView) findViewById(R.id.ans2);
             btn.setOnClickListener(new View.OnClickListener() {
                 @SuppressLint({"SetTextI18n", "DefaultLocale"})
                 @Override
                 public void onClick(View view) {
                     double n1=Double.parseDouble(t1.getText().toString());
                     double n2=Double.parseDouble(t2.getText().toString());
                     double n3=Double.parseDouble(t3.getText().toString());
                     double d= (n2*n2)-(4*n1*n3);
                     final double x11 = (-n2 + (Math.sqrt(d))) / (2 * n1);
                     final double x21 = ((-n2 - (Math.sqrt(d))) / (2 * n1));
                     if (d>0.0){
                         a1.setText(String.format("%.4f", x11)+"\n"+String.format("%.4f", x21));
                         a2.setText("TWO REAL VALUES");
                     }
                     else if(d==0.0){
                         a1.setText(String.format("%.4f", x11)+"\n"+String.format("%.4f", x21));
                     a2.setText("ONE REAL VALUE");
                     }
                     else{
                         double real=-n2/(2*n1);
                         double img=Math.sqrt(-d)/(2*n1);
                         a1.setText(String.format("%.4f",real)+"±"+String.format("%.4f",img)+"i");
                         a2.setText("Imaginary value");
                     }
                 }
             });
    }
}