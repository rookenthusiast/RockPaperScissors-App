package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by user on 14/12/2016.
 */
public class WelcomeActivity extends AppCompatActivity {
    TextView welcomeText;
    ImageButton welcomeButton;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_welcome);

        welcomeButton = (ImageButton) findViewById(R.id.start_button);

        welcomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, RockPaperScissorsActivity.class);
                startActivity(intent);
            }
        });
    }
}
