package hw4.sales;

import hw4.product.Product;

/**
 * The SaleItem class represents a sale item in the store
 * 
 * @author Haoming Bai
 * @version 1.0
 */
public class SaleItem {
    private int quantity;
    private Product product;

    /**
     * Create a new SaleItem object, with the given quantity and product
     * 
     * @param quantity The quantity of this sale item
     * @param product  The product of this sale item
     */
    public SaleItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    /**
     * Copy constructor, which creates a new SaleItem object that is a copy of the
     * given
     * 
     * @param saleItem The sale item to be copied
     */
    public SaleItem(SaleItem saleItem) {
        this.quantity = saleItem.quantity;
        this.product = saleItem.product;
    }

    /**
     * Get the quantity of this sale item
     * 
     * @return the quantity of this sale item
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Get the product of this sale item
     * 
     * @return the product of this sale item
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Set the quantity of this sale item
     * 
     * @param quantity the quantity of this sale item
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Get the total value of this sale item
     * 
     * @return the total value of this sale item
     */
    public double getValue() {
        double value = product.getPrice();
        value *= quantity;
        return value;
    }
}
