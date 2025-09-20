package PaymentProcessing;

public class CreditCardPayment extends PaymentMethod{
    String cardNumber;
    String expiryDate;
    String cvv;

    public CreditCardPayment(String cardnumber, String expirydate, String cvv){
        this.cardNumber = cardnumber;
        this.expiryDate = expirydate;
        this.cvv = cvv;
    }
    @Override
    public boolean validatePaymentDetails(){
        if(cardNumber.length()!=9){
            return false;
        }

        for(char t : cardNumber.toCharArray()){
            if(!Character.isDigit(t)){
                return false;
            }
        }

        if(cvv.length()!=3){
            return false;
        }
        for(char y : cvv.toCharArray()){
            if(!Character.isDigit(y)){
                return false;
            }
        }
        //expirydate Validations
        return true;

    }


    @Override
    void processPayment(double amount) {
        if(!validatePaymentDetails()){
            paymentStatus = "fail";
            System.out.println("You hav entered wrong details");

        }

            paymentStatus ="Pass";
            System.out.println("Correct details"+ amount);

    }
}
