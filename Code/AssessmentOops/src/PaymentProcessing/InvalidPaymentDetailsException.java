package PaymentProcessing;

public class InvalidPaymentDetailsException extends RuntimeException {
  public InvalidPaymentDetailsException(String message) {
    super(message);
  }
}
