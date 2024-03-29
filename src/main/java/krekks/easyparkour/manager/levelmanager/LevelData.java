package krekks.easyparkour.manager.levelmanager;

import org.bukkit.Location;
import org.bukkit.Material;

public class LevelData {

    int levelID;
    int points;
    int reward;
    Location levelSpawn;
    String levelName;
    int difficulty;
    String creator;
    Material icon;

    public LevelData (int id, Location l, String name, int d, String c, Material m, int p, int r){
        levelID = id;
        levelSpawn = l;
        levelName = name;
        difficulty = d;
        creator = c;
        icon = m;
        points = p;
        reward = r;
    }

    public void setReward(int r) {
        reward = r;
    }

    public int getReward() {
        return reward;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Material getIcon() {
        return icon;
    }

    public void setIcon(Material icon) {
        this.icon = icon;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getLevelID() {
        return levelID;
    }

    public void setLevelID(int levelID) {
        this.levelID = levelID;
    }

    public Location getLevelSpawn() {
        return levelSpawn;
    }

    public void setLevelSpawn(Location levelSpawn) {
        this.levelSpawn = levelSpawn;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
