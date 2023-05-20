package by.pvt.fabricate;

public class FabricateTest implements FabriceCoffee {


    @Override
    public Coffee createCoffee(KindOfCoffee kindOfCoffee, int water, int milk) {
        Coffee coffee = null;
        if(kindOfCoffee == KindOfCoffee.AMERICANO) {
            coffee = new Americano(water, milk);
        }
        else if(kindOfCoffee == KindOfCoffee.ESPRESSO) {
            coffee = new Espresso(water, milk);
        }
        else if(kindOfCoffee == KindOfCoffee.CAPPUCCINO) {
            coffee = new Cappuccino(water, milk);
        }
        else if(kindOfCoffee == KindOfCoffee.LATTE) {
            coffee = new Latte(water, milk);
        }
        return coffee;
    }
}

