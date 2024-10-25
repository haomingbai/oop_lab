package hw4.product;

import java.util.Date;

/**
 * This class represents a product
 * 
 * @author Haoming Bai
 * @version 1.0
 */
public class Product {
    // Members
    private String code;
    private String description;
    private double price;
    private Date productionDate;
    private String shelfLife;

    // Constructor
    /**
     * Create a new Product object, with the given code, description, price,
     * production date, and shelf life
     * 
     * @param code           The code of this product
     * @param description    The description of this product
     * @param price          The price of this product
     * @param productionDate The production date of this product
     * @param shelfLife      The shelf life of this product
     */
    public Product(String code, String description, double price, Date productionDate, String shelfLife) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.productionDate = (Date) productionDate.clone();
        this.shelfLife = shelfLife;
    }

    /**
     * Copy constructor, which creates a new Product object that is a copy of the
     * given product.
     * 
     * @param product The product to be copied
     */
    public Product(Product product) {
        this.code = product.code;
        this.description = product.description;
        this.price = product.price;
        this.productionDate = (Date) product.productionDate.clone();
        this.shelfLife = product.shelfLife;
    }

    // Methods
    // This Object is a read-only object
    /**
     * Get the code of this product
     * 
     * @return the code of this product
     */
    public String getCode() {
        return code;
    }

    /**
     * Get the description of this product
     * 
     * @return the description of this product
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get the price of this product
     * 
     * @return the price of this product
     */
    public double getPrice() {
        return price;
    }

    /**
     * Get the production date of this product
     * 
     * @return the production date of this product
     */
    public Date getProductionDate() {
        return (Date) productionDate.clone();
    }

    /**
     * Get the shelf life of this product
     * 
     * @return the shelf life of this product
     */
    public String getShelfLife() {
        return shelfLife;
    }

    /**
     * Convert this object to a string
     * 
     * @return a string representation of this object
     */
    public String toString() {
        return "Code: " + code + "\nDescription: " + description + "\nPrice: " + price + "\nProduction Date: "
                + productionDate + "\nShelf Life: " + shelfLife;
    }
}
