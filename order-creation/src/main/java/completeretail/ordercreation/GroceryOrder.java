package completeretail.ordercreation;


import java.time.LocalDateTime;
import java.util.List;

public class GroceryOrder {

    private String orderId;
    private String customerId;
    private LocalDateTime orderDate;
    private List<GroceryItem> items;
    private double totalAmount;

    public GroceryOrder() {
    }

    public GroceryOrder(String orderId, String customerId, LocalDateTime orderDate,
                        List<GroceryItem> items, double totalAmount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.items = items;
        this.totalAmount = totalAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public List<GroceryItem> getItems() {
        return items;
    }

    public void setItems(List<GroceryItem> items) {
        this.items = items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}


