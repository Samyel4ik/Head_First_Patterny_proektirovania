public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription (){
        return beverage.getDescription() + " , Mocha";

    }
    public double cost (){
        return 0.50 + beverage.cost();
    }
}
