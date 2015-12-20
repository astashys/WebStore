package ua.net.bestcode.webstore.manager;

import ua.net.bestcode.webstore.model.ProductCategory;

/**
 * Created by petroborovets on 12/20/15.
 */
public interface IProductCategoryManager {
    ProductCategory findProductCategory(Integer id);
    ProductCategory createProductCategory(ProductCategory data);
    ProductCategory updateProductCategory(ProductCategory data);
    void deleteProductCategory(ProductCategory data);
}
