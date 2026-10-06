package com.example.diceegame;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollButton;
    ImageView leftDice;
    ImageView rightDice;
    int[] diceArray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rollButton = (Button) findViewById(R.id.rollButton);
        leftDice = (ImageView) findViewById(R.id.image_leftDice);
        rightDice = (ImageView) findViewById(R.id.image_rightDice);
    }

    public void randomDice(View view) {
        Random randomNumberGenerator = new Random();
        int number = randomNumberGenerator.nextInt(6);
        Log.d("Dicee","The random number is : " + number);
        leftDice.setImageResource(diceArray[number]);
        number = randomNumberGenerator.nextInt(6);
        rightDice.setImageResource(diceArray[number]);
    }
}