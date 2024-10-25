package hw4;

import java.util.List;
import java.util.ArrayList;
import hw4.product.Product;

/**
 * The ProductCatalog class represents a catalog of products
 * 
 * @author Haoming Bai
 * @version 1.0
 */
public class ProductCatalog {
    List<Product> products;

    /**
     * Create a new ProductCatalog object, with the given products
     * 
     * @param products The products of this catalog
     */
    public ProductCatalog(List<Product> products) {
        this.products = products;
    }

    /**
     * Copy constructor, which creates a new ProductCatalog object that is a copy of
     * the
     * given
     * 
     * @param catalog The catalog to be copied
     */
    public ProductCatalog(ProductCatalog catalog) {
        this.products = new ArrayList<Product>(catalog.products);
    }

    /**
     * Constructor with no arguments
     */
    public ProductCatalog() {
        this.products = new ArrayList<Product>();
    }

    /**
     * Add the given product to the list
     * 
     * @param product The product to be added
     */
    public void addProduct(Product product) {
        boolean productExists = false;
        for (Product existingProduct : products) {
            if (existingProduct.getCode().equals(product.getCode())) {
                productExists = true;
                break;
            }
        }
        if (!productExists) {
            products.add(product);
        }
    }

    /**
     * Remove the given product from the list
     * 
     * @param product The product to be removed
     */
    public void removeProduct(Product product) {
        for (Product existingProduct : products) {
            if (existingProduct.getCode().equals(product.getCode())) {
                products.remove(product);
                return;
            }
        }
        throw new IllegalArgumentException("The product does not exist");
    }

    /**
     * Get the product with the given code
     * 
     * @param code The code of the product
     * @return the product with the given code
     */
    public Product getProduct(String code) {
        for (Product product : products) {
            if (product.getCode().equals(code)) {
                return product;
            }
        }
        throw new IllegalArgumentException("The product does not exist");
    }

    /**
     * Get the product at the given index
     * 
     * @param index The index of the product
     * @return the product at the given index
     */
    public Product getProduct(int index) {
        return products.get(index);
    }

    /**
     * Get the number of products
     * 
     * @return the number of products
     */
    public int getNumberOfProducts() {
        return products.size();
    }

    /**
     * Convert the object to a string
     */
    public String toString() {
        String result = "";
        for (Product product : products) {
            result += product.toString() + "\n";
        }
        return result;
    }
}
