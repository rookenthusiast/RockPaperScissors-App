package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by user on 14/12/2016.
 */
public class ResultActivity extends AppCompatActivity {
    TextView resultText;
    ImageView cpuThrowImg;
    ImageView playerThrowImg;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int playerChoice = extras.getInt("playerChoice");

        RockPaperScissors rockPaperScissors = new RockPaperScissors(playerChoice);
        Weapon cpuThrow = rockPaperScissors.getCpuThrow();
        Weapon playerThrow = rockPaperScissors.getPlayerThrow();

        playerThrowImg =(ImageView) findViewById(R.id.player_throw_img);
        cpuThrowImg =(ImageView) findViewById(R.id.cpu_throw_img);

        setImage(playerThrowImg, playerThrow);
        setImage(cpuThrowImg, cpuThrow);

        resultText =(TextView)findViewById(R.id.result_text);

        String result = rockPaperScissors.getResult(cpuThrow);
        resultText.setText(result);

    }

    private void setImage(ImageView imageView, Weapon weapon) {
        if(weapon.getName().equals("Rock")) {
            imageView.setImageResource(R.drawable.rock);
        } else if (weapon.getName().equals("Paper")) {
            imageView.setImageResource(R.drawable.paper);
        } else {
            imageView.setImageResource(R.drawable.scissors);
        }
    }

}
