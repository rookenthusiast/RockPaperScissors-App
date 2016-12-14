package com.example.user.rockpaperscissors;

/**
 * Created by user on 14/12/2016.
 */
public class Weapon {
    private String name;
    private String defeats;

    public Weapon(String name, String defeats){
        this.name = name;
        this.defeats = defeats;
    }

    public String getDefeats() {
        return defeats;
    }

    public String getName() {
        return name;
    }
}
