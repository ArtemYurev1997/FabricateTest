package by.pvt.fabricate;

public class Main {
    public static void main(String[] args) {
        FabricateTest fabricateTest = new FabricateTest();
        Coffee coffee1 = fabricateTest.createCoffee(KindOfCoffee.AMERICANO, 100, 50);
        Coffee coffee2 = fabricateTest.createCoffee(KindOfCoffee.CAPPUCCINO, 150, 80);
        Coffee coffee3 = fabricateTest.createCoffee(KindOfCoffee.ESPRESSO, 200, 80);
        Coffee coffee4 = fabricateTest.createCoffee(KindOfCoffee.LATTE, 80, 150);
        coffee1.addSugar(3);
        coffee2.addSugar(2);
        coffee3.addSugar(2);
        coffee4.addSugar(4);

        CoffeeShop coffeeShop1 = CoffeeShop.getInstance();
        CoffeeShop coffeeShop2 = CoffeeShop.getInstance();
        System.out.println(coffeeShop1);
        System.out.println(coffeeShop2);

        coffeeShop1.getKindOfCoffee().add(coffee1);
        coffeeShop1.getKindOfCoffee().add(coffee2);
        coffeeShop1.getKindOfCoffee().add(coffee3);
        coffeeShop1.getKindOfCoffee().add(coffee4);

        coffeeShop2.getKindOfCoffee().add(coffee1);
        coffeeShop2.getKindOfCoffee().add(coffee2);
        coffeeShop2.getKindOfCoffee().add(coffee3);
        coffeeShop2.getKindOfCoffee().add(coffee4);

        System.out.println(coffeeShop1);
        System.out.println(coffeeShop2);
    }
}
