import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.setCoffee(50);
        coffeeMachine.setWater(100);
        coffeeMachine.setListComponent(listComp());

        coffeeMachine.setListDrink(list());

        coffeeMachine.serveAGlass();

        Beverage beverage = selectDrink(coffeeMachine);

        beverage = selectComponent(coffeeMachine, beverage);

        coffeeMachine.giveAStick();
        coffeeMachine.allCoffee(beverage);
        coffeeMachine.allWater(beverage);

        drinkInfo(beverage);
        coffeeMachineInfo(coffeeMachine);

    }

    public static void coffeeMachineInfo(CoffeeMachine coffeeMachine) {
        System.out.println("Остаток воды в машине " + coffeeMachine.getWater() + "  Остаток кофе в машине " + coffeeMachine.getCoffee());
    }

    public static Beverage selectComponent(CoffeeMachine coffeeMachine, Beverage beverage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите дополнение к напитку из предложенных " + coffeeMachine.getListComponent());
        String nameComponent = scanner.nextLine();
        return CoffeeMachine.purchaseComponent(nameComponent, beverage);
    }

    public static Beverage selectDrink(CoffeeMachine coffeeMachine) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите напиток из предложенных " + coffeeMachine.getListDrink());
        String nameDrink = scanner.nextLine();
        return CoffeeMachine.purchaseDrink(nameDrink);
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
