package PaymentProcessing;

public class BankTransfer extends PaymentMethod {
    String acccountnumber;
    String bankName;

    public BankTransfer(String acccountnumber, String bankName){
        this.acccountnumber = acccountnumber;
        this.bankName = bankName;
    }

    @Override
     public boolean validatePaymentDetails(){
        if(acccountnumber.length()!=10){
            return false;
        }

        if(bankName==null){
            return false;
        }
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



