package Task2;

import Task1.FinalPizza;

public class FinalCost {

    Bouquet b;

    public FinalCost(Bouquet b){
        this.b = b;
    }

    public int Calculate(){
        return b.getRose()*1+b.getJasmine()*2+b.getLilys()*3;
    }

    public static void main(String[] args) {
        Bouquet bou = new Bouquet(5,6,7);
        FinalCost f = new FinalCost(bou);
        System.out.println(f.Calculate());
    }
}
