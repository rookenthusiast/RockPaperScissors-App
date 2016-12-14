package com.example.user.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 14/12/2016.
 */
public class RockPaperScissorsActivity extends AppCompatActivity {
    TextView cpuWeaponText;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_rockpaperscissors);

        RockPaperScissors rockPaperScissors = new RockPaperScissors(0);
        Weapon cpuThrow = rockPaperScissors.getCpuThrow();

        cpuWeaponText =(TextView)findViewById(R.id.cpu_throw_text);
        cpuWeaponText.setText(cpuThrow.getName());
    }
}
