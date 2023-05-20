package by.pvt.fabricate;

public class Espresso implements Coffee{
    private int water;
    private int milk;
    private int sugar;

    public Espresso(int water, int milk) {
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
        System.out.println("Add sugar in Espresso");
        sugar = i;
        System.out.println("Added " + sugar + " piece of sugar");
    }

    @Override
    public String toString() {
        return "Espresso{" +
                "water=" + water +
                ", milk=" + milk +
                ", sugar=" + sugar +
                '}';
    }
}
