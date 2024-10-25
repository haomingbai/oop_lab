package hw4.product;

import java.util.Date;

/**
 * This class represents a yogurt product
 * 
 * @author Haoming Bai
 * @version 1.0
 */
public class Yogurt extends Product {
    // Members
    private String type;
    private String dilluteConcentration;

    // Constructor
    /**
     * Create a new Yogurt object, with the given code, description, price,
     * production date, shelf life, type, and dillute concentration
     * 
     * @param code                 The code of this yogurt
     * @param description          The description of this yogurt
     * @param price                The price of this yogurt
     * @param productionDate       The production date of this yogurt
     * @param shelfLife            The shelf life of this yogurt
     * @param type                 The type of this yogurt
     * @param dilluteConcentration The dillute concentration of this yogurt
     */
    public Yogurt(String code, String description, double price, Date productionDate, String shelfLife, String type,
            String dilluteConcentration) {
        super(code, description, price, productionDate, shelfLife);
        this.type = type;
        this.dilluteConcentration = dilluteConcentration;
    }

    /**
     * Copy constructor, which creates a new Yogurt object that is a copy of the
     * given
     * 
     * @param product The product to be copied
     */
    public Yogurt(Yogurt product) {
        super(product);
        this.type = product.type;
        this.dilluteConcentration = product.dilluteConcentration;
    }

    // Methods
    /**
     * Get the type of this yogurt
     * 
     * @return the type of this yogurt
     */
    public String getType() {
        return type;
    }

    /**
     * Get the dillute concentration of this yogurt
     * 
     * @return the dillute concentration of this yogurt
     */
    public String getDilluteConcentration() {
        return dilluteConcentration;
    }

    @Override
    public String toString() {
        return super.toString() + " Type: " + type + " Dillute Concentration: " + dilluteConcentration;
    }
}
