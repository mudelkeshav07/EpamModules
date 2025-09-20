package PaymentProcessing;

import java.util.Queue;

public class M {
    public static void main(String[] args) {


        PaymentProcessor p = new PaymentProcessor();

        //Credit Card
        CreditCardPayment cc = new CreditCardPayment("456812345","12/32","789");
       p.Method(cc, 700);

       //Paypal
        PayPalPayment pp = new PayPalPayment("abc@gmail.com", "abc123");
        p.Method(pp, 800);
        //inavliad paypal
        PayPalPayment p1 = new PayPalPayment("abcg", "abc");
        p.Method(pp, 800);

        //Bank Transfer
        BankTransfer bb = new BankTransfer("123456789", "HDFC");
        p.Method(bb, 500);

        System.out.println(p.history);
    }
}
