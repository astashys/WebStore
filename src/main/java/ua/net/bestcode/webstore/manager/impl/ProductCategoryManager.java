package ua.net.bestcode.webstore.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.net.bestcode.webstore.dao.impl.ProductCategoryDAO;
import ua.net.bestcode.webstore.manager.IProductCategoryManager;
import ua.net.bestcode.webstore.model.ProductCategory;

/**
 * Created by petroborovets on 12/20/15.
 */
@Service
@Transactional
public class ProductCategoryManager implements IProductCategoryManager {

    @Autowired
    ProductCategoryDAO productCategoryDAO;

    @Override
    public ProductCategory findProductCategory(Integer id) {
        return productCategoryDAO.findByPk(id);
    }

    @Override
    public ProductCategory createProductCategory(ProductCategory data) {
        productCategoryDAO.persist(data);
        return data;
    }

    @Override
    public ProductCategory updateProductCategory(ProductCategory data) {
        productCategoryDAO.update(data);
        return data;
    }

    @Override
    public void deleteProductCategory(ProductCategory data) {
        productCategoryDAO.remove(data);
    }
}
