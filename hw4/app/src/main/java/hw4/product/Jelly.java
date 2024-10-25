package hw4.product;

import java.util.Date;

import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;

/**
 * This class represents a jelly product
 * 
 * @author Haoming Bai
 * @version 1.0
 */
public class Jelly extends Product {
    // Members
    private String flavor;

    // Constructor
    /**
     * Create a new Jelly object, with the given code, description, price,
     * production date, shelf life, and flavor
     * 
     * @param code           The code of this jelly
     * @param description    The description of this jelly
     * @param price          The price of this jelly
     * @param productionDate The production date of this jelly
     * @param shelfLife      The shelf life of this jelly
     * @param flavor         The flavor of this jelly
     */
    public Jelly(String code, String description, double price, Date productionDate, String shelfLife, String flavor) {
        super(code, description, price, productionDate, shelfLife);
        this.flavor = flavor;
    }

    /**
     * Copy constructor, which creates a new Jelly object that is a copy of the
     * given
     * 
     * @param product The product to be copied
     */
    public Jelly(Jelly product) {
        super(product);
        this.flavor = product.flavor;
    }

    // Methods
    /**
     * Get the flavor of this jelly
     * 
     * @return the flavor of this jelly
     */
    public String getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return super.toString() + "Flavor: " + flavor + "\n";
    }
}
