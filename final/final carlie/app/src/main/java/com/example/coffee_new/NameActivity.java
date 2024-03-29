package com.example.coffee_new;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.example.coffee_new.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {
    private String coffeeShop;
    private String coffeeShopURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
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
        coffeeShop = intent.getStringExtra("coffeeShopName");
        coffeeShopURL = intent.getStringExtra("coffeeShopURL");
        Log.i("shop received", coffeeShop);
        Log.i("url received", coffeeShopURL);

        //update text view
        TextView messageView = findViewById(R.id.coffeeShopTextView);
        messageView.setText("You should go to " + coffeeShop);
    }

    private void loadWebSite(View view){
        Intent intent = new Intent((Intent.ACTION_VIEW));
        intent.setData(Uri.parse(coffeeShopURL));
        startActivity(intent);
    }

}
