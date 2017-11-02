package com.example.taruc.practical2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textWeight;
    EditText textHeight;
    TextView BMI;
    ImageView Results;

    double height;
    double weight;
    double result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textHeight = (EditText) findViewById(R.id.editTextheight);
        textWeight = (EditText) findViewById(R.id.editTextWeight);
        BMI = (TextView) findViewById(R.id.textViewResults);
        Results = (ImageView) findViewById(R.id.imageViewResults);
    }

    public void Calculate(View view){
        height= Double.parseDouble(textHeight.getText().toString());
        weight= Double.parseDouble(textWeight.getText().toString());


        result = weight/height;

        if(result <= 18.5)
            Results.setImageResource(R.drawable.under);
        else if (result >= 25)
            Results.setImageResource(R.drawable.over);
        else
            Results.setImageResource(R.drawable.normal);



    }

    public void Reset (View view){
        textHeight.setText("");
        textWeight.setText("");
        BMI.setText("");
    }



}
