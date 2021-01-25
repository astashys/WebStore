package ua.net.bestcode.webstore.manager.util;

import ua.net.bestcode.webstore.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by petroborovets on 12/20/15.
 */
public class ProductList {
    List<Product> products = new ArrayList<Product>();

    public ProductList(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
