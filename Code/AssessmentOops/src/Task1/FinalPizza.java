package Task1;

public class FinalPizza {

    PizzaBase base;
    Toppings top;

    public FinalPizza(PizzaBase p, Toppings t){
        this.base = p;
        this.top = t;
    }
    public int Calculate(){
        return base.getCost()+top.getCost();
        }

    public static void main(String[] args) {
        PizzaBase p = new PizzaBase("Soft",100);
        Toppings t = new Toppings("Tomato", 50);

        FinalPizza f = new FinalPizza(p,t);
        System.out.println(f.Calculate());
    }
}
