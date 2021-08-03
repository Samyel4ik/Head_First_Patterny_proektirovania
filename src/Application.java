import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Выберите напиток из предложенных");
        System.out.println(list());
        Scanner scanner = new Scanner(System.in);
        String sss = scanner.nextLine();
        Beverage beverage1 =drink(sss);
        System.out.println("Выберите напиток из предложенных");
        System.out.println(listComp());
        String sss1 = scanner.nextLine();
        beverage1 = drinkWithSupplement(sss1,beverage1);
        // метод стаканчик и палочка
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
    public static Beverage drinkWithSupplement(String sss1,Beverage beverage){
        if (sss1.equalsIgnoreCase("Soy")){
            return new Soy(beverage);
        }
        if (sss1.equalsIgnoreCase("Whip")){
            return new Whip(beverage);
        }
        if (sss1.equalsIgnoreCase("Mocha")){
            return new Mocha(beverage);
        }
        return null;

    }

    public static Beverage drink(String sss){
        if (sss.equalsIgnoreCase("Decaf")){
            return new Decaf();
        }
        if (sss.equalsIgnoreCase("Espresso")){
            return new Espresso();
        }
        if (sss.equalsIgnoreCase("DarkRoast")){
            return new DarkRoast();
        }
        return null;
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
