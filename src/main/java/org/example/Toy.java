package org.example;

public class Toy {
    private int ID;
    private String name;
    private double chance;

    public Toy(int ID, String name, double chance) {
        this.ID = ID;
        this.name = name;
        this.chance = chance;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChance() {
        return chance;
    }

    public void setChance(double chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        return String.format("Номер игрушки: %d, название: %s, шанс получения: %f", getID(), getName(), getChance());
    }
}
