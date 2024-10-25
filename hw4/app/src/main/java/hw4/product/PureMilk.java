package hw4.product;

import java.util.Date;

/**
 * This class represents a pure milk product
 * 
 * @author Haoming Bai
 * @version 1.0
 */
public class PureMilk extends Product {
    private String countryOfOrigin;
    private String butterfat;
    private String protein;

    /**
     * Create a new PureMilk object, with the given code, description, price,
     * 
     * @param code            The code of this product
     * @param description     The description of this product
     * @param price           The price of this product
     * @param productionDate  The production date of this product
     * @param shelfLife       The shelf life of this product
     * @param countryOfOrigin The country of origin of this product
     * @param butterfat       The butterfat of this product
     * @param protein         The protein of this product
     */
    public PureMilk(String code, String description, double price, Date productionDate, String shelfLife,
            String countryOfOrigin, String butterfat, String protein) {
        super(code, description, price, productionDate, shelfLife);
        this.countryOfOrigin = countryOfOrigin;
        this.butterfat = butterfat;
        this.protein = protein;
    }

    /**
     * Copy constructor, which creates a new PureMilk object that is a copy of the
     * 
     * @param product The product to be copied
     */
    public PureMilk(PureMilk product) {
        super(product);
        this.countryOfOrigin = product.countryOfOrigin;
        this.butterfat = product.butterfat;
        this.protein = product.protein;
    }

    /**
     * Get the country of origin of this product
     * 
     * @return the country of origin of this product
     */
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Get the butterfat of this product
     * 
     * @return the butterfat of this product
     */
    public String getButterfat() {
        return butterfat;
    }

    /**
     * Get the protein of this product
     * 
     * @return the protein of this product
     */
    public String getProtein() {
        return protein;
    }
}
