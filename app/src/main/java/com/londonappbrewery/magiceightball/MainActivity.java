package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView ballDisplay;
    Button mybutton;
    int[] ballArray = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        mybutton = (Button) findViewById(R.id.askButton);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int random_Number = random.nextInt(5);

                ballDisplay.setImageResource(ballArray[random_Number]);

            }
        });

    }
}
