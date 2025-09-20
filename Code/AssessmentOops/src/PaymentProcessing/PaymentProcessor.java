package PaymentProcessing;


import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PaymentProcessor {

    List<String> history = new ArrayList<>();

    public void Method(PaymentMethod paymentMethod, double amount){
        if(!paymentMethod.validatePaymentDetails()){
           throw new InvalidPaymentDetailsException("You have entered wrong details");
        }
        if(amount>1000){
            throw new InsufficientFundsException("You hav insufficent Funds in your account");
        }
        paymentMethod.processPayment(amount);


        //Log history
        if("Pass".equals(paymentMethod.getPaymentStatus())){
            String items = paymentMethod.getClass().getSimpleName();
            history.add(items);
            System.out.println("Tarnsaction History = "+ history);
        }
        else {
            System.out.println(paymentMethod.getClass());
        }
    }

    public List<String> getHistory(){
        return history;
    }


}
