package com.example.funfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    //Declare our View Variables

    private TextView FactTextView;
    private Button ShowFactButton;

    private RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign The Views form the layout file to the corresponding variables
        FactTextView = findViewById(R.id.factTextView);
        ShowFactButton = findViewById(R.id.showFactButton);

        relativeLayout = findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fact = factBook.getFact();

                //Update the screen with our new fact
                FactTextView.setText(fact);
                int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                ShowFactButton.setTextColor(color);

            }
        };
        ShowFactButton.setOnClickListener(listener);

    }


}
