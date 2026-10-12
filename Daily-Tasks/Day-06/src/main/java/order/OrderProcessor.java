
package order;

class InsufficientStockException extends Exception {
    public InsufficientStockException(String message) {
        super(message);
    }
}

class InvalidQuantityException extends RuntimeException {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

public class OrderProcessor {

    private int stock = 5;

    public void processOrder(int quantity) {
        try {
            if (quantity <= 0) {
                throw new InvalidQuantityException(
                    "Quantity must be positive."
                );
            }

            if (quantity > stock) {
                throw new InsufficientStockException(
                    "Not enough stock. Available: " + stock
                );
            }

            stock -= quantity;
            System.out.println("Order successful: " + quantity);

        } catch (InsufficientStockException |
                 InvalidQuantityException e) {

            throw new IllegalStateException(
                "Order failed.", e
            );

        } finally {
            System.out.println("AUDIT: Order attempt completed.");
        }
    }

    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();

        int[] quantities = {2, 10, -1};

        for (int quantity : quantities) {
            try {
                System.out.println("\nRequested: " + quantity);
                processor.processOrder(quantity);

            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println(
                    "Cause: " + e.getCause().getMessage()
                );
            }
        }

        System.out.println("\nRemaining stock: " + processor.stock);
    }
}
