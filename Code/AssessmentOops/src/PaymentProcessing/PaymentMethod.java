package PaymentProcessing;

abstract class PaymentMethod {

    public String paymentStatus;





    abstract void processPayment(double amount);

    public boolean validatePaymentDetails() {
       return true;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }
}