package PaymentProcessing;

public class PayPalPayment extends PaymentMethod{
    String email;
    String password;

    public PayPalPayment(String email, String password){
        this.email = email;
        this.password = password;
    }
    @Override
    public boolean validatePaymentDetails(){
        if(!email.contains("@") && !email.contains(".") && email==null ){
            return false;
        }
        return true;
    }

    @Override
    void processPayment(double amount) {
        if(!validatePaymentDetails()) {
            paymentStatus = "fail";
            System.out.println("You hav entered wrong details");

        }

            paymentStatus = "Pass";
            System.out.println("Correct details" + amount);

        }


}
