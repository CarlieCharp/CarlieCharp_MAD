package com.example.coffee_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    CheckBox cb, cb2, cb3, cb4, cb5;
    TextView text;
    EditText name;
    Button finalVerdict;
    private TextView verdictSelection;
    private Button button;
    private Spinner crowdSpinner;
    private NameShop myCoffeeShop = new NameShop();
    private ToggleButton toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This works
        cb = (CheckBox) findViewById(R.id.checktaco);
        cb2 = (CheckBox) findViewById(R.id.checkburrito);
        cb3 = (CheckBox) findViewById(R.id.checkBox1);
        cb4 = (CheckBox) findViewById(R.id.checkBox2);
        cb5 = (CheckBox) findViewById(R.id.checkBox3);
        text = (TextView) findViewById(R.id.verdictTextView);
        name = findViewById(R.id.editText);
        toggle = findViewById(R.id.toggleButton);


        crowdSpinner = findViewById(R.id.spinner);
        button = findViewById(R.id.button);
        //create listener
        View.OnClickListener onclick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findCoffee(v);
            }
        };
        //add listener to button
        button.setOnClickListener(onclick);
    }

    private void findCoffee(View view) {
        Integer crowd = crowdSpinner.getSelectedItemPosition();
        myCoffeeShop.setCoffeeShopName(crowd);
        String suggestedCoffeeShop = myCoffeeShop.getCoffeeShopName();
        String suggestedCoffeeShopURL = myCoffeeShop.getCoffeeShopURL();
        Log.i("shop suggested", suggestedCoffeeShop);
        Log.i("url suggested", suggestedCoffeeShopURL);

        Intent intent = new Intent(this, NameActivity.class);
        intent.putExtra("coffeeShopName", suggestedCoffeeShop);
        intent.putExtra("coffeeShopURL", suggestedCoffeeShopURL);
        startActivity(intent);
    }


    public void finalVerdict(View v) {

        //edittext
        String nameValue = name.getText().toString();

        if (cb.isChecked() && cb2.isChecked()) {
            text.setText("Hey " + nameValue + " pick one!");

            //toast
            Context context = getApplicationContext();
            CharSequence message = "Please only select taco or burrit";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, message, duration);
            toast.show();

        }

        //Taco ones
        //all three
        else if (cb.isChecked() && cb3.isChecked() && cb4.isChecked() && cb5.isChecked())
        {
            text.setText("Hey " +  nameValue + ", you should have a taco with cheese, salsa, and lettuce!");
            ImageView taco = findViewById(R.id.imageView);
            taco.setImageResource(R.drawable.taco);

        }

        //
        else if (cb.isChecked() && cb3.isChecked() && cb4.isChecked())
        {
            text.setText("Hey " +  nameValue + ", you should have a taco with cheese and sals!");
            ImageView taco = findViewById(R.id.imageView);
            taco.setImageResource(R.drawable.taco);


        }

        else if (cb.isChecked() && cb3.isChecked() && cb5.isChecked())
        {
            text.setText("Hey " +  nameValue + ", you should have a taco with cheese and lettuce!");
            ImageView taco = findViewById(R.id.imageView);
            taco.setImageResource(R.drawable.taco);

        }

        else if (cb.isChecked() && cb4.isChecked() && cb5.isChecked())
        {
            text.setText("Hey " +  nameValue + ", you should have a taco with lettuce and salsa!");
            ImageView taco = findViewById(R.id.imageView);
            taco.setImageResource(R.drawable.taco);

        }
        //just one toping
        else if (cb.isChecked() && cb3.isChecked())
        {
            text.setText("Hey " +  nameValue + ", you should have a taco with cheese!");
            ImageView taco = findViewById(R.id.imageView);
            taco.setImageResource(R.drawable.taco);

        }

        else if (cb.isChecked() && cb4.isChecked())
        {
            text.setText("Hey " +  nameValue + ", you should have a taco with salsa!");
            ImageView taco = findViewById(R.id.imageView);
            taco.setImageResource(R.drawable.taco);

        }

        else if (cb.isChecked() && cb5.isChecked())
        {
            text.setText("Hey " +  nameValue + ", you should have a taco with lettuce!");
            ImageView taco = findViewById(R.id.imageView);
            taco.setImageResource(R.drawable.taco);

        }

        //burrito ones
        else if (cb2.isChecked() && cb3.isChecked() && cb4.isChecked() && cb5.isChecked())
        {
            text.setText("Hey " +  nameValue + ", you should have a burrito with cheese, salsa, and lettuce!");
            ImageView burrito = findViewById(R.id.imageView);
            burrito.setImageResource(R.drawable.burrito);
        }

        else if (cb2.isChecked() && cb3.isChecked() && cb4.isChecked())
        {
            text.setText("Hey " +  nameValue + ", you should have a burrito with cheese and salsa!");
            ImageView burrito = findViewById(R.id.imageView);
            burrito.setImageResource(R.drawable.burrito);

        }

        else if (cb2.isChecked() && cb3.isChecked() && cb5.isChecked())
        {
            text.setText("Hey " +  nameValue + ", you should have a burrito with cheese and lettuce!");
            ImageView burrito = findViewById(R.id.imageView);
            burrito.setImageResource(R.drawable.burrito);


        }

        else if (cb2.isChecked() && cb4.isChecked() && cb5.isChecked())
        {
            text.setText("Hey " +  nameValue + ", you should have a burrito with lettuce and salsa!");
            ImageView burrito = findViewById(R.id.imageView);
            burrito.setImageResource(R.drawable.burrito);
        }

        //just one toping
        else if (cb2.isChecked() && cb3.isChecked())
        {
            text.setText("Hey " +  nameValue + ", you should have A burrito with cheese!");
            ImageView burrito = findViewById(R.id.imageView);
            burrito.setImageResource(R.drawable.burrito);

        }

        else if (cb2.isChecked() && cb4.isChecked())
        {
            text.setText("Hey " +  nameValue + ", you should have a burrito with salsa!");
            ImageView burrito = findViewById(R.id.imageView);
            burrito.setImageResource(R.drawable.burrito);

        }

        else if (cb2.isChecked() && cb5.isChecked())
        {
            text.setText("Hey " +  nameValue + ", you should have a burrito with lettuce!");
            ImageView burrito = findViewById(R.id.imageView);
            burrito.setImageResource(R.drawable.burrito);

        }


    }
}


