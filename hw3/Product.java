import java.util.Date;

class Product {
    // Member variables
    private String code;
    private String description;
    private double price;
    private Date productionDate;
    private String shelfLife;

    // Constructor
    /**
     * The default constructor.
     * 
     * @param code           The product code.
     * @param description    The product description.
     * @param price          The product price.
     * @param productionDate The product production date.
     * @param shelfLife      The product shelf life.
     */
    public Product(String code, String description, double price, Date productionDate, String shelfLife) {
        this.code = new String(code);
        this.description = new String(description);
        this.price = price;
        this.productionDate = new Date(productionDate.getTime());
        this.shelfLife = new String(shelfLife);
    }

    /**
     * The copy constructor.
     * 
     * @param product The product object.
     */
    public Product(Product product) {
        this.code = new String(product.code);
        this.description = new String(product.description);
        this.price = product.price;
        this.productionDate = new Date(product.productionDate.getTime());
        this.shelfLife = new String(product.shelfLife);
    }

    // Methods
    /**
     * Get the product code.
     * 
     * @return The product code.
     */
    public String getCode() {
        return new String(code);
    }

    /**
     * Get the product description.
     * 
     * @return The product description.
     */
    public String getDescription() {
        return new String(description);
    }

    /**
     * Get the product price.
     * 
     * @return The product price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Get the product production date.
     * 
     * @return The product production date.
     */
    public Date getProductionDate() {
        return new Date(productionDate.getTime());
    }

    /**
     * Get the product shelf life.
     * 
     * @return The product shelf life.
     */
    public String getShelfLife() {
        return new String(shelfLife);
    }

    /**
     * Set the product code.
     * 
     * @param code The product code.
     */
    public void equals(Product product) {
        if (this.code.equals(product.code) && this.description.equals(product.description)
                && this.price == product.price
                && this.productionDate.equals(product.productionDate) && this.shelfLife.equals(product.shelfLife)) {
            System.out.println("Both products are equal.");
        } else {
            System.out.println("Both products are not equal.");
        }
    }

    /**
     * Set the product code.
     * 
     * @param code The product code.
     */
    public String toString() {
        return "Code: " + code + "\nDescription: " + description + "\nPrice: " + price + "\nProduction Date: "
                + productionDate + "\nShelf Life: " + shelfLife;
    }

    public static void main(String[] args) {
        Product product1 = new Product("P001", "Product 1", 100.0, new Date(), "1 year");
        Product product2 = new Product(product1);
        product1.equals(product2);
        System.out.println(product1.toString());
    }
}