package by.pvt.fabricate;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private List<Coffee> kindOfCoffee = new ArrayList<>();

    public List<Coffee> getKindOfCoffee() {
        return kindOfCoffee;
    }

    public void setKindOfCoffee(List<Coffee> kindOfCoffee) {
        this.kindOfCoffee = kindOfCoffee;
    }

    private int i = 0;

    private static CoffeeShop coffeeShop;

    public CoffeeShop() {
        ++i;
    }

    public static CoffeeShop getInstance() {
        if(coffeeShop == null) {
            return new CoffeeShop();
        }
        return coffeeShop;
    }

    @Override
    public String toString() {
        return "CoffeeShop{" +
                "kindOfCoffee=" + kindOfCoffee +
                ", i=" + i +
                '}';
    }
}
