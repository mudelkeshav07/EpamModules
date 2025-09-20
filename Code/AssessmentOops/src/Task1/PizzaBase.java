package Task1;

public class PizzaBase {
    String name;
    int cost;

    public PizzaBase(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public int getCost(){
        return cost;
    }
    public String getName(){
        return name;
    }
}
