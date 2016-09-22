package com.khrys.thediceproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Chrysler on 9/20/2016.
 * <p>
 * TheDiceProject
 */

public class ActivityDice extends Activity {
    Button RollTheDice;
    TextView Number, Title;
    int max;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        max = getIntent().getIntExtra("max",0);

        RollTheDice = (Button) findViewById(R.id.buttonRollDice);
        Title = (TextView) findViewById(R.id.textViewDiceType);
        Number = (TextView) findViewById(R.id.textViewNumber);

        String txt = String.format(getResources().getString(R.string.de),max);
        Title.setText(txt);

        RollTheDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = String.format("%d", random.nextInt(max)+1);
                Number.setText(txt);
            }
        });

    }
}
