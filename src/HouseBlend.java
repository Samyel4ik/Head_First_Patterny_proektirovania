public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return 0.25;
    }
    public int theAmountOfWaterInTheDrink (){
        return 10;
    }
    public int theAmountOfCoffeeInTheDrink(){
        return 20;
    }
}
