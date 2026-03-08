package oopsfundamentals.enums.orderprocessing;

public enum PaymentMethod {
    CREDIT_CARD("Credit Card", 2.5),
    DEBIT_CARD("Debit Card", 1.0),
    PAYPAL("PayPal", 1.0),
    CASH_ON_DELIVERY("Cash on Delivery", 0.0);
    private String displayName;
    private double value;

    private PaymentMethod(String displayName, double value) {
        this.displayName = displayName;
        this.value = value;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getValue() {
        return value;
    }

}
