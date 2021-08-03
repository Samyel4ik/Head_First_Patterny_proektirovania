import java.util.List;

public class CoffeeMachine {
    List<String> listDrink;
    List<String> listComponent;

    public void setListDrink(List<String> listDrink) {
        this.listDrink = listDrink;
    }

    public void setListComponent(List<String> listComponent) {
        this.listComponent = listComponent;
    }
    public List<String> newListWithSupplementedDrinks(String newDrink){
        this.listDrink.add(newDrink);
        return this.listDrink;
    }
    public List<String> newListWithAddedComponents(String newComponent){
        this.listComponent.add(newComponent);
        return this.listComponent;
    }
    public void serveAGlass() {
    }

    public void giveAStick() {
    }

    public List<String> getListDrink() {
        return listDrink;
    }

    public List<String> getListComponent() {
        return listComponent;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "listDrink=" + listDrink +
                ", listComponent=" + listComponent +
                '}';
    }
}
