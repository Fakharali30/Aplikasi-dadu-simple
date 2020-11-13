package com.fakharcorps.mydiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;




import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView diceimage1 = findViewById(R.id.imgdice1);
        final ImageView diceimage2 = findViewById(R.id.imgdice2);

        final int [] diceimage = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};


        Button btnKocok = findViewById(R.id.kocokdadu);

        final MediaPlayer mp = MediaPlayer.create(this,R.raw.dice_sound);

        btnKocok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyDiceApp", "klikkcuyy");

                Random rndmObject = new Random();

                int myRandomObject = rndmObject.nextInt(6);
                Log.i("MyDIceApp", "this is my dice! " + myRandomObject );

                diceimage1.setImageResource(diceimage[myRandomObject]);

                myRandomObject = rndmObject.nextInt(6);
                diceimage2.setImageResource(diceimage[myRandomObject]);

                mp.start();
            }
        });
    }
}
