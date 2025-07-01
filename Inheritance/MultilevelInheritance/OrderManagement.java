class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped. Tracking Number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order("ORD001", "2025-06-30");
        ShippedOrder shipped = new ShippedOrder("ORD002", "2025-06-29", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder("ORD003", "2025-06-28", "TRK67890", "2025-07-01");

        System.out.println("Order Status: " + order.getOrderStatus());
        System.out.println("Shipped Status: " + shipped.getOrderStatus());
        System.out.println("Delivered Status: " + delivered.getOrderStatus());
    }
}
