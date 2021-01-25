package ua.net.bestcode.webstore.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.net.bestcode.webstore.dao.impl.ProductDAO;
import ua.net.bestcode.webstore.manager.IProductManager;
import ua.net.bestcode.webstore.manager.util.ProductList;
import ua.net.bestcode.webstore.model.Product;

/**
 * Created by petroborovets on 12/20/15.
 */
@Service
@Transactional
public class ProductManager implements IProductManager {

    @Autowired
    ProductDAO productDAO;

    @Override
    public Product findProduct(Integer id) {
        return productDAO.findByPk(id);
    }

    @Override
    public Product createProduct(Product data) {
        productDAO.persist(data);
        return data;
    }

    @Override
    public Product updateProduct(Product data) {
        productDAO.update(data);
        return data;
    }

    @Override
    public void deleteProduct(Product data) {
        productDAO.remove(data);
    }

    @Override
    public ProductList findProductsByCategory(Integer productCategoryId) {
        return productDAO.findProductByCategory(productCategoryId);
    }
}
