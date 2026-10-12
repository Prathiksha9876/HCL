
package payment;

public class PaymentApp {

    public static void main(String[] args) {

        PaymentMethod upi = new UPIPayment();
        PaymentMethod card = new CardPayment();

        System.out.println("Payment Method: " + upi.getPaymentType());
        upi.pay(1500);

        System.out.println();

        System.out.println("Payment Method: " + card.getPaymentType());
        card.pay(2500);
    }
}
