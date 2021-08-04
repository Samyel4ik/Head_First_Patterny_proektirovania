public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription (){
        return beverage.getDescription() + ", Whip";
    }
    public double cost (){
        return 0.35 + beverage.cost();
    }
    public int theAmountOfWaterInTheDrink (){
        return 0;
    }
    public int theAmountOfCoffeeInTheDrink(){
        return 0;
    }
}
