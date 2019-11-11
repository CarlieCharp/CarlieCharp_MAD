package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Selection;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private static ImageView imageView;
    private static Button buttonsbm;
    private int current_image;
    int[] image={R.drawable.love, R.drawable.heart};//if it breaks delete above this line
    private TextView dateNight;
    private ToggleButton toggle;
    private Spinner relationship;
    private RadioGroup cost;
    private CheckBox winterCheckBox;
    private CheckBox springCheckBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //views
        winterCheckBox = findViewById(R.id.checkBox1);
        springCheckBox = findViewById(R.id.checkBox2);
        dateNight = findViewById(R.id.dateTextView);
        toggle = findViewById(R.id.toggleButton);
        relationship = findViewById(R.id.spinner);
        cost = findViewById(R.id.radioGroup);
        //add this back in if new stuff breaks
        ImageView heart = findViewById(R.id.imageView);
        heart.setImageResource(R.drawable.heart);


    }




    public void findDate(View view) {

        //toggle button
        boolean location = toggle.isChecked();

        //spinner
        String relationshipType = String.valueOf(relationship.getSelectedItem());

        //radio buttons
        int cost_id = cost.getCheckedRadioButtonId();

        //check boxes
        Boolean winter = winterCheckBox.isChecked();
        Boolean spring = springCheckBox.isChecked();

        //pick sport
        String perfectDate;


        //check radio buttons
        if (cost_id == -1) {
            //toast
            Context context = getApplicationContext();
            CharSequence text = "Please select a cost level";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        } else {
            if (location) { //night
                if (cost_id == R.id.radioButton1) { //cheapest option
                    perfectDate = "A workout date";
                } else {
                    switch (relationshipType) {
                        case "New Boy":
                            perfectDate = "Go to ice cream!";
                            break;
                        case "Boy Friend":
                            perfectDate = "Home cooked meal for two!";
                            break;
                        case "Husband":
                            perfectDate = "Dinner and a Movie in bed!";
                            break;
                        default:
                            perfectDate = "Go star gazing!";
                    }
                }
            } else { //day
                if (cost_id == R.id.radioButton3) {
                    if (winter) { //PRIVATE
                        perfectDate = "Weekend get away at a hotel!";
                    } else {
                        perfectDate = "Restaurant private room meal!";
                    }
                } else {//public
                    switch (relationshipType) {
                        case "New Boy":
                            perfectDate = "Meal at a nice place!";
                            break;
                        case "Boy Friend":
                            perfectDate = "In door sky diving!";
                            break;
                        case "Husband":
                            perfectDate = "Weekend get away at a hotel!";
                            break;
                        default:
                            perfectDate = "Movie and lunch on him!";
                    }
                }
            }

            //text view
            dateNight.setText("The perfect date:  " + perfectDate);

        }
    }
}





