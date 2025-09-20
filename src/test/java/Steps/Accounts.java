package Steps;

public class Accounts {
    int balance;

    public Accounts(int bal){
        this.balance =  bal;
    }

    public void Withdraw(int amount){
        if(amount<balance){
            balance-=amount;
        }
        else{
            System.out.println("Insufficeint amount");
        }
    }

    public int getBalance(){
        return balance;
    }
}
