package com.example.lab8;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DrinkActivity extends AppCompatActivity {
    private String drink;
    private String drinkURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadWebSite(view);
            }
        });

        Intent intent = getIntent();
        drink = intent.getStringExtra("drinkName");
        drinkURL = intent.getStringExtra("drinkURL");
        Log.i("drink received", drink);
        Log.i("url received", drinkURL);

        //update text view
        TextView messageView = findViewById(R.id.DrinkTextView);
        messageView.setText("You should check out " + drink);
    }

    private void loadWebSite(View view){
        Intent intent = new Intent((Intent.ACTION_VIEW));
        intent.setData(Uri.parse(drinkURL));
        startActivity(intent);
    }

}
