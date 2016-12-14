package com.example.user.rockpaperscissors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 14/12/2016.
 */
public class RockPaperScissors {
    private Weapon  playerThrow;
    private ArrayList<Weapon> possibleThrows;
    private Weapon cpuThrow;

    public RockPaperScissors(int playerWeaponIndex){
        this.possibleThrows = new ArrayList<Weapon>();
        possibleThrows.add(new Weapon("Rock", "Scissors"));
        possibleThrows.add(new Weapon ("Paper", "Rock"));
        possibleThrows.add(new Weapon("Scissors", "Paper"));

        this.playerThrow = possibleThrows.get(playerWeaponIndex);
    }

    public String getPlayerThrow(){
        return playerThrow.getName();
    }

    public Weapon getCpuThrow(){
        Random rand = new Random();
        int arrayLength = possibleThrows.size();
        int randomIndex = rand.nextInt(arrayLength);
        return possibleThrows.get(randomIndex);
    }

    public String getResult(Weapon cpuThrow){
        if (cpuThrow.getName().equals(playerThrow.getName())) {
            return "Draw";}
        else if(playerThrow.getDefeats().equals(cpuThrow.getName())){
            return "Player Wins";
        }
        return "Player Lost";
    }

}


