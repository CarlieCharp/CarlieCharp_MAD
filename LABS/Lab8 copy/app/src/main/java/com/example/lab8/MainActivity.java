package com.example.lab8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Spinner drinkSpinner;
    private Drink myDrink = new Drink();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drinkSpinner=findViewById(R.id.spinner);
        button = findViewById(R.id.button);
        //create listener
        View.OnClickListener onclick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findDrink(v);
            }
        };
        //add listener to button
        button.setOnClickListener(onclick);
    }

    private void findDrink(View view){
        Integer alcohol = drinkSpinner.getSelectedItemPosition();
        myDrink.setDrinkName(alcohol);
        String suggestedDrink = myDrink.getDrinkName();
        String suggestedDrinkURL = myDrink.getDrinkURL();//is this case sensitive? whats wrong
        Log.i("drink suggested", suggestedDrink);
        Log.i("url suggested", suggestedDrinkURL);

        Intent intent = new Intent(this,DrinkActivity.class);
        intent.putExtra("drinkName", suggestedDrink);
        intent.putExtra("drinkURL", suggestedDrinkURL);
        startActivity(intent);
    }
}
