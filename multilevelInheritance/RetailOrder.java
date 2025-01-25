package multilevelInheritance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void trackingDetails() {
        System.out.println("Order Details: ");
        System.out.println("OrderId: " + orderId);
        System.out.println("Order date: " + orderDate);
    }
}

class ShippedOrder extends Order {
    private String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void trackingDetails() {
        System.out.println("Order has shipped: \n");
        super.trackingDetails();
        System.out.println("Tracking number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void trackingDetails() {
        System.out.println("Order has Delivered: \n");
        super.trackingDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class RetailOrder {
    public static void main(String[] args) {
        // Date formatter for "yyyy/MM/dd" pattern (date only, no time)
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Get the current date and the date 3 days later
        LocalDate now = LocalDate.now();
        LocalDate futureDate = now.plusDays(3);

        // Create string representations of the dates
        String date = dtf.format(now);  // Format the LocalDate to String
        String deliveryDate = dtf.format(futureDate);  // Format the future date to String

        // Create Order, ShippedOrder, and DeliveredOrder objects
        Order o = new Order("1000232AL2", date);
        ShippedOrder so = new ShippedOrder("1000232AL2", date, "236632785478235");
        DeliveredOrder dlo = new DeliveredOrder("1000232AL2", date, "236632785478235", deliveryDate);

        // Call trackingDetails() on each order
        o.trackingDetails();
        so.trackingDetails();
        dlo.trackingDetails();
    }
}
