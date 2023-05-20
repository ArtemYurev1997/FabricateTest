package by.pvt.fabricate;

public class Americano implements Coffee {
    private int water;
    private int milk;
    private int sugar;

    public Americano(int water, int milk) {
        this.water = water;
        this.milk = milk;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    @Override
    public void addSugar(int i) {
        System.out.println("Add sugar in Americano");
        sugar = i;
        System.out.println("Added " + sugar + " piece of sugar");
    }

    @Override
    public String toString() {
        return "Americano{" +
                "water=" + water +
                ", milk=" + milk +
                ", sugar=" + sugar +
                '}';
    }
}
