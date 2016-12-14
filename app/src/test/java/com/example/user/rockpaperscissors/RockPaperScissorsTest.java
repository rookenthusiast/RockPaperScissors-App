package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 14/12/2016.
 */
public class RockPaperScissorsTest {
    Weapon weapon;
    RockPaperScissors rockPaperScissors;

    @Test
    public void canGetWeapon(){
        rockPaperScissors = new RockPaperScissors(0);
        weapon = new Weapon("Rock", "Scissors");
        assertEquals("Rock",rockPaperScissors.getPlayerThrow());
    }

    @Test
    public void canDrawRockRock(){
        rockPaperScissors = new RockPaperScissors(0);
        weapon = new Weapon("Rock", "Scissors");
        assertEquals("Draw", rockPaperScissors.getResult(weapon));
    }

    @Test
    public void canWinRockScissors(){
        rockPaperScissors = new RockPaperScissors(0);
        weapon = new Weapon("Scissors", "Paper");
        assertEquals("Player Wins", rockPaperScissors.getResult(weapon));
    }

    @Test
    public void canLosePaperRock(){
        rockPaperScissors = new RockPaperScissors(0);
        weapon = new Weapon("Paper", "Rock");
        assertEquals("Player Lost", rockPaperScissors.getResult(weapon));
    }

    @Test
    public void canDrawPaperPaper(){
        rockPaperScissors = new RockPaperScissors(1);
        weapon = new Weapon("Paper", "Rock");
        assertEquals("Draw", rockPaperScissors.getResult(weapon));
    }

    @Test
    public void canWinPaperRock(){
        rockPaperScissors = new RockPaperScissors(1);
        weapon = new Weapon("Rock", "Scissors");
        assertEquals("Player Wins", rockPaperScissors.getResult(weapon));
    }

    @Test
    public void canLosePaperScissors(){
        rockPaperScissors = new RockPaperScissors(1);
        weapon = new Weapon("Scissors", "Paper");
        assertEquals("Player Lost", rockPaperScissors.getResult(weapon));
    }
    @Test
    public void canDrawScissorsScissors(){
        rockPaperScissors = new RockPaperScissors(2);
        weapon = new Weapon("Scissors", "Paper");
        assertEquals("Draw", rockPaperScissors.getResult(weapon));
    }

    @Test
    public void canWinScissorsPaper(){
        rockPaperScissors = new RockPaperScissors(2);
        weapon = new Weapon("Paper", "Rock");
        assertEquals("Player Wins", rockPaperScissors.getResult(weapon));
    }

    @Test
    public void canLoseScissorsRock(){
        rockPaperScissors = new RockPaperScissors(2);
        weapon = new Weapon("Rock", "Scissors");
        assertEquals("Player Lost", rockPaperScissors.getResult(weapon));
    }

}
