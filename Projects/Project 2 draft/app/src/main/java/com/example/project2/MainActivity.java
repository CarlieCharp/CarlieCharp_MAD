package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    CheckBox cb, cb2, cb3, cb4, cb5, cb6;
    TextView text;
    Button finalVerdict;
    private TextView verdictSelection;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This works
        cb = (CheckBox) findViewById(R.id.checkBox);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        cb4 = (CheckBox) findViewById(R.id.checkBox4);
        cb5 = (CheckBox) findViewById(R.id.checkBox5);
        cb6 = (CheckBox) findViewById(R.id.checkBox6);
        text = (TextView) findViewById(R.id.verdictTextView);


        //get views
       // verdictSelection = findViewById(R.id.verdictTextView);

    }



    public void checkone(View v)
    {

      /*  if (cb.isChecked() && cb2.isChecked() && cb3.isChecked() cb4.isChecked() && cb5.isChecked() && cb6.isChecked())
        {
            //toast
            Context context = getApplicationContext();
            CharSequence text = "Please do not select all 6 extra points";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        } */

        //3 pro
        if (cb.isChecked() && cb2.isChecked() && cb3.isChecked())
        {
            text.setText("Pro");

        }

        //3 con
        else if (cb4.isChecked() && cb5.isChecked() && cb6.isChecked())
        {
            text.setText("Con");

        }

        //2 pro
        else if (cb.isChecked() && cb2.isChecked())
        {
            text.setText("Pro");

        }

        else if (cb2.isChecked() && cb3.isChecked())
        {
            text.setText("Pro");

        }

        else if (cb.isChecked() && cb3.isChecked())
        {
            text.setText("Pro");

        }



        //2 con
        else if (cb4.isChecked() && cb5.isChecked())
        {
            text.setText("Con");

        }

        else if (cb5.isChecked() && cb6.isChecked())
        {
            text.setText("Con");

        }

        else if (cb4.isChecked() && cb6.isChecked())
        {
            text.setText("Con");

        }

        else {
            text.setText("IDK man");
        }

    /*public void finalVerdict(View view) {

      */

    }




}

