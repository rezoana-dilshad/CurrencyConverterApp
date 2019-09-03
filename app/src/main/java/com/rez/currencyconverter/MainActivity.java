package com.rez.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button dollar, qar, bdt, euro, pound, peso, rupee, bitcoin, aus;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dollar = findViewById(R.id.dollar);
        qar = findViewById(R.id.qar);
        bdt = findViewById(R.id.bdt);
        euro = findViewById(R.id.euro);
        pound = findViewById(R.id.pound);
        peso = findViewById(R.id.peso);
        rupee = findViewById(R.id.rupee);
        bitcoin = findViewById(R.id.bitcoin);
        aus = findViewById(R.id.aus);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        //9 Cad to Bitcoins
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();

                if(TextUtils.isEmpty(input)){
                    editText.setError("Empty user input");
                } else{
                    double cad, result;
                    cad = Double.parseDouble(input);
                    result = cad * 0.000078;

                    Formatter formatter = new Formatter();
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(result));
                }
            }
        });
        //8 Cad to rupees
        rupee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();

                if(TextUtils.isEmpty(input)){
                    editText.setError("Empty user input");
                } else{
                    double cad, result;
                    cad = Double.parseDouble(input);
                    result = cad * 52.31;

                    Formatter formatter = new Formatter();
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(result));
                }
            }
        });
        //7 Cad to Mexicam pesos
        peso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();

                if(TextUtils.isEmpty(input)){
                    editText.setError("Empty user input");
                } else{
                    double cad, result;
                    cad = Double.parseDouble(input);
                    result = cad * 14.49;

                    Formatter formatter = new Formatter();
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(result));
                }
            }
        });
        //6 Cad to Aus dollar
        aus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();

                if(TextUtils.isEmpty(input)){
                    editText.setError("Empty user input");
                } else{
                    double cad, result;
                    cad = Double.parseDouble(input);
                    result = cad * 1.10;

                    Formatter formatter = new Formatter();
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(result));
                }
            }
        });

        //5 Cad to euro
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();

                if(TextUtils.isEmpty(input)){
                    editText.setError("Empty user input");
                } else{
                    double cad, result;
                    cad = Double.parseDouble(input);
                    result = cad * 0.68;

                    Formatter formatter = new Formatter();
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(result));
                }
            }
        });

        //4 Cad to pound
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();

                if(TextUtils.isEmpty(input)){
                    editText.setError("Empty user input");
                } else{
                    double cad, result;
                    cad = Double.parseDouble(input);
                    result = cad * 0.62;

                    Formatter formatter = new Formatter();
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(result));
                }
            }
        });

        //3 Cad to Bangladeshi Taka
        bdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();

                if(TextUtils.isEmpty(input)){
                    editText.setError("Empty user input");
                } else{
                    double cad, result;
                    cad = Double.parseDouble(input);
                    result = cad * 64.13;

                    Formatter formatter = new Formatter();
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(result));
                }
            }
        });
        //2 Cad to Qatar Riyals
        qar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();

                if(TextUtils.isEmpty(input)){
                    editText.setError("Empty user input");
                } else{
                    double cad, result;
                    cad = Double.parseDouble(input);
                    result = cad * 2.76;

                    Formatter formatter = new Formatter();
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(result));
                }
            }
        });
        //1 Cad to US dollars
        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the input as a string
                String input = editText.getText().toString();

                //if the input is empty give an warning
                if(TextUtils.isEmpty(input)) {
                    editText.setError("Empty user input");
                }
                else {
                    //else take the input and change it to double
                    double cad, result;
                    cad = Double.parseDouble(input);

                    //setting the textview to null before displaying result
                    textView.setText(null);
                    //convert to US dollar
                    result = cad * 0.76;

                    //format the result
                    Formatter formatter = new Formatter();
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(result));
                }
                }
        });
    }
}
