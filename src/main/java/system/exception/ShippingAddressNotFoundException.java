package system.exception;

public class ShippingAddressNotFoundException extends RuntimeException {
    public ShippingAddressNotFoundException(String message) {
        super(message);
    }
}
