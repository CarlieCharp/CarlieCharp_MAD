package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sayMorning(View view) {
        TextView morningText = findViewById(R.id.message);
        EditText name = findViewById(R.id.editText2);
        String nameValue = name.getText().toString();
        EditText time = findViewById(R.id.editText);
        String timeValue = time.getText().toString();
        morningText.setText("Good morning " + nameValue + ", at " + timeValue + " it's time to wake up!");
        ImageView sun = findViewById(R.id.imageView);
        sun.setImageResource(R.drawable.sun);
    }
}
