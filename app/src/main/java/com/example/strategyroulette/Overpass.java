package com.example.strategyroulette;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Overpass extends AppCompatActivity {
    private TextView text;
    private Random rand;
    private int choose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overpass);
        Bundle extra = getIntent().getExtras();
        final String[] arrayCT = extra.getStringArray("ctStrats");
        final String[] arrayT = extra.getStringArray("tStrats");
        text = (TextView)findViewById(R.id.strat5);
        rand = new Random();

        Button attackButton = findViewById(R.id.t_button5);
        Button defendButton = findViewById(R.id.ct_button5);

        attackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                choose = rand.nextInt(40);
                text.setText(arrayT[choose]);
            }
        });
        defendButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                choose = rand.nextInt(40);
                text.setText(arrayCT[choose]);
            }
        });
    }
}
