package hw4.product;

import java.util.Date;

/**
 * This class represents a milk drink product
 * @author Haoming Bai
 * @version 1.0
 */
public class MilkDrink extends Product {
    // Members
    private String flavor;
    private String sugar;

    // Constructor
    /**
     * Create a new MilkDrink object, with the given code, description, price,
     * production date, shelf life, flavor, and sugar
     * 
     * @param code           The code of this milk drink
     * @param description    The description of this milk drink
     * @param price          The price of this milk drink
     * @param productionDate The production date of this milk drink
     * @param shelfLife      The shelf life of this milk drink
     * @param flavor         The flavor of this milk drink
     * @param sugar          The sugar of this milk drink
     */
    public MilkDrink(String code, String description, double price, Date productionDate, String shelfLife,
            String flavor,
            String sugar) {
        super(code, description, price, productionDate, shelfLife);
        this.flavor = flavor;
        this.sugar = sugar;
    }

    /**
     * Copy constructor, which creates a new MilkDrink object that is a copy of the
     * given
     * 
     * @param product The product to be copied
     */
    public MilkDrink(MilkDrink product) {
        super(product);
        this.flavor = product.flavor;
        this.sugar = product.sugar;
    }

    // Methods
    /**
     * Get the flavor of this milk drink
     * 
     * @return the flavor of this milk drink
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Get the sugar of this milk drink
     * 
     * @return the sugar of this milk drink
     */
    public String getSugar() {
        return sugar;
    }

    @Override
    public String toString() {
        return super.toString() + "Flavor: " + flavor + "\n" + "Sugar: " + sugar + "\n";
    }
}
