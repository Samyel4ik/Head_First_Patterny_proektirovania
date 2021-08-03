public class Soy extends CondimentDecorator {
    Beverage beverage;
    int soy;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public void setSoy(int soy) {
        this.soy = soy;
    }

    public int add(int x) {
        return this.soy + x;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return 0.40 + beverage.cost();
    }
}
