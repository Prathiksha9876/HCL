
package payment;

public class CardPayment implements PaymentMethod {

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount.");
            return false;
        }

        System.out.println("Card payment successful: Rs. " + amount);
        return true;
    }

    @Override
    public String getPaymentType() {
        return "Card";
    }
}
