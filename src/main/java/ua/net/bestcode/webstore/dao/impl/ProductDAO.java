package ua.net.bestcode.webstore.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import ua.net.bestcode.webstore.dao.GenericDAO;
import ua.net.bestcode.webstore.dao.IProductDAO;
import ua.net.bestcode.webstore.manager.util.ProductList;
import ua.net.bestcode.webstore.model.Product;
import ua.net.bestcode.webstore.model.ProductCategory;

/**
 * Created by petroborovets on 12/20/15.
 */
@Repository
public class ProductDAO extends GenericDAO<Product> implements IProductDAO {
    @Override
    public ProductList findProductByCategory(Integer productCategoryId) {
        Query query = currentSession().createQuery("from Product where productCategory =: productCategoryId");
        query.setParameter("productCategoryId", productCategoryId);
        return new ProductList(query.list());
    }
}
