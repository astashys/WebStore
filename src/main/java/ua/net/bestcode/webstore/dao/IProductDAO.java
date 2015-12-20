package ua.net.bestcode.webstore.dao;

import ua.net.bestcode.webstore.manager.util.ProductList;
import ua.net.bestcode.webstore.model.Product;
import ua.net.bestcode.webstore.model.ProductCategory;

/**
 * Created by petroborovets on 12/20/15.
 */
public interface IProductDAO extends IGenericDAO<Product> {
    ProductList findProductByCategory(Integer productCategoryId);
}
