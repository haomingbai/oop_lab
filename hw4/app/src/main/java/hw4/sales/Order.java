package hw4.sales;

import java.util.List;

import hw4.product.Product;

import java.util.ArrayList;

/**
 * The Order class represents an order of sale items
 * @author Haoming Bai
 * @version 1.0
 */
public class Order {
    private List<SaleItem> saleItems;

    /**
     * Create a new Order object, with the given sale items
     * 
     * @param saleItems The sale items of this order
     */
    public Order(List<SaleItem> saleItems) {
        this.saleItems = saleItems;
    }

    /**
     * Copy constructor, which creates a new Order object that is a copy of the
     * given
     * 
     * @param order The order to be copied
     */
    public Order(Order order) {
        this.saleItems = order.saleItems;
    }

    /**
     * Constructor with no arguments
     * 
     */
    public Order() {
        this.saleItems = new ArrayList<SaleItem>();
    }

    /**
     * Get the sale items of this order
     * 
     * @param saleItem The sale item to be added
     */
    public void addSaleItem(SaleItem saleItem) {
        // Check if the product is already in the list
        for (SaleItem item : saleItems) {
            // If the product is in the list, add the quantity
            if (item.getProduct().getCode().equals(saleItem.getProduct().getCode())) {
                item.setQuantity(item.getQuantity() + saleItem.getQuantity());
                return;
            }
        }
        // If the product is not in the list, add it
        saleItems.add(saleItem);
    }

    /**
     * Remove the given sale item from the list
     * 
     * @param saleItem The sale item to be removed
     * @throws IllegalArgumentException if the sale item is not in the list
     */
    public void removeSaleItem(SaleItem saleItem) {
        for (SaleItem item : saleItems) {
            if (item.getProduct().getCode().equals(saleItem.getProduct().getCode())
                    && item.getQuantity() == saleItem.getQuantity()) {
                saleItems.remove(item);
                return;
            }
        }
        throw new IllegalArgumentException("The sale item is not in the list");
    }

    /**
     * Get the sale items of this order
     * 
     * @param product The product to be searched
     * @return the sale item of this order
     * @throws IllegalArgumentException if the sale item with the given product is
     *                                  not in the list
     */
    public SaleItem getSaleItem(Product product) {
        for (SaleItem item : saleItems) {
            if (item.getProduct().getCode().equals(product.getCode())) {
                return item;
            }
        }
        throw new IllegalArgumentException("The sale item with the given product is not in the list");
    }

    /**
     * Get the sale items of this order
     * 
     * @param index The index of the sale item
     * @return the sale item of this order
     */
    public SaleItem getSaleItem(int index) {
        return saleItems.get(index);
    }

    /**
     * Get the number of sale items of this order
     * 
     * @return the unmber of the sale items of this order
     */
    public int getNumberOfSaleItems() {
        return saleItems.size();
    }

    /**
     * Get the total cost of this order
     * 
     * @return the total cost of this order
     */
    public double getTotalCost() {
        double totalCost = 0;
        for (SaleItem item : saleItems) {
            totalCost += item.getValue();
        }
        return totalCost;
    }

    /**
     * Convert this order to a string
     */
    public String toString() {
        String result = "";
        for (SaleItem item : saleItems) {
            result += item.getProduct().getCode() + " " + item.getProduct().getDescription() + " " + item.getQuantity()
                    + " " + item.getProduct().getPrice() + " " + item.getValue() + "\n";
        }
        return result;
    }
}
