package oopsfundamentals.enums.orderprocessing;

public class Order {

    private String orderId;
    private OrderStatus status;
    private double totalAmount;
    private PaymentMethod paymentMethod;

    public Order(String orderId, double totalAmount, PaymentMethod paymentMethod) {
        if (orderId == null || orderId.isEmpty()) {
            throw new IllegalArgumentException("Order ID cannot be null or empty");
        }
        if (totalAmount < 0) {
            throw new IllegalArgumentException("Total amount cannot be negative");
        }
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.status = OrderStatus.PLACED;
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public String getOrderId() {
        return orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order{"
                + "orderId='" + orderId + '\''
                + ", status=" + status
                + ", totalAmount=" + totalAmount
                + '}';
    }

    public boolean advanceStatus() {
        switch (status) {
            case PLACED -> {
                status = OrderStatus.SHIPPED;
                return true;
            }
            case SHIPPED -> {
                status = OrderStatus.DELIVERED;
                return true;
            }
            case DELIVERED -> {
                System.out.println("Order is already delivered. Cannot advance status.");
                return false;
            }
            default -> {
                System.out.println("Unknown order status. Cannot advance.");
                return false;
            }
        }
    }

    public double totalWithFees() {
        return totalAmount + totalAmount * paymentMethod.getValue() / 100;
    }

    public static void main(String[] args) {
        Order order1 = new Order("12345", 100, PaymentMethod.CREDIT_CARD);
        System.out.println(order1);

        order1.advanceStatus();
        System.out.println("Updated Order1: " + order1);
        order1.advanceStatus();
        System.out.println("Updated Order1: " + order1);
        System.out.println("Total with fees: " + order1.totalWithFees());
    }
}
