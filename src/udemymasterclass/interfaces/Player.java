package udemymasterclass.interfaces;

import java.util.List;
import java.util.ArrayList;

public class Player implements ISaveable{

    private String name, weapon;
    private int hitPoints, strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return this.name;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> playerInfo = new ArrayList<>();
        playerInfo.add(this.name);
        playerInfo.add(Integer.toString(this.hitPoints));
        playerInfo.add(Integer.toString(this.strength));
        playerInfo.add(this.weapon);
        return playerInfo;
    }

    @Override
    public void read(List<String> playerInfo) {
        if (playerInfo != null && playerInfo.size() > 0) {
            this.name = playerInfo.get(0);
            this.hitPoints = Integer.parseInt(playerInfo.get(1));
            this.strength = Integer.parseInt(playerInfo.get(2));
            this.weapon = playerInfo.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                "}";
    }

}
