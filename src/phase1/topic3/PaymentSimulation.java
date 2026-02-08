package phase1.topic3;

interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Card Payment...");
        System.out.println("Paid ₹" + amount + " using Card: " + cardNumber);
    }
}

class UPICheckout implements PaymentMethod {
    private String upiId;

    public UPICheckout(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI Payment...");
        System.out.println("Paid ₹" + amount + " using UPI ID: " + upiId);
    }
}

class PaymentProcessor {
    // This method doesn't care if it's UPI or Card!
    // It only cares that it "is-a" PaymentMethod.
    public void processPayment(PaymentMethod method, double amount) {
        method.pay(amount);
        System.out.println("Payment sequence completed.\n");
    }
}

public class PaymentSimulation {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // 1. Pay using Credit Card
        PaymentMethod card = new CreditCardPayment("4532-XXXX-XXXX-1234");
        processor.processPayment(card, 2500.50);

        // 2. Pay using UPI
        PaymentMethod upi = new UPICheckout("user@okhdfc");
        processor.processPayment(upi, 150.00);
    }
}
