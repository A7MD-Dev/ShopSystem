package system.exception;

public class OrderItemsNotFoundException extends RuntimeException {
    public OrderItemsNotFoundException(String message) {
        super(message);
    }
}
