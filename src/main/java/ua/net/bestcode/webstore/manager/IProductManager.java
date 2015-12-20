package ua.net.bestcode.webstore.manager;

import ua.net.bestcode.webstore.manager.util.ProductList;
import ua.net.bestcode.webstore.model.Product;

/**
 * Created by petroborovets on 12/20/15.
 */
public interface IProductManager {
    Product findProduct(Integer id);
    Product createProduct(Product data);
    Product updateProduct(Product data);
    void deleteProduct(Product data);
    ProductList findProductsByCategory(Integer productCategoryId);
}
