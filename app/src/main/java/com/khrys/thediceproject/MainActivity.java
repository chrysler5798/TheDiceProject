package com.khrys.thediceproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonDe6, buttonDe20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("The Dice Project");

        buttonDe6 = (Button) findViewById(R.id.buttonDe6);
        buttonDe20 = (Button) findViewById(R.id.buttonDe20);

        buttonDe6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, ActivityDice.class);
                myIntent.putExtra("max", 6);
                startActivity(myIntent);

            }
        });

        buttonDe20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, ActivityDice.class);
                myIntent.putExtra("max", 20);
                startActivity(myIntent);

            }
        });


    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_edit:
            /* DO EDIT */
                return true;
            case R.id.action_add:
            /* DO ADD */
                return true;
            case R.id.action_delete:
            /* DO DELETE */
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
