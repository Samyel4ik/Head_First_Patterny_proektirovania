import java.util.ArrayList;
import java.util.List;


public class Application {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.setListComponent(listComp());

        coffeeMachine.setListDrink(list());

        coffeeMachine.giveAStick();

        Beverage beverage = CoffeeMachine.selectDrink(coffeeMachine);

        beverage = CoffeeMachine.selectComponent(coffeeMachine, beverage);

        coffeeMachine.giveAStick();

        drinkInfo(beverage);

    }

    public static void drinkInfo(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }


    public static List<String> list() {
        List<String> list = new ArrayList<>();
        list.add("Espresso");
        list.add("DarkRoast");
        list.add("Decaf");
        return list;
    }

    public static List<String> listComp() {
        List<String> list = new ArrayList<>();
        list.add("Soy");
        list.add("Whip");
        list.add("Mocha");
        return list;
    }


}
