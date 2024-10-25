package hw4.sales;

import java.util.List;
import java.util.ArrayList;

/**
 * The StoreSales class represents the sales of a store
 * 
 * @author Haoming Bai
 * @version 1.0
 */
public class StoreSales {
    private List<Order> orders;

    // Constructor
    /**
     * Create a new StoreSales object, with the given orders
     * 
     * @param orders The orders of this store sales
     */
    public StoreSales(List<Order> orders) {
        this.orders = orders;
    }

    /**
     * Copy constructor, which creates a new StoreSales object that is a copy of the
     * given
     * 
     * @param storeSales The store sales to be copied
     */
    public StoreSales(StoreSales storeSales) {
        this.orders = storeSales.orders;
    }

    /**
     * Constructor with no arguments
     */
    public StoreSales() {
        this.orders = new ArrayList<Order>();
    }

    // Methods
    /**
     * Add the given order to the list
     * 
     * @param order The order to be added
     */
    public void addOrder(Order order) {
        orders.add(order);
    }

    /**
     * Remove the given order from the list
     * 
     * @param order The order to be removed
     */
    public void removeOrder(Order order) {
        for (Order itOrder : orders) {
            if (itOrder.equals(order)) {
                orders.remove(order);
                return;
            }
        }
        throw new IllegalArgumentException("The order does not exist");
    }

    /**
     * Get the order at the given index
     * 
     * @param index The index of the order
     * @return the order at the given index
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    public Order getOrder(int index) {
        return orders.get(index);
    }

    /**
     * Get the number of orders
     * 
     * @return the number of orders
     */
    public int getNumberOfOrders() {
        return orders.size();
    }

    /**
     * Convert the store sales to a string
     */
    public String toString() {
        String result = "";
        for (Order order : orders) {
            result += order.toString() + "\n";
        }
        return result;
    }
}
