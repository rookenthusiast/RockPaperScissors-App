package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by user on 14/12/2016.
 */
public class RockPaperScissorsActivity extends AppCompatActivity {
    TextView cpuWeaponText;
    ImageButton rockButton;
    ImageButton paperButton;
    ImageButton scissorsButton;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_rockpaperscissors);

        rockButton = (ImageButton) findViewById(R.id.rock_button);
        paperButton = (ImageButton) findViewById(R.id.paper_button);
        scissorsButton = (ImageButton) findViewById(R.id.scissors_button);

        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RockPaperScissorsActivity.this, ResultActivity.class);
                intent.putExtra("playerChoice", 0);
                startActivity(intent);
            }
        });

        paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RockPaperScissorsActivity.this, ResultActivity.class);
                intent.putExtra("playerChoice", 1);
                startActivity(intent);
            }
        });

        scissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RockPaperScissorsActivity.this, ResultActivity.class);
                intent.putExtra("playerChoice", 2);
                startActivity(intent);
            }
        });
    }
}
